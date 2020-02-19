package com.unac.edu.co;

public abstract  class Plato {

    protected String flavor;
    protected Double price;

    public Plato(){

    }
    public Plato(String flavor, Double price) {
        this.flavor = flavor;
        this.price = price;
    }

}
