package com.company;

import java.util.Scanner;

public class sumof2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of rows:");
        int row = in.nextInt();
        System.out.println("enter number of col:");
        int col = in.nextInt();
        int[][] num = new int [row][col];
        System.out.println("enter elements in 2D array :");
        for (row = 0; row < num.length; row++) {
            for (col = 0; col < num[row].length; col++) {
                num[row][col] = in.nextInt();
            }
        }
        int sum = 0;
        for (row = 0; row < num.length; row++) {
            for (col = 0; col < num[row].length; col++) {
                sum += num[row][col];
            }
        }
        System.out.println("the sum of all elements in array is:"+ sum);

    }
}
