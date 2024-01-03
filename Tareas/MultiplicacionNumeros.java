package Tareas;

import java.util.Scanner;

public class MultiplicacionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingres Numero 1:");
        int numero1 = scanner.nextInt();
        System.out.println("Ingres Numero 2:");
        int numero2 = scanner.nextInt();
        int numero1Abs = Math.abs(numero1);
        int numero2Abs = Math.abs(numero2);
        int total = 0;

        for (int i = 0; i < numero1Abs; i++) {
            total += numero2Abs;
        }

        if (!(numero1 > 0 && numero2 > 0 || numero1 < 0 && numero2 < 0)) {
            total = -total;
        }
        System.out.println("total = " + total);
    }
}
