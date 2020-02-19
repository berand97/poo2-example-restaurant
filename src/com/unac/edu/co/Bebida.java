package com.unac.edu.co;

public class Bebida {
    protected String flavor;
    protected String size;
    protected Double price;

    public Bebida() {
    }

    public Bebida(String flavor, String size, Double price) {
        this.flavor = flavor;
        this.size = size;
        this.price = price;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
