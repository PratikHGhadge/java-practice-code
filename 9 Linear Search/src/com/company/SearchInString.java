package com.company;

import java.util.Scanner;

public class SearchInString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter string :");
        String name = in.next();
        System.out.print("Enter char :");
        char target = in.next().charAt(0);
        System.out.println(Search(name,target));
    }
    static boolean Search(String name, char target){
        if (name.length()==0){
            return false;
        }
        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
