package Tareas;

import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {

        Float[] numeros = new Float[20];
        int mayor5 = 0;
        float totalMayor5 = 0.00f;
        int entre1y5 = 0;
        float totalEntre1y5 = 0.00f;
        int uno = 0;
        float total = 0.00f;
        String mensajeError = "";

        Scanner s = new Scanner(System.in);

        System.out.println("Introduzca 20 notas finales (de 1 a 7) de los alumnos...");

        for (int i = 0; i < 20; i++) {
            System.out.println("Introduzca una nota...");
            numeros[i] = s.nextFloat();

            if (numeros[i] < 1.00 || numeros[i] > 7.00) {
                mensajeError = "Valor tecleado incorrecto.";
                break;
            }

            System.out.println("Llevamos " + (i++) + " notas de 20");
            if (numeros[i] > 5.0) {
                mayor5++;
                totalMayor5 += numeros[i];
            } else if (numeros[i] > 1.0) {
                entre1y5++;
                totalEntre1y5 += numeros[i];
            } else {
                uno++;
            }
            total += numeros[i];
        }

        if (mensajeError == "") {
            System.out.println(
                    "El total de notas mayor de 5 es " + mayor5 + " y su promedio es " + (totalMayor5 / mayor5));
            System.out.println("El total de notas mayor de 1 y menor de 5 es " + entre1y5 + " y su promedio es "
                    + (totalEntre1y5 / entre1y5));
            System.out.println("El total de notas con valor 1 es " + uno);
            System.out.println("La media total de las notas es " + (total / 20));

        } else {
            System.out.println(mensajeError);
        }

    }
}
