package com.unac.edu.co;

public abstract class Combos {
    protected Precio price;
    protected Sabor flavor;
    protected Pizza pizza;
    protected Lasagna lasagna;
    protected Pasta pastas;
    protected Bebida bebidas;

    public  Combos(){

    }

    public Combos(Sabor flavor, Precio price, Pizza pizza, Lasagna lasagna, Pasta pastas, Bebida bebidas) {
        this.price = price;
        this.flavor = flavor;
        this.pizza = pizza;
        this.lasagna = lasagna;
        this.pastas = pastas;
        this.bebidas= bebidas;
    }

    public Precio getPrice() {
        return price;
    }

    public void setPrice(Precio price) {
        this.price = price;
    }

    public Sabor getFlavor() {
        return flavor;
    }

    public void setFlavor(Sabor flavor) {
        this.flavor = flavor;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Lasagna getLasagna() {
        return lasagna;
    }

    public void setLasagna(Lasagna lasagna) {
        this.lasagna = lasagna;
    }

    public Pasta getPastas() {
        return pastas;
    }

    public void setPastas(Pasta pastas) {
        this.pastas = pastas;
    }

    public Bebida getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida bebidas) {
        this.bebidas = bebidas;
    }

    public abstract  void pedirCombos();
}
