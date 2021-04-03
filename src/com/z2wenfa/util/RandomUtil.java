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
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(100) + i * 100;
        }
        return array;
    }


}
