package com.StaticExample;


public class IneerClass {

    static class Test{
        String name;
        public Test(String Name){
            this.name = Name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Pratik");
        Test b = new Test("Pravin");
        System.out.println(a.name);
        System.out.println(b.name);
    }
}
