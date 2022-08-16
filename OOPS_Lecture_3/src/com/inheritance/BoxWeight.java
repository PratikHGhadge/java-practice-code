package com.inheritance;


public class BoxWeight extends Box {
    double weight;
    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(BoxWeight old) {
        super(old);
        this.weight = weight;
    }

    public BoxWeight(double w, double h, double l, double weight) {
        super(w, h, l);
        this.weight = weight;
    }
}
