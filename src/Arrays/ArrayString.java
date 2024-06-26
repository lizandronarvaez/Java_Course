package Arrays;

import java.util.Arrays;
import java.util.Map;

public class ArrayString {
    public static void main(String[] args) {

        // declaracion de variables
        String[] marcasVehiculos = { "Nissan", "Mercedez", "Opel", "Seat", "Audi", "Volkswagen" };

        // Ordenar datos de un array
        Arrays.sort(marcasVehiculos);

        //Imprimir un arreglo
        for (String marca : marcasVehiculos) {
            System.out.println(marca);
        }

    }
}
