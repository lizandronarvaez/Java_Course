package Tareas.Tarea_Genericos.Repository;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T> {
    private int maxElementos;
    private List<T> productos;

    public BolsaSupermercado(int maxElementos) {
        this.maxElementos = maxElementos;
        this.productos = new ArrayList<>();
    }

    public void addProducto(T t) {
        if (productos.size() <= maxElementos) {
            this.productos.add(t);
        }else{
            throw new RuntimeException("No se puede añadir mas productos a la lista");
        }
    }

    public List<T> getProductos() {
        return this.productos;
    }
}
