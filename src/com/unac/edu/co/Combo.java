package com.unac.edu.co;

public class Combo{
    private  Plato platos;
    private  Bebida bebidas;
    private Double price;

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

    public Double getPrice() {
        double plato;
        double bebida;
        double total;
        plato= this.platos.getPrice();
        bebida=bebidas.getPrice();
        total= (plato+bebida);
        return total;
    }
    public Double getDescuento(){
        double descuento;
        descuento= this.getPrice()-(this.getPrice()*0.15);
        return  descuento;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void getCombo() {

    }
}
