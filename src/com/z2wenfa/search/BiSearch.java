package com.z2wenfa.search;

import com.z2wenfa.base.ISearchArithmetic;

/**
 * 前提是序列有序
 */
public class BiSearch extends ISearchArithmetic {
    @Override
    public String getArithmeticName() {
        return "二分查找";
    }

    @Override
    public int search(int searchValue) {
        return biSearch(arrs, searchValue, 0, arrs.length);
    }

    private int biSearch(int[] arrs, int searchValue, int low, int high) {
        if (high > low) {
            int middle = (high - low) / 2;
            if (arrs[middle] == searchValue) {
                return middle + 1;
            } else if (arrs[middle] < searchValue) {
                return biSearch(arrs, searchValue, middle + 1, high);
            } else {
                return biSearch(arrs, searchValue, low, middle - 1);
            }
        }
        return -1;
    }
}