package com.company;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {
        System.out.println(x);
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
