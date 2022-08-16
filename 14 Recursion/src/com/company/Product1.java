package com.company;
import java.util.Scanner;

public class Product1 {
    // Product of 2 Numbers using Recursion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number :");
        int x = sc.nextInt();
        System.out.println("Enter second number :");
        int y = sc.nextInt();
        System.out.println("Product = " + product(x,y));
    }

    static int product(int x, int y){
        if (x<y) {
            return product(y, x);
        }
        else if (y!=0){
            return (x + product(x, y-1));
        }
        else {
            return 0;
        }
    }
}
