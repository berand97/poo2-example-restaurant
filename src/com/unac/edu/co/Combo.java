package com.unac.edu.co;

public class Combo{
    private  Plato platos;
    private  Bebida bebidas;

    public  Combo(){

    }
    public Combo(Plato platos, Bebida bebidas) {
        this.platos = platos;
        this.bebidas = bebidas;
    }

    public Plato getPlatos() {
        return platos;
    }

    public void setPlatos(Plato platos) {
        this.platos = platos;
    }

    public Bebida getBebidas() {
        return bebidas;
    }

    public void setBebidas(Bebida bebidas) {
        this.bebidas = bebidas;
    }
}
