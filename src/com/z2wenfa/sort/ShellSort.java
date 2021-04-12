package com.z2wenfa.sort;

import com.z2wenfa.base.ISortArithmetic;
import com.z2wenfa.util.ArrUtil;

public class ShellSort extends ISortArithmetic {

    public static void main(String[] args) {
        new ShellSort().execute();
    }

    @Override
    public void sort() {
        shellSortTest(arrs);
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
                    if (arrs[j] < arrs[j - increment]) ArrUtil.exchangeArrValue(arrs, j, j - increment);
                }
            }
            increment = increment / 2;
        }
    }

    private void shellSortTest(int[] arrs) {
        if (arrs == null || arrs.length <= 1) return;
        int increment = arrs.length / 2;
        while (increment >= 1) {
            for (int i = 0; i < arrs.length; i++) {
                for (int j = i + increment; j < arrs.length; j = j + increment) {
                    if (arrs[j] < arrs[j - increment]) ArrUtil.exchangeArrValue(arrs, j, j - increment);
                }
            }
            increment = increment/ 2;
        }
    }
}
