package com.company;

public class EvenDigit {
    public static void main(String[] args) {
        int[] nums =  {12,345,2,6,7896};
        System.out.println(findNumber(nums));
        System.out.println(digit(-6876547));

    }
    static int findNumber(int[] nums){
        int count = 0;
        for (int i = 0;  i < nums.length; i++) {
            int num = nums[i];
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
     // Function to chek wether a number contain even digit or not
    static boolean even(int num) {
        int numberOfDigits = digit(num);
        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }


    static int digit(int num){
        if (num<0){
            num = num * -1;
        }
        if (num==0){
            return 1;
        }
        int count = 0;
        while (num>0){
            count++;
            num/=10;
        }
        return count;
    }
}
