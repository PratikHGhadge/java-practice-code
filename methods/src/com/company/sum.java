package com.company;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        sum();
        int ans = sum2();
        System.out.println(ans);

        int ans1 = sum3(4,7);
        System.out.println(ans );

    }

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;


    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1:");
        num1 = in.nextInt();
        System.out.print("Enter the number 2:");
        num2 = in.nextInt();
        sum = num1+num2;
        System.out.println("The sum ="+ sum);
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.print("Enter number 1:");
        num1 = in.nextInt();
        System.out.print("Enter the number 2:");
        num2 = in.nextInt();
        sum = num1+num2;
        return sum;
    }
}
