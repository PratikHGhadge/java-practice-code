package com.StaticExample;

public class main {
    public static void main(String[] args) {
        Human Pratik = new Human(19,"Pratik Ghadge", 70000,false);
        Human Pravin = new Human(21,"Pravin Ghadge", 50000,true);
        Human kunal = new Human(21,"kunal kushwaha", 50000,true);
//        System.out.println(Pravin.name);
        System.out.println(Human.Population);
        System.out.println(Human.Population);
        System.out.println(Human.Population);

//        greeting();
    }

    // This is not dependent on object
    static void fun(){
        //greetings();  // you cant use this because it requires an instance
        // but the function you are using it in does not depend on instance
    }

    // We know that somthing which is not static, belongs to object
    void greeting(){
        System.out.println("hellow word");
    }
}
