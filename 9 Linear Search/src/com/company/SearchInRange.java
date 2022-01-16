// Q: find target in specific range of array
package com.company;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 14;
        System.out.println(linearSearch(arr, target, 1,4));
    }
    // search in the array : Return the index of item found
    // of item not found return -1
    static int linearSearch(int[] arr, int target, int start, int end){
        if (arr.length==0) {
            return -1;
        }
        // run a for loop
        for (int index = start; index <= end; index++) {
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
