package com.z2wenfa.common.search;

import com.z2wenfa.common.base.ISearchArithmetic;

/**
 * 顺序查找
 */
public class SequenceSearch extends ISearchArithmetic {

    public static void main(String[] args) {
        new SequenceSearch().execute();
    }

    @Override
    public String getArithmeticName() {
        return "顺序查找";
    }

    @Override
    public int search(int searchValue) {
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] == searchValue) return i;
        }
        return -1;
    }
}
