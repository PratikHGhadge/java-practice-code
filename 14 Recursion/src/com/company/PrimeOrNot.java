package com.company;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPrime(n, 2));
    }
    static boolean isPrime(int n, int i){
        if (n<=2){
            return (n==2) ? true : false;
        }
        if (n%i==0) return false;
        if(i*i>n) return true;
        return isPrime(n, i+1);
    }
}
