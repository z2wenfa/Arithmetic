package com.z2wenfa.search;

import com.z2wenfa.base.ISearchArithmetic;

public class SequenceSearch extends ISearchArithmetic {

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
