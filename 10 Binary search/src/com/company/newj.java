package com.company;/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class newj
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        float withdraw = sc.nextFloat();
        float Ibalance = sc.nextFloat();
        if (withdraw%5==0){
            if ((withdraw+0.5)<=Ibalance){
                System.out.println(Ibalance-withdraw-0.5);
            }else {
                System.out.println(Ibalance);
            }

        }else {
            System.out.println(Ibalance);
        }
    }
}