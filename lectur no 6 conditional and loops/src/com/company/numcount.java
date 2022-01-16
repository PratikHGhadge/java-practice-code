package com.company;

public class numcount {
    public static void main(String[] args) {
//        Q: how many times 5 in int
        int n = 4556;
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == 5){
                count++;
            }
            n = n % 10;
        }
        System.out.println(count);
    }
}
