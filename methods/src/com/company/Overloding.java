package com.company;

public class Overloding {
    public static void main(String[] args) {
//    fun(45);
//    fun("pratik");
        System.out.println(sum(1,4));
        System.out.println(sum(3,4,324));

    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b, int c){
        return a+b+c;
    }

    static void fun(int a){
        System.out.println("first one");
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println("second one ");
        System.out.println(name);

    }
}
