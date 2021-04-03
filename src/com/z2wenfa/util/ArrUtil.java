package com.z2wenfa.util;

public class ArrUtil {

    /**
     * 交换数组两个索引的值
     */
    public static void exchangeArrValue(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
