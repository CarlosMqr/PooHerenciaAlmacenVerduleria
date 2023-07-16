package org.cmendoza.pooherencia.almacenverdularia.modelo;

public class Fruta extends Producto{
    private String color;
    private int peso;
    ////////////// CONSTRUCTOR ///////////
    public Fruta(String color, int peso, String nombre, int precio){
        super(nombre, precio);
        this.color = color;
        this.peso = peso;
    }
    ///////////// GETTER AND SETTER /////
    public String getColor(){
        return this.color;
    }
    private int getPeso(){
        return this.peso;
    }
    //////////// MÉTODOS ///////////////
}
