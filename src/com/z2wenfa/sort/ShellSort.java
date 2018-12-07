package com.z2wenfa.sort;

import com.z2wenfa.base.ISortArithmetic;

public class ShellSort extends ISortArithmetic {

    @Override
    public void sort() {
        shellSort(arrs);
    }

    @Override
    public String getArithmeticName() {
        return "希尔排序";
    }

    private void shellSort(int[] arrs) {
        if (arrs == null || arrs.length <= 1) return;
        int increment = arrs.length / 2;
        while (increment >= 1) {
            for (int i = 0; i < arrs.length; i++) {
                for (int j = i + increment; j < arrs.length; j = j + increment) {
                    if (arrs[j] < arrs[j - increment]) {
                        int temp = arrs[j];
                        arrs[j] = arrs[j - increment];
                        arrs[j - increment] = temp;
                    }
                }
            }
            increment = increment / 2;
        }

    }
}
