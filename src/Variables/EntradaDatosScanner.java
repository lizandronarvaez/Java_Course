package Java_Curso.src.Variables;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatosScanner {
    public static void main(String[] args) {

        int numeroDecimal;
        // in=> significa entrada, Entrada de datos por terminal
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ingrese un numero:");
            numeroDecimal = scanner.nextInt();
            System.out.println(numeroDecimal);
        } catch (InputMismatchException e) {
            System.out.println("Debes ingresar un numero");
            main(args);
            System.exit(0);
        }
        
        scanner.close();
    }
}
