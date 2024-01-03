package Tareas.Tarea_Almacen;

import java.util.ArrayList;

public class Almacen {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        // Frutas
        productos.add(new Fruta("Manzana", 3, 2, "rojas"));
        productos.add(new Fruta("Limones", 1.50, 3, "Amarillos"));
        // Lacteo
        productos.add(new Lacteo("Yogures Fresa", 2.95, 6, 180));
        productos.add(new Lacteo("Leche Semidesnatada", 8.95, 6, 400));
        // Limpieza
        productos.add(new Limpieza("Fregasuelos Pino", 2.95, "Agua y fragancias de pino", 1));
        productos.add(new Limpieza("Detergente Ropa Blanca", 4.95, "jabon liquido", 5));

        // Metodo
        imprimirProductos(productos);
    }

    public static void imprimirProductos(ArrayList<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println();
            System.out.println(producto);
        }
    }
}
