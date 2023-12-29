package src.POO.Interfaces.EjemploImprenta;

import src.POO.Interfaces.EjemploImprenta.interfaces.Imprimible;
import src.POO.Interfaces.EjemploImprenta.models.Hojas.*;
import src.POO.Interfaces.EjemploImprenta.models.Libro.*;
import src.POO.Interfaces.EjemploImprenta.models.Persona.Persona;

public class EjemploImprenta {

    public static void main(String[] args) {
        // curriculum
        Curriculo curriculo = new Curriculo(new Persona("Lizandro", "Narvaez"), "Ingeniero Software",
                "Desarrollador de software");
        curriculo.addExperiencia("Java")
                .addExperiencia("SpringBoot")
                .addExperiencia("Desarrollador Backend")
                .addExperiencia("Desarrollador Frontend")
                .addExperiencia("Desarrollador FullStack");

        // informe
        Informe informe = new Informe("Estudio sobre microservicios", new Persona("Martin", "martin"),
                new Persona("Freddy", "Ghoslyn"));

        // libro
        Libro libro = new Libro(new Persona("Erich", "Gamma"), "Patrones de diseño", Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patron Singlenton"))
                .addPagina(new Pagina("Patron Builder"))
                .addPagina(new Pagina("Patron MVC"))
                .addPagina(new Pagina("Patron Factory"));

        // salida de datos
        imprimir(curriculo);
        imprimir(informe);
        imprimir(libro);
    }

    // metodo de la clase main
    public static void imprimir(Imprimible imprimible) {
        System.out.println();
        System.out.println(imprimible.imprimir());
    }
}
