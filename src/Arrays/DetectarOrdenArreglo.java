package Java_Curso.src.Arrays;

import java.util.Scanner;

public class DetectarOrdenArreglo {

    public static void main(String[] args) {

        // metodo scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de arrelo
        int[] numeros = new int[5];
        boolean ordenAsc = false;
        boolean ordenDesc = false;
        //
        System.out.println("Ingresa los numeros por favor: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 0; i < numeros.length - 1; i++) {

            if (numeros[i] > numeros[i + 1]) {
                ordenDesc = true;
            }

            if (numeros[i] < numeros[i + 1]) {
                ordenAsc = true;
            }
        }

        if (ordenDesc == true && ordenAsc == true) {
            System.out.println("El arreglo esta desordenado");
        }

        if (ordenDesc == false && ordenAsc == false) {
            System.out.println("El arreglo es igual");
        }

        if (ordenDesc == true && ordenAsc == false) {
            System.out.println("El arreglo esta ordenador de forma descendente");
        }
        if (ordenDesc == false && ordenAsc == true) {
            System.out.println("El arreglo esta ordenador de forma ascendente");
        }
    }
}
