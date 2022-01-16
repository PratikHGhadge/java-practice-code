package com.company;
import java.util.Scanner;
public class Binary_search {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size :");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter element of sorted array :");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter key :");
        int key = in.nextInt();
        int result = binarySearch(arr, key);
        if (result==-1)
            System.out.print("Element is not present");
        else
            System.out.println("Element is present at index "+result);
    }
    static int binarySearch(int[] arr, int key){
        int start = 0;
        int end = arr.length-1;
        while (start <= end)
        {
            int mid = start + (end - start)/2;
            if (key < arr[mid])
            {
                end = mid -1;
            }
            else if (key > arr[mid])
            {
                start = mid + 1;
            }
            else
            {
                return mid ;
            }
        }
        return -1;
    }
}
