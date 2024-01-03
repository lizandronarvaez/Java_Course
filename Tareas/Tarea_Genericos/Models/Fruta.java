package Tareas.Tarea_Genericos.Models;

public class Fruta extends ProductBase {
    private double peso;
    private String color;

    public Fruta(String name, Double price, double peso, String color) {
        super(name, price);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }

    
}
