package com.company;

import com.company.sort.BubbleSort;
import com.company.sort.InsertionSort;
import com.company.sort.QuickSort;
import com.company.sort.SelectionSort;

import java.util.Random;

public class Main {

    static Class<IArithmetic>[] sortArrs = new Class[]{BubbleSort.class, QuickSort.class, SelectionSort.class, InsertionSort.class};

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
