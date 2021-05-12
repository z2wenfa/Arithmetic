package com.z2wenfa.common.search;

import com.z2wenfa.common.base.ISearchArithmetic;

/**
 * 插值查找 有序队列
 */
public class InsertValueSearch extends ISearchArithmetic {

    public static void main(String[] args) {
        new InsertValueSearch().execute();
    }

    @Override
    public String getArithmeticName() {
        return "插值查找";
    }

    @Override
    public int search(int searchValue) {
        return insertValueSearch(arrs, searchValue, 0, arrs.length - 1);
    }


    private int insertValueSearch(int[] arrs, int searchValue, int low, int high) {
        if (low > high || searchValue < arrs[low] || searchValue > arrs[high]) return -1;
        int mid = low + (high - low) * ((searchValue - arrs[low]) / (arrs[high] - arrs[low]));
        int midValue = arrs[mid];
        if (midValue > searchValue) {
            return insertValueSearch(arrs, searchValue, low, mid - 1);
        } else if (midValue < searchValue) {
            return insertValueSearch(arrs, searchValue, mid + 1, high);
        }
        return mid;
    }
}
