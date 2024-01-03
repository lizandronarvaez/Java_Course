package Tareas;

import java.util.Scanner;

public class Imprimir_Silla {

    public static void main(String[] args) {

        // Metodo Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce el tamaño de la matriz: ");
        int tamañoMatriz = scanner.nextInt();
        String[][] matriz = new String[tamañoMatriz][tamañoMatriz];
        System.out.println();
        //
        if (tamañoMatriz == 0) {
            System.out.println("No se puede crear una matriz con ese numero");
            System.exit(1);
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (j == 0 || (j == tamañoMatriz / 2 && j != 0 && j != tamañoMatriz - 1)
                        || (j == tamañoMatriz - 1 && i >= tamañoMatriz / 2)) {
                    System.out.print("h");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
