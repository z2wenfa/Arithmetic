package com.z2wenfa;

import com.z2wenfa.base.ISearchArithmetic;
import com.z2wenfa.base.ISortArithmetic;
import com.z2wenfa.search.SequenceSearch;
import com.z2wenfa.sort.*;

import java.util.Random;

public class Main {

    static Class<ISortArithmetic>[] sortArrs = new Class[]{BubbleSort.class, QuickSort.class, SelectionSort.class,
            InsertionSort.class, ShellSort.class, MergeSort.class};

    static Class<ISearchArithmetic>[] searchArrs = new Class[]{SequenceSearch.class};

    public static void main(String[] args) {
//        testSort();
        testSearch();
    }

    private static void testSearch() {
        Random random = new Random();
        int[] array = new int[20];
        for (Class<ISearchArithmetic> search : searchArrs) {
            for (int i = 0; i < 20; i++) {
                array[i] = random.nextInt(10000);
            }
            try {
                ISearchArithmetic arithmetic = search.newInstance();
                arithmetic.searchAndPrint(array);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void testSort() {
        Random random = new Random();
        int[] array = new int[20];
        for (Class<ISortArithmetic> sort : sortArrs) {
            try {
                for (int i = 0; i < 20; i++) {
                    array[i] = random.nextInt(10000);
                }
                ISortArithmetic arithmetic = sort.newInstance();
                arithmetic.sortAndPrint(array);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
