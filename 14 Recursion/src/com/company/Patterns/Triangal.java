package com.company.Patterns;

import java.util.Arrays;

public class Triangal {
    public static void main(String[] args) {
//        triangal(4,0);
//        triangal1(4,0);
        int[] arr = {5,3,76,1,0};
        selectionsort(arr,arr.length-1,0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void triangal(int r, int c){
        if (r==0){
            return;
        }
        if (c<r){
            System.out.print("* ");
            triangal(r,c+1);
        }else {
            System.out.println();
            triangal(r-1,0);
        }
    }

    static void triangal1(int r, int c){
        if (r==0){
            return;
        }
        if (c<r){
            triangal1(r,c+1);
            System.out.print("* ");
        }else {
            triangal1(r-1,0);
            System.out.println();
        }
    }

    static void Bbblesort(int[] arr, int r, int c){
        if (r==0){
            return;
        }
        if (c<r){
            if (arr[c]>arr[c+1]){
                //swap
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            Bbblesort(arr, r,c+1);
        }else {
            Bbblesort(arr,r-1,0);
        }
    }

    static void selectionsort(int[] arr, int r, int c, int max){
        if (r==0){
            return;
        }
        if (c<r){
            if (arr[c]>arr[c+1]){
                selectionsort(arr, r, c+1, c);
            }else {
                selectionsort(arr, r, c + 1, max);
            }
        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selectionsort(arr, r-1, 0, 0);
        }
    }
}
