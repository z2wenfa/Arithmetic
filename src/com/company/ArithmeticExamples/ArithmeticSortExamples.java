package com.company.ArithmeticExamples;

public class ArithmeticSortExamples {

    /**
     * 冒泡排序
     *
     * @return
     */
    public static void bubbleSort(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int temp = arrays[j + 1];
                    arrays[j + 1] = arrays[j];
                    arrays[j] = temp;
                }
            }
        }
    }

    


}
