package src.Arrays;

import java.util.Scanner;

public class BusquedaElemento {

    public static void main(String[] args) {

        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int numBusqueda = 0;
        boolean numExiste = false;
        System.out.println("");
        System.out.println("****************************");
        System.out.println("Nº a comprobar en la lista: ");
        numBusqueda = scanner.nextInt();
        scanner.close();

        for (int i : numeros) {
            if (i == numBusqueda) {
                numExiste = true;
            }
        }

        if (numExiste) {
            System.out.println();
            System.out.println("El numero esta en la lista");
            System.out.println("");
            return;
        }
        System.out.println("El numero no esta en la lista");
        System.out.println("");
    }
}
