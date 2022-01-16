package com.company;
import java.util.ArrayList;
public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));

        System.out.println("a"+1);
//      integer will be converted to Integer that will call toString()
//      this same as after a few step "a"+"1"
        System.out.println( "pratik" + new ArrayList<>());
        System.out.println("pratik"+ new Integer(56));
        System.out.println(new Integer(56) + "" + new ArrayList<>());
    }
}
