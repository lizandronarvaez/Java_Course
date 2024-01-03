package Tareas;

import java.util.ArrayList;
import java.util.Scanner;

public class HIstogramaNumeros {

    public static void main(String[] args) {
        ArrayList<Integer> arrNumeros = new ArrayList<Integer>();
        ArrayList<String> arrString = new ArrayList<String>();

        int longitudArrNumeros = 4;
        int longitudArrString = 4;
        int numScanner = 0;
        int aux = 0;
        String simbol = "";

        boolean isZero = true;

        try (Scanner scanner = new Scanner(System.in)) {

            for (int i = 0; i < longitudArrNumeros; i++) {
                do {

                    System.out.println("Ingresa un numero: ");
                    numScanner = scanner.nextInt();
                    if (numScanner == 0) {
                        System.out.println("No se puede ingresar 0");
                        isZero = false;
                        break;
                    }
                    arrNumeros.add(numScanner);
                    break;
                } while (isZero);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // TODO: SOLUCIONAR la salida de datos con "*"
        
        for (int index = 0; index < longitudArrString; index++) {

            aux = index + 1;
            simbol = aux + ":";
            for (int num : arrNumeros) {
                if (aux == num) {
                    simbol += "* \n";
                }
            }

        }
        // Resultados
        System.out.println(simbol);
    }
}
