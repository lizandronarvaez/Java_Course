package src.Collections.Map;

import java.util.*;

public class ExampleHashMap2 {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();

        // Valores
        persona.put("name", "Lizandro");
        persona.put("lastname", "Narvaez");
        persona.put("country", "Spain");
        persona.put("edad", 30);

        // Añadimos un objeto
        Map<String, String> programacion = new HashMap<>();
        programacion.put("backend", "java, javascript, nodejs");
        programacion.put("frontend", "reactjs");
        programacion.put("herramientas", "git, vscode");
        persona.put("tecnologias", programacion);

        // Imprmir datos
        String name = (String) persona.get("name");
        String lastname = (String) persona.get("lastname");
        String country = (String) persona.get("country");
        // tecnologias
        Map<String, String> tecnologias = (Map<String, String>) persona.get("tecnologias");
        String frontend = tecnologias.get("frontend");
        String backend = tecnologias.get("backend");
        String herramientas = tecnologias.get("herramientas");

        // imprimir
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("Hola soy ")
                .append(name)
                .append(" ")
                .append(lastname)
                .append(" vivo en ")
                .append(country)
                .append(" soy fullstack ")
                .append("tengo experiencia en ")
                .append(frontend)
                .append(", ")
                .append(backend)
                .append(", ")
                .append(herramientas);
        System.out.println(sBuilder.toString());
    }
}
