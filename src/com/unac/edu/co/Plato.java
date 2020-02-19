package com.unac.edu.co;

public abstract  class Plato {

    protected String flavor;
    protected Double price;
    protected Combo combo;

    public Plato(){

    }
    public Plato(String flavor, Double price) {
        this.flavor = flavor;
        this.price = price;
    }

    public Combo getCombo() {
        return combo;
    }

    public void setCombo(Combo combo) {
        this.combo = combo;
    }
}
