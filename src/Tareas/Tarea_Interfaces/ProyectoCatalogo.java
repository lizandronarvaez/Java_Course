package src.Tareas.Tarea_Interfaces;

import java.util.*;
import src.Tareas.Tarea_Interfaces.Class.*;
import src.Tareas.Tarea_Interfaces.Interfaces.IProducto;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        List<IProducto> productos = new ArrayList<>();
        productos.add(new Libro(60, new Date(), "AutoLibro", "TituloLibro", "EditorialLibro"));
        productos.add(new TvLcd(450, "Samsung", 70));
        productos.add(new Iphone(1200, "Apple", "Negro", "15PRO"));
        productos.add(
                new Comics(30, new Date(), "Desconocido", "Mortadelo y filemon", "Editorial", "Mortadelo y Filemon"));
        productos.add(new TvLcd(1200, "Xiaomi", 86));


        for (IProducto iProducto : productos) {
            System.out.println();
            System.out.println(iProducto);
            System.out.println();
        }
    }
}
