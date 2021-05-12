package com.z2wenfa.leetcode.basic.array;

import com.z2wenfa.common.util.ArrUtil;
import com.z2wenfa.common.util.PrintUtil;
import com.z2wenfa.common.util.RandomUtil;

//旋转数组
public class Rotate {

    public static void main(String[] args) {
        int[] arr = RandomUtil.getSerialArrays();
        PrintUtil.printArray(arr);
        new Rotate().rotate(arr, 2);
        PrintUtil.printArray(arr);
    }

    public void rotate(int[] nums, int k) {
        if (k < 0 || nums == null || nums.length == 0) return;
        int length = nums.length;
        k %= length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end ) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }

}
