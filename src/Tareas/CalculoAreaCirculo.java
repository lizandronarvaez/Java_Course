package Java_Curso.src.Tareas;

import java.util.Scanner;

public class CalculoAreaCirculo {

    private static double area;
    private static double radio;
    private static final double pi = Math.PI;

    public static void main(String[] args) {

        // Instancia de Scanner
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Introduce el radio del circulo: ");
        radio = scanner.nextDouble();
        // Calcular el radio al cuadrado de un circulo
        area = Math.round(pi * Math.pow(radio, 2));

        // salida de datos
        System.out.println(area);
    }
}
