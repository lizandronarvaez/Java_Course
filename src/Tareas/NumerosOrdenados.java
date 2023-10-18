package Java_Curso.src.Tareas;

import java.util.Scanner;

public class NumerosOrdenados {
    public static void main(String[] args) {
        //
        Scanner scanner = new Scanner(System.in);

        // Declaracion de variables
        int numero1;
        int numero2;

        // Entrada de datos
        System.out.println("Ingresa un primero numero: ");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        scanner.close();

        //
        if (numero1 > numero2) {
            System.out.println(numero1 + " > " + numero2);
            return;
        }
        System.out.println(numero2 + " > " + numero1);

    }
}
