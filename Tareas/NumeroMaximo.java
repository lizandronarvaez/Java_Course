package Tareas;

import java.util.Scanner;

public class NumeroMaximo {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            int[] arrayNumero = new int[4];
            int numMax = 0;
            int numScaner;
            boolean numExiste;

            // Llenamos el array
            for (int i = 0; i < arrayNumero.length; i++) {

                do {
                    System.out.println("___________________________");
                    System.out.println("Ingresa un número por favor: ");
                    System.out.println("");
                    numScaner = scanner.nextInt();

                    // Comprobar si el número ya existe en el array
                    numExiste = false;
                    for (int j = 0; j < i; j++) {
                        if (arrayNumero[j] == numScaner) {
                            numExiste = true;
                            System.out.println("El número [" + arrayNumero[j] + "] ya existe en la lista");
                            break;
                        }
                    }

                    if (!numExiste) {
                        arrayNumero[i] = numScaner;
                    }

                } while (numExiste);
            }

            for (int i : arrayNumero) {
                if (i > numMax) {
                    numMax = i;
                }
            }
            System.out.println("*****************************************");
            System.out.println("* El numero mas grande la lista es: " + numMax + " *");
            System.out.println("*****************************************");
        }

    }
}
