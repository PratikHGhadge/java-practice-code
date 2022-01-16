package com.company;

public class celining {
    public static void main(String[] args) {
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 14;
        int ans = celining(arr, target);
        System.out.println(ans);

    }
    // return the index at smallest number >= target
    static int celining(int[] arr, int target){
        // but what if the target is greater than the greatest number in the array
        if (target> arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid -1;
            }
            else if (target > arr[mid]){
                start = mid + 1;
            }
            else
            {
                return mid ;
            }
        }
        return start;
    }

}