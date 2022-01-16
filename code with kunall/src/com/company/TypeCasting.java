package com.company;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        System.out.println(num);
        //Type Casting
//        int num = (int)(23.34);
//        float num1 = input.nextInt();
//        System.out.println(num);


//        atomatinc type promotion in expression
//        int a = 257;
//        byte b = (byte)(a);
//        System.out.println(b);
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a*b/c;
//        System.out.println(d);

//        byte b = 50;
//        b = b*2;

        int number = 'A';       // this will give asscai valu of A
        System.out.println("नमस्ते");

//        Rules of type promotion
        //  all the byte short and charactor  value are promoted to integer vale
        // if any one opf the operends is long then whole thing will be promoted to long if it is float the whole
        // operation will be promoted to float if it is duble them whole thing will be promoted to double
//        System.out.println(4*23.43);     // this will five me float


        byte b = 42;
        char c = 'a';
        short s = 1042;
        int i = 50000;
        float f = 45.34f;
        double d = 0.123;
        double result = (f*b) + (i/c) - (d*s);
        // out put is float + int - double = double;
        System.out.println((f*b) + " " + (i/c) + " " + (d*s));
        System.out.println(result);

    }
}
