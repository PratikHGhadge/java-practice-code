package com.company;

public class Scope {
    public static void main(String[] args) {
        int a = 10 ;
        int b = 20;
        {
            int c = 99;     // values initialised in this block, will remain in block
        }
//        System.out.println(c); // this will give an error

        // scoping in for loop
        for (int i=0; i<4; i++){
            System.out.println(i);
            int num = 90;
        }
    }
    static void random(int marks){
        int num = 67 ;
        System.out.println(num);
        System.out.println(marks);
    }
}
