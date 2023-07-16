package org.cmendoza.pooherencia.almacenverdularia;

import org.cmendoza.pooherencia.almacenverdularia.modelo.*;

public class EjemploMain {
    public static void main(String[] args) {
        Producto[] productos = new Producto[4];
        productos[0] = new Lacteo(50,120,"Yogurt",15);
        productos[1] = new Fruta("Verde",500,"Sandia",25);
        productos[2] = new Limpieza("Detergente liquido",20,"Salvo",80);
        productos[3] = new NoPerecible(120,64,"Atun",25);


    }
}
