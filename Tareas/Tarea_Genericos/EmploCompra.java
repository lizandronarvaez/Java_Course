package Tareas.Tarea_Genericos;

import Tareas.Tarea_Genericos.Models.*;
import Tareas.Tarea_Genericos.Repository.BolsaSupermercado;

public class EmploCompra {
    public static void main(String[] args) {

        BolsaSupermercado<Lacteo> lacteos = new BolsaSupermercado<>(5);
        lacteos.addProducto(new Lacteo("Yogur Fesa", 2.99, 4, 150));
        lacteos.addProducto(new Lacteo("Leche Sin Lactosa", 1.99, 6, 250));
        lacteos.addProducto(new Lacteo("Mantequilla sin lactosa", 3.99, 1, 200));
        lacteos.addProducto(new Lacteo("Yogures liquidos", 1.99, 1, 150));
        lacteos.addProducto(new Lacteo("Queso", 10.99, 1, 350));

        BolsaSupermercado<Fruta> frutas = new BolsaSupermercado<>(5);
        frutas.addProducto(new Fruta("Manzanas", 3.99, 1.5, "rojas"));
        frutas.addProducto(new Fruta("Peras", 2.99, 2, "verdes"));
        frutas.addProducto(new Fruta("Platanos", 1.99, 1, "amarillos"));
        frutas.addProducto(new Fruta("Melones", 2.99, 2.5, "verdes"));
        frutas.addProducto(new Fruta("Manzanas", 2.99, 1.5, "verdes"));

        BolsaSupermercado<Limpieza> limpieza = new BolsaSupermercado<>(5);
        limpieza.addProducto(new Limpieza("Fregasuelos", 1.99, "Extractos de fresa", 1));
        limpieza.addProducto(new Limpieza("Lejia Desifectante", 2.99, "Lejía", 1));
        limpieza.addProducto(new Limpieza("Detergente ropa", 4.99, "Jabon marsella", 5));
        limpieza.addProducto(new Limpieza("Suavizante ropa", 3.99, "Extractos de frutas del bosque", 2));
        limpieza.addProducto(new Limpieza("Spray suelo madera", 3.99, "Brillo", 1));

        System.out.println("*****BOLSA DE LACTEOS*****");
        System.out.println("Clase: " + lacteos.getClass().getSimpleName());
        System.out.println();
        lacteos.getProductos().forEach(lacteo -> {
            System.out.println("Nombre: " + lacteo.getNombre());
            System.out.println("Precio: " + lacteo.getPrecio());
            System.out.println("Cantidad: " + lacteo.getCantidad());
            System.out.println("Proteinas: " + lacteo.getProteinas());
        });

        System.out.println();
        System.out.println("*****BOLSA DE FRUTAS*****");
        System.out.println("Clase: " + frutas.getClass().getSimpleName());
        System.out.println();
        frutas.getProductos().forEach(fruta -> {
            System.out.println("Nombre: " + fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Peso: " + fruta.getPeso());
            System.out.println("Color: " + fruta.getColor());
        });

        System.out.println();
        System.out.println("*****BOLSA DE LIMPIEZA*****");
        System.out.println("Clase: " + limpieza.getClass().getSimpleName());
        System.out.println();
        limpieza.getProductos().forEach(fruta -> {
            System.out.println("Nombre: " + fruta.getNombre());
            System.out.println("Precio: " + fruta.getPrecio());
            System.out.println("Componentes: " + fruta.getComponentes());
            System.out.println("Litros: " + fruta.getLitros());
        });
    }
}
