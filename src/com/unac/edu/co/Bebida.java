package com.unac.edu.co;

public class Bebida extends  Plato{
    protected String size;

    public Bebida() {
    }

    public Bebida(String flavor, Double price, String size) {
        super(flavor, price);
        this.size=size;
    }
}
