package com.unac.edu.co;

public class Bebida {
    private String size;


    public  Bebida(String size, String flavor, double price){
        super();
        this.size= size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
