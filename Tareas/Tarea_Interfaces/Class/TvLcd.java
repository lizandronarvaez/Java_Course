package Tareas.Tarea_Interfaces.Class;

import Tareas.Tarea_Interfaces.AbstractClasses.Electronico;

public class TvLcd extends Electronico {

    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    public void setPulgada(int pulgada) {
        this.pulgada = pulgada;
    }

    public double getPrecioVenta() {
        return this.getPrecio() * 1.2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Fabricante: ").append(this.getFabricante())
                .append("\nPulgadas: ").append(this.getPulgada())
                .append("\nPrecio sin IVA: ").append(this.getPrecio())
                .append("\nPrecio con IVA: ").append(this.getPrecioVenta());
        return sb.toString();
    }

}
