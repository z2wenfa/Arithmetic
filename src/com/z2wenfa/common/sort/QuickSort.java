package com.z2wenfa.common.sort;

import com.z2wenfa.common.base.ISortArithmetic;
import com.z2wenfa.common.util.ArrUtil;

public class QuickSort extends ISortArithmetic {

    public static void main(String[] args) {
        new QuickSort().execute();
    }

    @Override
    public void sort() {
        quickSort(arrs, 0, arrs.length - 1);
    }

    @Override
    public String getArithmeticName() {
        return "快速排序";
    }

    private void quickSort(int[] arrs, int left, int right) {
        int l = left;
        int r = right;
        int privot = arrs[left];
        if (l > r) return;
        while (l != r) {
            while (r > l && arrs[r] >= privot) r--;
            if (arrs[r] < privot) ArrUtil.exchangeArrValue(arrs, l, r);
            while (l < r && arrs[l] <= privot) l++;
            if (arrs[l] > privot) ArrUtil.exchangeArrValue(arrs, l, r);
        }
        if (l > left) quickSort(arrs, left, l - 1);
        if (r < right) quickSort(arrs, r + 1, right);
    }

}
