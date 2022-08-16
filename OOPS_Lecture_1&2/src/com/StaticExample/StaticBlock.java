package com.StaticExample;

// This is demo to show initialization of static variables
public class StaticBlock {
    static int a = 4;
    static int b;
    int abc = 9;

    static {
        System.out.println("I am in static Block");
        b = a*5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
