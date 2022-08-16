package com.Singalton;

public class Singalton {
    private Singalton(){

    }

    private static Singalton instance;

    public static Singalton getInstance(){
        // chek whether 1 obj is created or not
        if (instance==null){
            instance = new Singalton();
        }
        return instance;
    }
}


