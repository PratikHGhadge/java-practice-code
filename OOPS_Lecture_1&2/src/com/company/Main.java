package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        Student[] students = new Student[5];
        // Just declearing
        Student Pratik = new Student();
//        Pratik.rno = 23;
//        Pratik.name = "Pratik Ghadge";
//        Pratik.marks = 93.74f;

        System.out.println(Pratik.rno);
        System.out.println(Pratik.marks);
        System.out.println(Pratik.name);
//        System.out.println(Arrays.toString(students));
    }

    // Create a class
    // For every single Student
    static class Student{
        int rno;
        String name;
        float marks = 90;

        // We need a way to add the valu of the above
        // Properties object by object

        // we need one word to access every object

        Student(){
            this.rno = 23;
            this.name = "Pratik Ghadge";
            this.marks = 93.74f;
        }
    }
}
