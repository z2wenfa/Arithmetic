package com.company.sort;

import com.company.IArithmetic;

public class QuickSort extends IArithmetic {

    @Override
    public void run() {
        quickSort(arrs, 0, arrs.length - 1);
    }

    @Override
    public String getArithmeticName() {
        return "快速排序";
    }

    private void quickSort(int[] arrs, int _left, int _right) {
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
}
