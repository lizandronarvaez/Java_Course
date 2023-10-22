package Java_Curso.src.FlujosControl;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // Comprobar si el numero es par
        
        // Scanner
        Scanner scanner = new Scanner(System.in);
        // Declaracion de variables
        int numero;

        // Entrada de datos
        System.out.println("Introduce el numero para comprobar si es par: ");
        numero = scanner.nextInt();
        scanner.close();

        numero = numero % 2 == 0 ? 0 : 1;

        switch (numero) {
            case 0:
                System.out.println("El numero es par");
                break;
            case 1:
                System.out.println("El numero es impar");
            default:
                break;
        }
    }
}
