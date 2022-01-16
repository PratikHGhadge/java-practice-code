package com.company;

import java.util.Arrays;

public class Passing_function {
    public static void main(String[] args) {
        int[] nums = {3, 5, 4, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));


    }
    static void change(int[] arr){
        arr[0] = 99;
    }

}
