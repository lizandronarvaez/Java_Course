package src.Arrays;

import java.util.ArrayList;

public class ParesImparesArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> numerosPares = new ArrayList<>();
        ArrayList<Integer> numerosImpares = new ArrayList<>();

        for (int i = 1; i < 20; i++) {
            numeros.add(i);
        }

        for (int numero : numeros) {

            if (numero % 2 == 0) {
                numerosPares.add(numero);
            }

            if (!(numero % 2 == 0)) {
                numerosImpares.add(numero);
            }
        }
        // salida de datos
        System.out.println("");
        System.out.println("Todos los numeros: " + numeros);
        System.out.println("Numeros pares: " + numerosPares);
        System.out.println("Numeros impares: " + numerosImpares);

        System.out.println("");
    }
}
