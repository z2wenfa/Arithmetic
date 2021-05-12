package com.z2wenfa.common.sort;

import com.z2wenfa.common.base.ISortArithmetic;

public class BubbleSort extends ISortArithmetic {

    public static void main(String[] args) {
        new BubbleSort().execute();
    }

    @Override
    protected void sort() {
        bubbleSort(arrs);
    }

    @Override
    protected String getArithmeticName() {
        return "冒泡排序";
    }

    private void bubbleSort(int[] arrs) {
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = 0; j < arrs.length - 1 - i; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int temp = arrs[j + 1];
                    arrs[j + 1] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
    }
}
