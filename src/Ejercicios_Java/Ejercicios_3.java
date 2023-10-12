package Java_Curso.src.Ejercicios_Java;

import java.util.Scanner;

public class Ejercicios_3 {

    public static void main(String[] args) {

        int totalSegundos, totalSegundosRestantes, segundos, minutos, horas;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce la cantidad de segundos por favor: ");
        totalSegundos = scanner.nextInt();

        horas = totalSegundos / 3600;
        totalSegundosRestantes = totalSegundos % 3600;
        minutos = totalSegundosRestantes / 60;
        segundos = totalSegundosRestantes % 60;

        System.out
                .println("Tiempo equivalente: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos");
        System.out.println("");
        scanner.close();
    }

}
