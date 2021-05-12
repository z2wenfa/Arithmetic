package com.z2wenfa.common.sort;

import com.z2wenfa.common.base.ISortArithmetic;

public class SelectionSort extends ISortArithmetic {
    @Override
    public void sort() {
        selectionSort(arrs);
    }

    @Override
    public String getArithmeticName() {
        return "选择排序";
    }

    private static void selectionSort(int[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            int lowerIndex = i;
            for (int j = i; j < arrs.length; j++) {
                if (arrs[j] < arrs[lowerIndex]) {
                    lowerIndex = j;
                }
            }
            if (lowerIndex != i) {
                int temp = arrs[i];
                arrs[i] = arrs[lowerIndex];
                arrs[lowerIndex] = temp;
            }
        }
    }

}
