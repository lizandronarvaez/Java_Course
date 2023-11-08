package Java_Curso.src.Arrays;

import java.util.Scanner;

public class MoverPosicionNumero2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaracion de array
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        // Posiciones array
        int item, pos = 0;

        // SOUT
        System.out.println("Introduce el numero que quieres guardar: ");
        item = scanner.nextInt();

        System.out.println("");
        System.out.println("Introduce la posicion que quieres guardar el numero: ");
        pos = scanner.nextInt();
        // itecion del array
        for (int i = numeros.length - 2; i >= pos; i--) {
            numeros[i + 1] = numeros[i];
        }

        numeros[pos] = item;
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("Posicion: " + i + " - " + numeros[i]);
        }
    }
}
