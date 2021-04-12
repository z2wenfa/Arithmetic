package com.z2wenfa.sort;

import com.z2wenfa.base.ISortArithmetic;
import com.z2wenfa.util.ArrUtil;

public class InsertionSort extends ISortArithmetic {

    public static void main(String[] args) {
        new InsertionSort().execute();
    }

    @Override
    public void sort() {
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
                ArrUtil.exchangeArrValue(arrs, j, j - 1);
                j--;
            }
        }
    }

    private void insertionSortTest(int arrs[]) {
        for (int i = 1; i < arrs.length; i++) {
            int j = i;
            while (j > 0 && arrs[j] < arrs[j - 1]) {
                ArrUtil.exchangeArrValue(arrs, j, j - 1);
                j--;
            }
        }
    }


}
