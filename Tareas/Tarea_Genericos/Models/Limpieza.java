package Tareas.Tarea_Genericos.Models;

public class Limpieza extends ProductBase {
    private String componentes;
    private double litros;

    public Limpieza(String name, Double price, String componentes, double litros) {
        super(name, price);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }

}
