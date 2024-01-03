package Tareas.Tarea_Genericos.Models;

public class ProductBase {
    protected String nombre;
    protected Double precio;

    public ProductBase(String name, Double price) {
        this.nombre = name;
        this.precio = price;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }

}
