package org.cmendoza.pooherencia.almacenverdularia.modelo;

public class Lacteo extends Producto{
    private int cantidad;
    private int proteinas;
    ////////////// CONSTRUCTOR ///////////
    public Lacteo(int cantidad, int proteinas, String nombre, int precio){
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }
    ///////////// GETTER AND SETTER /////
    public int getCantidad(){
        return this.cantidad;
    }
    public int getProteinas(){
        return this.proteinas;
    }
    //////////// MÉTODOS ///////////////
}
