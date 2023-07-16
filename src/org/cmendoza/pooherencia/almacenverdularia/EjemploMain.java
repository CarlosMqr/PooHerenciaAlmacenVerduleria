package org.cmendoza.pooherencia.almacenverdularia;

import org.cmendoza.pooherencia.almacenverdularia.modelo.*;

public class EjemploMain {
    public static void main(String[] args) {
        Producto[] productos = new Producto[4];
        productos[0] = new Lacteo(50,120,"Yogurt",15);
        productos[1] = new Fruta("Verde",500,"Sandia",25);
        productos[2] = new Limpieza("Detergente liquido",20,"Salvo",80);
        productos[3] = new NoPerecible(120,64,"Atun",25);

        for (Producto p: productos) {
            System.out.println("Nombre: " + p.getNombre());
            System.out.println("Precio: " + p.getPrecio() + " $");

            if (p instanceof Lacteo ){
                System.out.println("Cantidad: " + ((Lacteo) p).getCantidad() + " G");
                System.out.println("Proteinas: " + ((Lacteo) p).getProteinas() + " G");
            } else if (p instanceof  Fruta) {
                System.out.println("Color: " + ((Fruta) p).getColor());
                System.out.println("Peso: " + p.getPrecio() + " kg");
            } else if (p instanceof  Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) p).getComponentes());
                System.out.println("Litros: " + ((Limpieza) p).getLitros());
            } else if (p instanceof NoPerecible) {
                System.out.println("Contenido: " + ((NoPerecible) p).getContenido() +  " G:" );
                System.out.println("Calorías: " + ((NoPerecible) p).getCalorias());
            }

            System.out.println("================== Siguiente Producto ==================");

        }


    }
}
