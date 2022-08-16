package com.company.easy;

public class ReverseNumber {
    public static void main(String[] args) {
//      RevNum(8976);
      int num = RevNum1(8976);
        System.out.println(num);
////      System.out.println(sum);
//        System.out.println(RevNum2(1234));
    }
//    static int RevNum2(int n){
//        int digit = (int)(Math.log10(n))+1;
//        return helper(n, digit);
//    }
//
//    private static int helper(int n, int digit) {
//        if (n%10==n){
//            return n;
//        }
//        int rem = n%10;
//        return rem*(int)(Math.pow(10, digit-1)) + helper(n/10, digit-1);
//    }
//
//    static void RevNum(int n){
//        if (n==0){
//            return;
//        }
//        System.out.print(n%10);
//        RevNum(n/10);
//    }
    static int sum = 0;
    static int RevNum1(int n){
        if (n==0){
            return sum;
        }
        int rem = n%10;
        sum = sum*10 + rem;
        return RevNum1(n/10);
    }
}
