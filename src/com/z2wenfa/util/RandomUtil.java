package com.z2wenfa.util;

import java.util.Random;

public class RandomUtil {

    private static final int ARRAY_SIZE = 20;

    /**
     * 获取20个随机数的数组
     */
    public static int[] getRandomArrays() {
        Random random = new Random();
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(2000);
        }
        return array;
    }

    /**
     * 获取有序的随机数组
     * @return
     */
    public static int[] getSerialArrays() {
        Random random = new Random();
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = random.nextInt(9) + i * 50;
        }

        return array;
    }


}
