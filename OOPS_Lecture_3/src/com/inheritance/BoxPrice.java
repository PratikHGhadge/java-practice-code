package com.inheritance;

public class BoxPrice extends BoxWeight{
    double cost;

    BoxPrice(){
        super();
        this.cost=-1;
    }


    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost;
    }

    public BoxPrice(double w, double h, double l, double weight, double cost) {
        super(w, h, l, weight);
        this.cost = cost;
    }
}
