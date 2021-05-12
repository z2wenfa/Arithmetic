package com.z2wenfa.common.util;

/**
 * 打印工具类
 */
public class PrintUtil {

    /**
     * 打印数组信息
     *
     * @param arrs
     */
    public static void printArray(int[] arrs) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int arr : arrs) {
            stringBuilder.append(arr).append(",");
        }
        System.out.println(stringBuilder.toString());
    }
}
