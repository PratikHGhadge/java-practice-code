package com.company;
import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int b = sc.nextInt();
        boolean ans = true;
        for (int i = 0; i <= b-1; i++) {
            if (arr[i] != arr[arr.length-b+i]){
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}
