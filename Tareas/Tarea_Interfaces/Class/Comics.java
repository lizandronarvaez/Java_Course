package src.Tareas.Tarea_Interfaces.Class;

import java.util.Date;

public class Comics extends Libro {

    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public double getPrecioVenta() {
        return this.getPrecio();
    }

    public String getPersonaje() {
        return personaje;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(this.getTitulo())
                .append("\nAutor: ").append(this.getAutor())
                .append("\nEditorial: ").append(this.getEditorial())
                .append("\nPersonaje: ").append(this.getPersonaje())
                .append("\nFecha Publicacion: ").append(this.getFechaPublicacion())
                .append("\nPrecio: ").append(this.getPrecioVenta());
        return sb.toString();
    }

}