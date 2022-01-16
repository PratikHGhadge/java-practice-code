package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0] = 4;
//        arr[1] = 32;
//        arr[2] = 44;
//        arr[3] = 56;
//        arr[4] = 3;
//        //[4, 32, 44, 56, 3]
//        System.out.println(arr[3]);
//
//        // input using for loop
//        for (int i = 0; i < arr.length; i++){
//            arr[i] = in.nextInt();
//        }
//        // printing array
//        for (int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//
//         for (int j : arr) {
//              System.out.print(j + " ");
//            }

         // best way to print array
            System.out.println(Arrays.toString(arr));
    }
}
