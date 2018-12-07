package com.z2wenfa.sort;

import com.z2wenfa.base.ISortArithmetic;

public class MergeSort extends ISortArithmetic {
    @Override
    public void sort() {
        megerSort(arrs);
    }

    @Override
    public String getArithmeticName() {
        return "归并排序";
    }

    private void megerSort(int[] arrs) {
        sort(arrs, 0, arrs.length - 1);
    }

    private void sort(int[] arrs, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(arrs, low, mid);
            sort(arrs, mid + 1, high);
            merge(arrs, low, mid, high);
        }
    }

    private void merge(int[] arrs, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (arrs[i] < arrs[j]) {
                temp[k++] = arrs[i++];
            } else {
                temp[k++] = arrs[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arrs[i++];
        }

        while (j <= high) {
            temp[k++] = arrs[j++];
        }

        k = 0;
        while (low <= high) {
            arrs[low++] = temp[k++];
        }
    }
}
