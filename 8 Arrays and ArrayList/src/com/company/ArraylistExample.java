package com.company;

import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(67);
        list.add(656);
        list.add(437);
        list.add(7);
        list.set(0,777);
        System.out.println(list);
        System.out.println(list.contains(65));
    }
}
