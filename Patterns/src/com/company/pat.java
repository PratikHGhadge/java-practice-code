package com.company;
//            *
//           **
//          ***
//         ****
//        *****
//         ****
//          ***
//           **
//            *
public class pat {
    public static void main(String[] args) {
        int n = 5;
        for (int row = 1; row <=2*n-1; row++) {
            int totalcolinrow;
            if (row>n){
                totalcolinrow = 2*n-row;
            }else {
                totalcolinrow = row;
            }
            for (int col = 1; col <=n-totalcolinrow; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col<=totalcolinrow; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
