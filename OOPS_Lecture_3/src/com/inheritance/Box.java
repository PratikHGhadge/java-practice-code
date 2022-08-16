package com.inheritance;

public class Box {
    double l;
    double w;
    double h;

    Box () {
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }

    // Cube
    Box (double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Box (double w, double h, double l){
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box (Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information(){
        System.out.println("Running the box");
    }

}
