package com.z2wenfa.base;

import com.z2wenfa.util.RandomUtil;

public abstract class ISortArithmetic {

    protected int[] arrs;
    private StringBuilder stringBuilder = new StringBuilder();

    protected abstract void sort();

    protected abstract String getArithmeticName();

    public void sortAndPrint(int[] arrs) {
        this.arrs = arrs;
        stringBuilder.append("------------").append(getArithmeticName()).append("------------").append("\n");
        stringBuilder.append("初始数据:[");
        for (int arr : arrs) {
            stringBuilder.append(arr).append(" ");
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());
        long startTime = System.currentTimeMillis();
        sort();
        long executedTime = System.currentTimeMillis()-startTime;
        stringBuilder.delete(0, stringBuilder.length());

        stringBuilder.append("排序后:[");
        for (int arr : arrs) {
            stringBuilder.append(arr).append(" ");
        }
        stringBuilder.append("]").append("\n");
        stringBuilder.append("------------")
                .append(getArithmeticName())
                .append("------------")
                .append("\n").append("耗时:" + executedTime)
                .append("\n");
        System.out.println(stringBuilder.toString());
    }

    public void execute() {
        sortAndPrint(RandomUtil.getRandomArrays());
    }
}
