package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        String fruit = in.next();
//        switch (fruit) {
//            case "mango" -> System.out.println("King of fruits ");
//            case "apple" -> System.out.println("A sweet read fruits ");
//            case "orange" -> System.out.println("Round fruit ");
//            case "greaps" -> System.out.println("Small fruit ");
//            default -> System.out.println("pleas enter a valid fruit ");
//        }

        int day = in.nextInt();

        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }
    }
}
