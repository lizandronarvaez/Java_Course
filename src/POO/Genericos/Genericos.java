package src.POO.Genericos;

import java.util.Arrays;
import java.util.List;

public class Genericos {

    public static void main(String[] args) {

        String[] listaCiudades = { "Madrid", "Barcelona", "Valencia", "Sevilla", "Málaga" };
        Integer[] numerosLista = { 10, 20, 30, 40, 50 };

        // Genericos 1 parametro
        List<String> ciudades = convertirArrayList(listaCiudades);
        ciudades.forEach(ciudad -> System.out.println("Metodo List: " + ciudad));

        List<Integer> numeros = convertirArrayList(numerosLista);
        numeros.forEach(numero -> System.out.println("Metodo List: " + numero));

        // Genericos 2 parametros
        List<String> genericos2lList = convertirArrayList(listaCiudades, numerosLista);
        genericos2lList.forEach(data -> System.out.println("Método impresión LIST:" + data));

        // List
        Integer numMaximo = orderNumber(10, 3);
        System.out.println("El numero maximo es: " + numMaximo);
    }

    // Genericos pasando por parametro uno
    public static <T extends Number> List<T> convertirArrayList(T[] array) {
        return Arrays.asList(array);
    }

    public static <T> List<T> convertirArrayList(T[] array) {
        return Arrays.asList(array);
    }

    public static <T extends Number & Comparable<T>> int orderNumber(T numero, T numero2) {
        T numMax = numero;
        return numMax.compareTo(numero2);
    }

    // Genericos pasando 2 por parametros
    public static <S, I> List<S> convertirArrayList(S[] arrayString, I[] arrayInteger) {
        System.out.println();
        for (I item : arrayInteger) {
            System.out.println("Método impresión ARRAY:" + item);
        }
        return Arrays.asList(arrayString);
    }
}
