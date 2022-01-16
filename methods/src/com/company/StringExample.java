package com.company;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String msg = greet();
//        System.out.println(msg);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = in.next();
        String personalised = mygreet(name);
        System.out.println(personalised);
    }

    static String mygreet(String name) {
        String msg = "hello " + name;
        return msg;
    }

    static String greet(){
        String greeting = "How are you ";
        return greeting;
    }
}
