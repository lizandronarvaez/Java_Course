package src.POO.Interfaces.EjemploImprenta.models.Libro;

import java.util.ArrayList;
import java.util.List;

import src.POO.Interfaces.EjemploImprenta.interfaces.Imprimible;
import src.POO.Interfaces.EjemploImprenta.models.Persona.Persona;

public class Libro implements Imprimible {

    private List<Imprimible> paginas;
    private Persona autor;
    private String titulo;
    private Genero genero;

    public Libro(Persona autor, String titulo, Genero genero) {
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
        this.paginas = new ArrayList<>();
    }

    public Libro addPagina(Imprimible pagina) {
        paginas.add(pagina);
        return this;
    }

    public String imprimir() {
        StringBuilder sb = new StringBuilder();
        sb.append("Titulo: " + this.titulo + "\n")
                .append("Autor: " + this.autor + "\n")
                .append("Género: " + this.genero + "\n");

        for (Imprimible pagina : this.paginas) {
            sb.append("Tema: " + pagina.imprimir() + "\n");
        }

        return sb.toString();
    }
}
