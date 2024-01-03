package Tareas.Tarea_Genericos.Models;

public class NoPerecible extends ProductBase {
    private int contenido;
    private int calorías;

    public NoPerecible(String name, Double price, int contenido, int calorías) {
        super(name, price);
        this.contenido = contenido;
        this.calorías = calorías;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorías() {
        return calorías;
    }

}
