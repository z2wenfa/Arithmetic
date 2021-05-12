package com.z2wenfa.leetcode.basic.array;

/**
 * 股票最大利润
 */
public class MaxProfit {

    public static void main(String[] args) {
        int[] arrs = new int[]{1, 5, 2, 7, 9, 3};
        System.out.println(new MaxProfit().maxProfit(arrs));
    }

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;
        int total = 0, index = 0, length = prices.length;
        while (index < length) {
            while (index < length - 1 && prices[index] >= prices[index + 1]) index++;
            int min = prices[index];
            while (index < length - 1 && prices[index] <= prices[index + 1]) index++;
            total += prices[index++] - min;
        }
        return total;
    }

}
