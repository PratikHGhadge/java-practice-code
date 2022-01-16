// Q: Write a code for linear search
package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {23,45,1,2,19,-3,16,11,28};
        int target = 199;
        int ans = linearSearch(nums,target);
        System.out.println(ans);

    }
    // search in the array : Return the index of item found
    // of item not found return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length==0) {
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for every index if it is equal to target or not
            int element = arr[index];
            if (element==target){
                return index;
            }

        }
        // this line will execute if none of the return statement above have executed
        // hence the target not found
        return -1;
    }
}

