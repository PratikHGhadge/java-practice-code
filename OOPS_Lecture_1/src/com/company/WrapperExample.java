package com.company;

public class WrapperExample {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;
        Integer num = 45;
        swap(a,b);
        System.out.println(a+ " " +b);
        final int bonus = 5;
        final A Pratik = new A("Pratik Ghadge");
        Pratik.name="other name";
        System.out.println(Pratik.name);

        // When a primitive is final you can not reassign it.
        // Pratik = new A("some another");

        A obj;

        for (int i = 0; i < 10000000; i++) {
            obj = new A("Random name");
        }

    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b= temp;
    }

}

class A{
    final int num=10;
    String name;
    public A(String name){
        this.name=name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
