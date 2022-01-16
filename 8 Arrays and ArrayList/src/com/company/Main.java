package com.company;

public class Main {

    public static void main(String[] args) {
	// Syntax
    // datatype[] Variable_name = new datatype[size];
    // Store five roll numbers;
//        int[] Roll_no = new int[5];
    // or directly
//    int[] = {1,2,4,5,6};

        int[] Roll_no;   // Decleration of array. Roll_no getting defined in this stack
        Roll_no = new int[5];  // actual here object is being created in the memory (heap)

        System.out.println(Roll_no[1]);

        String[] name = new String[4];
        System.out.println(name[0]);
    }
}
