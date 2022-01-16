package com.company;

import java.util.Scanner;

public class Main1 {
    public static int Linear_search(int arr[], int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element of array :");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter key :");
        int key = in.nextInt();
        int result = Linear_search(arr, key);
        if (result==-1)
            System.out.print("Element is not present");
        else
            System.out.println("Element is present at index "+result);

    }
}
