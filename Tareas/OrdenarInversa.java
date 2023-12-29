package Java_Curso.src.Tareas;

import java.util.Scanner;

public class OrdenarInversa {

    public static void main(String[] args) {

        // Metodo scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de variables
        int[] arrayNumeros = new int[10];

        // Mensaje introduce numeros
        // bucle
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Introduce un numero: ");
            arrayNumeros[i] = scanner.nextInt();

        }
        // lista de numeros arrays
        for (int i = 0; i <= arrayNumeros.length - 1; i++) {
            System.out.println("Posicion => " + i + " - " +
                    arrayNumeros[9 - i]);
            System.out.println(arrayNumeros[i]);
        }

    }
}
