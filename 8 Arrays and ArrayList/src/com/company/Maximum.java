package com.company;

public class Maximum {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(max(arr));

    }
    // imagin that array is not empty
    static int max(int[] arr){
        int maxvalu = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxvalu){
                maxvalu = arr[i];
            }
        }
        return maxvalu;
    }
    static int maxRange(int[] arr, int start, int end){
        int maxvalu = arr[start];
        for (int i = start; i < end; i++) {
            if (arr[i]>maxvalu){
                maxvalu = arr[i];
            }
        }
        return maxvalu;
    }
}
