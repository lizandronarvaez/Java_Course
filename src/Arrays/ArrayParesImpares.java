package src.Arrays;

import java.util.ArrayList;

public class ArrayParesImpares {
    public static void main(String[] args) {

        // Declaracion de variblaes
        int[] numeros = new int[20];
        int[] numerosPares;
        int[] numerosImpares;
        int par = 0, impar = 0;
        int j = 0;
        int k = 0;

        try {
            // llenar el array
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = i + 1;

                if (numeros[i] % 2 == 0) {
                    par++;
                } else {
                    impar++;
                }
            }

            numerosPares = new int[par];
            numerosImpares = new int[impar];

            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] % 2 == 0) {
                    numerosPares[j++] = numeros[i];
                } else {
                    numerosImpares[k++] = numeros[i];
                }
            }

            // salida de datos
            for (int l = 0; l < numerosImpares.length; l++) {
                System.out.println("Numero impar:" + numerosImpares[l]);
            }

            for (int i = 0; i < numerosPares.length; i++) {
                System.out.println("Numero par:" + numerosPares[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
