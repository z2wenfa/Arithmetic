package com.company;

import com.company.ArithmeticExamples.ArithmeticSortExamples;

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


        //冒泡排序
//        ArithmeticSortExamples.bubbleSort(array);

        //快速排序
        ArithmeticSortExamples.quickSort(array, 0, array.length - 1);


        //选择排序
        ArithmeticSortExamples.selectionSort(array);

        stringBuilder.delete(0, stringBuilder.length());

        for (int i : array) {
            stringBuilder.append(i).append(" ");
        }
        System.out.println("After sort:" + stringBuilder.toString());
    }


}
