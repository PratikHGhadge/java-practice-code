package com.company.easy;

public class Digitsum {
    public static void main(String[] args) {
        int ans = digitsum(563);
        System.out.println(ans);
    }

    static int digitsum(int n){
        if (n==0) return 0;
        return n%10 + digitsum(n/10);
    }
}

