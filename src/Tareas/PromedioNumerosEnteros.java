package Java_Curso.src.Tareas;

import java.util.Scanner;

public class PromedioNumerosEnteros {
    public static void main(String[] args) {

        int[] arrayNumeros = new int[7];

        int numerosNegativos = 0;
        int numerosPositivos = 0;
        int enterosConCeros = 0;
        int numScanner;
        int promedioNumPostivos = 0;
        int promedioNumNegativos = 0;
        boolean isZero = true;

        try (Scanner scanner = new Scanner(System.in)) {

            do {
                for (int i = 0; i < arrayNumeros.length; i++) {
                    System.out.println("Ingresa un numero: ");
                    numScanner = scanner.nextInt();
                    if (numScanner == 0) {
                        isZero = false;
                        System.out.println("No puedes operar con 0");
                    }
                    arrayNumeros[i] = numScanner;
                    if (numScanner >= 10 || numScanner <= -10) {
                        enterosConCeros++;
                    }

                }
            } while (isZero);

            for (int j = 0; j < arrayNumeros.length; j++) {

                if (arrayNumeros[j] > 0) {
                    promedioNumPostivos += arrayNumeros[j];
                    numerosPositivos++;
                }
                if (arrayNumeros[j] < 0) {
                    promedioNumNegativos += arrayNumeros[j];
                    numerosNegativos++;
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (numerosPositivos == 0) {
            System.out.println("No existen numeros positivos");
        } else {
            System.out.println("Numeros Positivos: " + numerosPositivos);
            System.out.println("Calculo promedio numeros positivos: " + promedioNumPostivos / numerosPositivos);
        }

        if (numerosNegativos == 0) {
            System.out.println("No existen numeros negativos");
        } else {
            System.out.println("Numeros negativos: " + numerosNegativos);
            System.out.println("Calculo promedio numeros negativos: " + promedioNumNegativos / numerosNegativos);
        }

        if (enterosConCeros == 0) {
            System.out.println("No existen numeros que contengan 0");
        } else {
            System.out.println("Numeros que incluyen ceros: " + enterosConCeros);
        }

    }
}
