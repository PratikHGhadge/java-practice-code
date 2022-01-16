package com.company;
import java.util.Arrays;
public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {1,5,3,2,6,4};
        Cyclic(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void Cyclic(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex]=temp;
            }else {
                i++;
            }
        }
    }
}
