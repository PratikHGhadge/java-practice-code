package com.company;

import static java.lang.Math.sqrt;

public class AssignmentEasyQ {
    public static void main(String[] args) {
        AreaOfCircle(5);
        AreaOfTriangle(3,5,4);
        AreaOfRectangle(4,3);

    }
    static void AreaOfCircle(float R){
        float area = (float)3.14*R*R;
        System.out.println("Area Of Circle is:"+area);
    }
    static void AreaOfTriangle(float a, float b,float c){
        float s = (a+b+c)/2;
        float Area = (float) sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area Of Triangle is:"+ Area);
    }
    static void AreaOfRectangle(float a, float b){
        float Area = a*b;
        System.out.println("Area Of Rectangle is:"+ Area);
    }
}
