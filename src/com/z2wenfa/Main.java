package com.z2wenfa;

import com.z2wenfa.sort.*;

import java.util.Random;

public class Main {

    static Class<IArithmetic>[] sortArrs = new Class[]{BubbleSort.class, QuickSort.class, SelectionSort.class, InsertionSort.class, ShellSort.class};

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = random.nextInt(10000);
        }

        for (Class<IArithmetic> sort : sortArrs) {
            try {
                IArithmetic arithmetic = sort.newInstance();
                arithmetic.runAndPrint(array);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
