package src.POO.Interfaces.EjemploImprenta.models.Hojas;

import java.util.ArrayList;
import java.util.List;

import src.POO.Interfaces.EjemploImprenta.interfaces.Imprimible;
import src.POO.Interfaces.EjemploImprenta.models.Persona.Persona;

public class Curriculo extends Hoja implements Imprimible {

    private Persona persona;
    private String profesion;
    private List<String> experiencias;

    public Curriculo(Persona persona, String profesion, String contenido) {
        super(contenido);
        this.persona = persona;
        this.profesion = profesion;
        this.experiencias = new ArrayList<>();
    }

    public Curriculo addExperiencia(String experiencia) {
        experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder();

        sb.append(persona)
                .append("\n")
                .append("Resumen: ")
                .append(this.contenido)
                .append("\n")
                .append("Profesion: ")
                .append(this.profesion)
                .append("\n")
                .append("Experiencias: \n");

        for (String experiencia : this.experiencias) {
            sb.append("- ").append(experiencia).append("\n");
        }
        return sb.toString();
    }

}
