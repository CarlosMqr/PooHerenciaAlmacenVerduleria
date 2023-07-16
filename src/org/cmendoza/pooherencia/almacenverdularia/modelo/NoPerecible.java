package org.cmendoza.pooherencia.almacenverdularia.modelo;

public class NoPerecible extends Producto{
    private int contenido;
    private int calorias;
    ////////////// CONSTRUCTOR ///////////
     public NoPerecible(int contenido, int calorias, String nombre, int precio){
         super(nombre, precio);
         this.contenido= contenido;
         this.calorias = calorias;
     }
    ///////////// GETTER AND SETTER /////
    //////////// MÉTODOS ///////////////
}
