package com.company;

import java.util.Scanner;

public class Qutions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        boolean ans = isprime(23);
//        System.out.println(ans);

//        System.out.println(isArmstron(n));
        for (int i = 100; i<=999; i++){
            if (isArmstron(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Q: print all the three digit armstrong number----->> armstrong numbers are sum of cub of three digit is equal to that number
    // EX. 153 = 1 + 125 + 27 = 153
    static boolean isArmstron(int n) {
        int original = n;
        int sum = 0;
        while (n>0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem*rem*rem;
        }
        return sum == original;
    }


    // Q: write a function to find given number is prime or not
    static boolean isprime(int a){
        if (a<=1){
            return false;
        }
        int c = 2;
        while (c*c<=a){
            if (a%2==0){
                return false;
            }
            c++;
        }
        if (c*c>a){
            return true;
        }
        return false;

    }
}
