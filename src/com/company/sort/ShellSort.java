package com.company.sort;

import com.company.IArithmetic;

public class ShellSort extends IArithmetic {

    @Override
    public void run() {
        shellSort(arrs);
    }

    @Override
    public String getArithmeticName() {
        return "希尔排序";
    }

    private void shellSort(int[] arrs) {
        
    }
}
