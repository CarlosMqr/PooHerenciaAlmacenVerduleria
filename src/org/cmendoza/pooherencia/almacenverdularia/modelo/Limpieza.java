package org.cmendoza.pooherencia.almacenverdularia.modelo;

public class Limpieza extends Producto{
    private String componentes;
    private int litros;
    ////////////// CONSTRUCTOR ///////////
    public Limpieza(String componentes, int litros, String nombre, int precio){
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }
    ///////////// GETTER AND SETTER /////
    public String getComponentes(){
        return this.componentes;
    }

    public int getLitros() {
        return this.litros;
    }
    //////////// MÉTODOS ///////////////
}
