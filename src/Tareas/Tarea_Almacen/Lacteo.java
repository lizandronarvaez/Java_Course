package src.Tareas.Tarea_Almacen;

public class Lacteo extends Producto {
    private int cantidad, proteinas;

    public void setProteinas(int proteinas) {
        this.proteinas = proteinas;
    }

    public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCantidad: " + cantidad + "\nProteinas: " + proteinas;
    }

}
