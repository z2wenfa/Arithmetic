package com.z2wenfa.sort;

import com.z2wenfa.IArithmetic;

public class InsertionSort extends IArithmetic {
    @Override
    public void run() {
        insertionSort(arrs);
    }

    @Override
    public String getArithmeticName() {
        return "插入排序";
    }

    private void insertionSort(int[] arrs) {
        for (int i = 1; i < arrs.length; i++) {
            int j = i;
            while (j > 0 && arrs[j] < arrs[j - 1]) {
                int temp = arrs[j];
                arrs[j] = arrs[j - 1];
                arrs[j - 1] = temp;
                j--;
            }
        }
    }

}
