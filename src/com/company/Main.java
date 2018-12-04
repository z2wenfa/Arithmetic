package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(10000);
            stringBuilder.append(array[i]).append(" ");
        }
        System.out.println("Before sort:" + stringBuilder.toString());

        stringBuilder.delete(0, stringBuilder.length());

        for (int i : array) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println("After sort:" + stringBuilder.toString());
    }


}
