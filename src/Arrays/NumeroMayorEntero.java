package Java_Curso.src.Arrays;

import java.util.Scanner;

public class NumeroMayorEntero {
    public static void main(String[] args) {

        // metodo scaner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de variables
        int[] numeros = new int[5];
        int numMax = 0;
        
        // Llenamos el array
        System.out.println("Ingresa numeros enteros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        for (int i = 1; i < numeros.length; i++) {
            numMax = (numeros[numMax] > numeros[i]) ? numMax : i;
        }

        System.out.println("El numero mayor es: " + numeros[numMax]);
    }
}
