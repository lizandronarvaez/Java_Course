package src.Tareas.Tarea_Interfaces.Class;

import src.Tareas.Tarea_Interfaces.AbstractClasses.Electronico;

public class Iphone extends Electronico {

    private String color, modelo;

    public Iphone(int precio, String fabricante, String color, String modelo) {
        super(precio, fabricante);
        this.color = color;
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioVenta() {
        return this.getPrecio() * 1.1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: ").append(this.getFabricante())
                .append("\nModelo: ").append(this.getModelo())
                .append("\nColor: ").append(this.getColor())
                .append("\nPrecio sin IVA: ").append(this.getPrecio())
                .append("\nPrecio con IVA: ").append(this.getPrecioVenta());
        return sb.toString();
    }
}
