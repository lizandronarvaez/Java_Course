package src.Tareas.Tarea_Interfaces.AbstractClasses;

import src.Tareas.Tarea_Interfaces.Interfaces.IElectronico;

public abstract class Electronico extends Producto implements IElectronico {

    private String fabricante;

    public Electronico(int precio, String fabricante) {
        super(precio);
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return fabricante;
    }
    
    @Override
    public double getPrecioVenta() {
       return this.getPrecio();
    }

}
