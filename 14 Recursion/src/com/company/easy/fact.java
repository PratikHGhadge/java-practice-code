package com.company.easy;

public class fact {
    public static void main(String[] args) {
        int ans = sum(5);
        System.out.println(ans);
    }
    static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
//        if (n<2){
//            return 1;
//        }
        return n*fact(n-1);
    }

    static int sum(int n){
        if (n==0){
            return 0;
        }
        return n + sum(n-1);
    }
}
