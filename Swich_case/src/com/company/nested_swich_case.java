package com.company;

import java.util.Scanner;

public class nested_swich_case {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("pratik ghadge ");
                break;
            case 2:
                System.out.println("Pravin Ghadge ");
                break;
            case 3:
                System.out.println("Employ no 3");
                switch (department){
                    case "it":
                        System.out.println("It department ");
                        break;
                    case  "management":
                        System.out.println("management department ");
                        break;
                    default:
                        System.out.println("no department entered ");
                   }
                   break;
            default:
                System.out.println("Enter correct employ ID");
        }
        // better way to write
        switch (empID) {
            case 1 -> System.out.println("pratik ghadge ");
            case 2 -> System.out.println("Pravin Ghadge ");
            case 3 -> {
                System.out.println("Employ no 3");
                switch (department) {
                    case "it" -> System.out.println("It department ");
                    case "management" -> System.out.println("management department ");
                    default -> System.out.println("no department entered ");
                }
            }
            default -> System.out.println("Enter correct employ ID");
        }

    }
}
