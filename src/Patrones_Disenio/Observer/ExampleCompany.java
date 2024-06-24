package Patrones_Disenio.Observer;

public class ExampleCompany extends Observable {

    private String nombre;
    private int precio;

    public ExampleCompany(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }
    public void modificarPrecio(int precio){
        this.precio=precio;
        notifyObserver();
    }

    @Override
    public String toString() {
        return "ExampleCompany [nombre=" + nombre + ", precio=" + precio + "]";
    }

    
}
