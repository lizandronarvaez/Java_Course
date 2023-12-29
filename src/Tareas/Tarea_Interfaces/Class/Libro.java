package src.Tareas.Tarea_Interfaces.Class;

import java.util.Date;

import src.Tareas.Tarea_Interfaces.AbstractClasses.Producto;
import src.Tareas.Tarea_Interfaces.Interfaces.ILibro;

public class Libro extends Producto implements ILibro {

    private Date fechaPublicacion;
    private String autor, titulo, editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return this.fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public String getEditorial() {
        return this.editorial;
    }

    public double getPrecioVenta() {
        return this.getPrecio() * 1.2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: ").append(this.getTitulo())
                .append("\nAutor: ").append(this.getAutor())
                .append("\nEditorial: ").append(this.getEditorial())
                .append("\nFecha Publicacion: ").append(this.getFechaPublicacion())
                .append("\nPrecio sin IVA: ").append(this.getPrecio())
                .append("\nPrecio con IVA: ").append(this.getPrecioVenta());
        return sb.toString();
    }

}
