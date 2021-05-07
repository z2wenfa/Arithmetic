package com.z2wenfa.base;

import com.z2wenfa.util.RandomUtil;

import java.util.Scanner;

public abstract class ISearchArithmetic {
    protected int[] arrs;

    private StringBuilder stringBuilder = new StringBuilder();

    public abstract String getArithmeticName();

    public abstract int search(int searchValue);

    public void searchAndPrint(int[] arrs) {
        this.arrs = arrs;
        stringBuilder.append("------------------").append(getArithmeticName()).append("----------------").append("\n");
        stringBuilder.append("[");
        for (int arr : arrs) {
            stringBuilder.append(arr).append(" ");
        }
        stringBuilder.append("]").append("\n");
        System.out.println(stringBuilder);
        stringBuilder.delete(0, stringBuilder.length());

        Scanner input = new Scanner(System.in);
        System.out.println("请输入你要查找的数：");
        int searchValue = input.nextInt();
        int result = search(searchValue);
        if (result < 0) {
            System.out.println("数组中不存在该值!");
        } else {
            System.out.println("数组中存在该值,索引位置:" + result);
        }
        stringBuilder.append("------------------").append(getArithmeticName()).append("----------------");
        System.out.println(stringBuilder.toString());
    }

    public void execute() {
        searchAndPrint(RandomUtil.getSerialArrays());
    }
}
