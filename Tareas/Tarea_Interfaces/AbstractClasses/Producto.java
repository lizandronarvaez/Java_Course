package Tareas.Tarea_Interfaces.AbstractClasses;

import Tareas.Tarea_Interfaces.Interfaces.IProducto;

abstract public class Producto implements IProducto {

    private int precio;

    
    public Producto(int precio) {
        this.precio = precio;
    }
    
    @Override
    public int getPrecio() {
        return this.precio;
    }
}
