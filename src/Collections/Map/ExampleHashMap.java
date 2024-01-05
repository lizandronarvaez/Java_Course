package src.Collections.Map;

import java.util.*;

public class ExampleHashMap {
    public static void main(String[] args) {

        // Se almacena con llave/valor y los valores se puede repetir, y no se ordenan
        // las llaves como los treemap
        Map<Integer, String> ciudades = new HashMap<>();

        ciudades.put(1, "Madrid");
        ciudades.put(2, "Barcelona");
        ciudades.put(3, "Valencia");

        // Si la llave esta repetida se almacena el ultimo valor
        ciudades.put(4, "Galicia");
        ciudades.put(4, "Galicia");

        // Remover o eliminar
        // ciudades.remove(1);
        // Elimina todos
        // ciudades.clear();

        // Imprmir solo los valores
        Collection<String> valoresCiudades = ciudades.values();
        System.out.println(valoresCiudades);

        // Comprueba si existe a traves de un boolean
        boolean existe = ciudades.containsValue("Madrid");
        boolean existe2 = ciudades.containsKey(1);

        System.out.println(existe);
        System.out.println(existe2);

        // Imprime las llaves
        Set<Integer> llavesCiudades = ciudades.keySet();
        System.out.println(llavesCiudades);

        // Imprimir llave-valor(Esto es JAVA 8)
        System.out.println();
        ciudades.forEach((llave, valor) -> System.out.println("Key: " + llave + " Value: " + valor));

        // Reemplazar un valor
        ciudades.replace(1, "Madrid-Atocha");

        System.out.println();
        System.out.println(ciudades);
    }
}
