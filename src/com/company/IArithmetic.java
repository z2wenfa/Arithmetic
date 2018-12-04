package com.company;

public abstract class IArithmetic {
    protected int[] arrs;

    void initArray(int[] arrs) {
        this.arrs = arrs;
    }

    public abstract void run();

    public abstract String getArithmeticName();
}
