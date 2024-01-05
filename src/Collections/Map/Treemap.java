package src.Collections.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {

        // Ordena las key o llaves de la lista
        // Se puede aplicar compareTo para ordenar de forma ascedendete o descendente

        // Map<String, Object> persona = new TreeMap<>((a, b) -> b.compareTo(a));

        // Metodo de java8
        Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());

        // Ordena de menos a mayor los String
        // Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length));

        // Valores
        persona.put("name", "Lizandro");
        persona.put("lastname", "Narvaez");
        persona.put("country", "Spain");
        persona.put("age", 30);

        // Añadimos un objeto
        Map<String, String> programacion = new HashMap<>();
        programacion.put("backend", "java, javascript, nodejs");
        programacion.put("frontend", "reactjs");
        programacion.put("herramientas", "git, vscode");
        persona.put("tecnologias", programacion);

        System.out.println(persona);
    }
}
