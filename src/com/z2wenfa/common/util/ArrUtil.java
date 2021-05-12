package com.z2wenfa.common.util;

public class ArrUtil {

    /**
     * 交换数组两个索引的值
     */
    public static void exchangeArrValue(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    /**
     * 判断数组是否有效
     */
    public static boolean checkArrayInValid(int[] arrs) {
        return arrs == null || arrs.length < 1;
    }
}
