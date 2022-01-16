package com.company;

public class Comparison {
    public static void main(String[] args) {
        String a = "pratik";
        String b = "pratik";

//       ==
//        System.out.println(a==b);

        String name1 = new String("pratik");
        String name2 = new String("pratik");
        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}
