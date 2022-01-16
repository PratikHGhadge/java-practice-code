package com.company;

public class OddEven {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(idOdd(n));
    }

    private static boolean idOdd(int n) {
        return (n & 1)==1;
    }
}
