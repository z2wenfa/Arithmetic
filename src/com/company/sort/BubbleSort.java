package com.company.sort;

import com.company.IArithmetic;

public class BubbleSort extends IArithmetic {

    @Override
    public void run() {
        bubbleSort(arrs);
    }

    @Override
    public String getArithmeticName() {
        return "冒泡排序";
    }


    private void bubbleSort(int[] arrs) {
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = 0; j < arrs.length - 1 - i; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int temp = arrs[j + 1];
                    arrs[j + 1] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
    }

}
