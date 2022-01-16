package com.company;
public class Main {
    public static void main(String[] args) {
    pattern1(5);
	pattern2(5);
    patterm3(5);
    pattern4(5);
    pattern5(5);
    pattern28(5);
    pattern30(5);
    pattern17(5);
    pattern31(4);
    }
    static void pattern1(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            // for every row run the column
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");
            }
            // when row is printed we need to print new line
            System.out.println();
        }
        System.out.println();
    }
    private static void patterm3(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = n-row+1; col >=1; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <=row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern5(int n){
        for (int row = 1; row <=2*n-1; row++) {
            int totalcolinrow;
            if (row>n){
                totalcolinrow = 2*n-row;
            }else {
                totalcolinrow = row;
            }
            for (int col = 1; col <= totalcolinrow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
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
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void pattern30(int n){
        for (int row = 1; row <=n; row++) {
            int totalnocol = row*2-1;
            for (int i = 1; i<=n-row; i++){
                System.out.print("  ");
            }
            for (int i = row; i>=1; i--){
                System.out.print(i+" ");
            }
            for (int i = 2; i<=row; i++){
                System.out.print(i+" ");
            }
            System.out.println();

        }
        System.out.println();
    }

    static void pattern17(int n){
        for (int i = 1; i<=2*n-1; i++){
            int c = 0 ;
            if (i<=n){
                c=i;
            }else {
                c=2*n-i;
            }
            for (int j = 1; j<=n-c; j++){
                System.out.print(" ");
            }
            for (int k = c; k>=1; k--){
                System.out.print(k);
            }
            for (int j = 2; j<=c; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern31(int n){
        int orignalN = n;
        n=2*n;
        for (int i = 0; i<=n; i++){
            for (int j = 0; j<=n; j++){
                int atEveryIndex =orignalN - Math.min(Math.min(i,n-i), Math.min(j,n-j));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }
}
