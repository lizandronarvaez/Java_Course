package Tareas;

import java.util.Scanner;

public class Imprimir_X {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el tamaño de la matriz: ");
        int tamañoMatriz = scanner.nextInt();
        scanner.close();

        if (tamañoMatriz == 0) {
            System.out.println("No puedes realizar una matriz de 0");
            System.exit(-1);
        }
        System.out.println("");
        String[][] letraEquis = new String[tamañoMatriz][tamañoMatriz];

        for (int i = 0; i < letraEquis.length; i++) {
            for (int j = 0; j < letraEquis[i].length; j++) {

                if (i == j || (j == tamañoMatriz - i - 1)) {
                    System.out.print("X");
                }
                System.out.print("_");

            }
            System.out.println("");
        }
        System.out.println();
    }
}
