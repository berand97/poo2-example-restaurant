package com.unac.edu.co;

public abstract  class Plato {

    public String flavor;
    public Double price;

    public Plato(){

    }
    public Plato(String flavor, Double price) {
        this.flavor = flavor;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
