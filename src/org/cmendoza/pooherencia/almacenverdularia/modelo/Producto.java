package org.cmendoza.pooherencia.almacenverdularia.modelo;

public class Producto {
    private String nombre;
    private int precio;
    ////////////// CONSTRUCTOR ///////////
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    ///////////// GETTER AND SETTER /////
    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio(){
        return this.precio;
    }
    //////////// MÉTODOS ///////////////
}
