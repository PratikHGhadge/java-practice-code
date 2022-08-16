package Pratik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
//    public static void solution(String str){
//        for(int i = 0; i<str.length(); i++){
//            for(int j = i+1; j<=str.length(); j++){
//                String temp = str.substring(i,j);
//                if(ispalindrom(temp)==true){
//                    System.out.print(temp+"\n");
//                    // System.out.println();
//                }
//            }
//        }
//
//    }
//    public static boolean ispalindrom(String str) {
//        int i = 0;
//        int j = str.length()-1;
//        while(i<j){
//            if((str.charAt(i)) == (str.charAt(j))){
//                i++;
//                j--;
//            }else{
//                return false;
//            }
//
//        }
//        return true;
//    }
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        String str = scn.next();
//        solution(str);

        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        if(a.equals("Apple") || a.equals("apple") || a.equals("APPLE")){
            System.out.print("Gravity");
        }else{
            System.out.print("Space");
        }

    }
}
