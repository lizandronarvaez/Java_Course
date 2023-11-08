package Java_Curso.src.Arrays;

import java.util.Arrays;

public class IteracionArrays {
    public static void main(String[] args) {

        // declaracion de variables
        String[] marcasVehiculos = { "Nissan", "Mercedez", "Opel", "Seat", "Audi", "Volkswagen" };
        int intentos = 0;

        // Ordenar datos de un array
        // Arrays.sort(marcasVehiculos);

        // Imprimir un arreglo

        // Dos formas de iterar un arreglo
        // for (String marca : marcasVehiculos) {
        // System.out.println(marca);
        // }

        // for (int i = 0; i < marcasVehiculos.length; i++) {
        // intentos++;
        // System.out.println(marcasVehiculos[i]);
        // }

        // while (intentos < marcasVehiculos.length) {
        // System.out.println(marcasVehiculos[intentos]);
        // intentos++;
        // }

        int j = 0;
        do {
            System.out.println(marcasVehiculos[j]);
            j++;
        } while (j < marcasVehiculos.length);


        // salida de datos
        System.out.println(j);
    }
}
