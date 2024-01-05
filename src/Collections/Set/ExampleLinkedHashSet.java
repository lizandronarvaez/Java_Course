package src.Collections.Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExampleLinkedHashSet {
    public static void main(String[] args) {

        // Mantiene el orden de la insercion de los datos pero no acepta duplicidad
        Set<String> listHashSet = new LinkedHashSet<>();
        System.out.println("Nº elementos en la lista: " + listHashSet.size());
        System.out.println("La lista está vacia? " + (listHashSet.isEmpty() ? "Sí" : "No"));
        listHashSet.add("Madrid");
        listHashSet.add("Barcelona");
        listHashSet.add("Ciudad Real");
        listHashSet.add("Valencia");
        listHashSet.add("Málaga");
        listHashSet.add("Malaga");

        System.out.println("Nº elementos en la lista: " + listHashSet.size());
        // comprueba
        boolean exist = listHashSet.contains("Madrid");
        System.out.println(exist);
        // imprimir
        System.out.println(listHashSet);

    }
}
