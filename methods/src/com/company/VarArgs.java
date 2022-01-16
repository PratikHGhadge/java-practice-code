package com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
    fun(2,3,4,5,6,34,56,123,6);
    multiple(1,3,"pratik", "pravin");
    }
    static void multiple(int a, int b, String ...v){

    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
