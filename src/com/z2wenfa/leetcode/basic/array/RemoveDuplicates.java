package com.z2wenfa.leetcode.basic.array;

/**
 * (初级算法)删除排序数组中的重复项
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] arrs = new int[]{1, 2, 2, 3, 4, 4, 4, 5};
        int length = new RemoveDuplicates().removeDuplicates(arrs);
        for (int i = 0; i < length ; i++) {
            System.out.println(arrs[i]);
        }
    }

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int left = 0;
        for (int right = 1; right < nums.length ; right++) {
            if (nums[left] != nums[right]) {
                left = left + 1;
                nums[left] = nums[right];
            }
        }
        return ++left;
    }
}
