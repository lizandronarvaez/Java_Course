package src.POO.Interfaces.EjemploImprenta.models.Hojas;

import src.POO.Interfaces.EjemploImprenta.interfaces.Imprimible;
import src.POO.Interfaces.EjemploImprenta.models.Persona.Persona;

public class Informe extends Hoja implements Imprimible {

    private Persona autor, revisor;
    public Informe(String contenido, Persona autor, Persona revisor) {
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Autor: " + this.autor
                + "\n"
                + "Revisado por: " + this.revisor
                + "\n" + this.contenido;
    }

}
