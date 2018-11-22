package com.company.ArithmeticExamples;

public class ArithmeticSortExamples {

    /**
     * 冒泡排序
     *
     * @return
     */
    public static void bubbleSort(int[] arrs) {
        for (int i = 0; i < arrs.length - 1; i++) {
            for (int j = 0; j < arrs.length - 1 - i; j++) {
                if (arrs[j] > arrs[j + 1]) {
                    int temp = arrs[j + 1];
                    arrs[j + 1] = arrs[j];
                    arrs[j] = temp;
                }
            }
        }
    }

    /**
     * 快速排序
     *
     * @param arrs
     * @param _left
     * @param _right
     */
    public static void quickSort(int[] arrs, int _left, int _right) {
        int left = _left;
        int right = _right;
        int key = arrs[left];
        if (left <= right) {
            while (left != right) {
                while (right > left && arrs[right] >= key)
                    right--;
                if (arrs[right] < key) {
                    int temp = arrs[left];
                    arrs[left] = arrs[right];
                    arrs[right] = temp;
                }

                while (left < right && arrs[left] <= key)
                    left++;
                if (arrs[left] > key) {
                    int temp = arrs[left];
                    arrs[left] = arrs[right];
                    arrs[right] = temp;
                }
            }
            if (left > _left) quickSort(arrs, _left, left - 1);
            if (right < _right) quickSort(arrs, right + 1, _right);
        }
    }

    /**
     * 选择排序
     */
    public static void selectionSort(int[] arrs) {
        for (int i = 0; i < arrs.length; i++) {
            int lowerIndex = i;
            for (int j = i; j < arrs.length; j++) {
                if(arrs[j]<arrs[lowerIndex]){
                    lowerIndex=j;
                }
            }
            if(lowerIndex!=i){
                int temp=arrs[i];
                arrs[i]=arrs[lowerIndex];
                arrs[lowerIndex]=temp;
            }
        }
    }
}
