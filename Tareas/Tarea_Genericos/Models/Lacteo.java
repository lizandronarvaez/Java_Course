package Tareas.Tarea_Genericos.Models;

public class Lacteo extends ProductBase {

    private int cantidad;
    private int proteinas;

    public Lacteo(String nombre,Double precio, int cantidad,int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    
}
