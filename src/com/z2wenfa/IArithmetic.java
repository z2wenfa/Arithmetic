package com.z2wenfa;

public abstract class IArithmetic {
    protected int[] arrs;
    private StringBuilder stringBuilder = new StringBuilder();

    public abstract void run();

    public abstract String getArithmeticName();

    public void runAndPrint(int[] arrs) {
        this.arrs = arrs;
        stringBuilder.append("------------").append(getArithmeticName()).append("------------").append("\n");
        stringBuilder.append("初始数据:[");
        for (int arr : arrs) {
            stringBuilder.append(arr).append(" ");
        }
        stringBuilder.append("]");
        System.out.println(stringBuilder.toString());

        run();

        stringBuilder.delete(0, stringBuilder.length());

        stringBuilder.append("排序后:[");
        for (int arr : arrs) {
            stringBuilder.append(arr).append(" ");
        }
        stringBuilder.append("]").append("\n");
        stringBuilder.append("------------").append(getArithmeticName()).append("------------").append("\n");
        System.out.println(stringBuilder.toString());
    }
}
