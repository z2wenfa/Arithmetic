package com.z2wenfa.common.sort;

import com.z2wenfa.common.base.ISortArithmetic;
import com.z2wenfa.common.util.ArrUtil;

public class ShellSort extends ISortArithmetic {

    public static void main(String[] args) {
        new ShellSort().execute();
    }

    @Override
    public void sort() {
        shellSort(arrs);
    }

    @Override
    public String getArithmeticName() {
        return "希尔排序";
    }

    private void shellSort(int[] arrs) {
        if (ArrUtil.checkArrayInValid(arrs)) return;
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

}
