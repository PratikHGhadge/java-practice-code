package com.Singalton;

public class main {
    public static void main(String[] args) {
        Singalton obj = Singalton.getInstance();

        Singalton obj2 = Singalton.getInstance();

        Singalton obj3 = Singalton.getInstance();
    }
}
