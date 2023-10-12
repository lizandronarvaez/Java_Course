package Java_Curso.src.Ejercicios_Java;

import java.util.Scanner;

public class Ejercicios_4 {

    public static void main(String[] args) {
        int metros;
        double centimetros, metros_centimetros, milimetros_centimetros, totalCentimetros;
        float milimetros;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce los metros: ");
        metros = scanner.nextInt();

        System.out.println("Introduce los centimetros: ");
        centimetros = scanner.nextDouble();

        System.out.println("Introduce los milimetros: ");
        milimetros = scanner.nextFloat();

        metros_centimetros = metros * 100;
        milimetros_centimetros = milimetros / 10;
        // Total centimetros

        totalCentimetros = metros_centimetros + milimetros_centimetros + centimetros;

        System.out.println("El total de " + metros + " metros, " + milimetros + " milimetros " + centimetros+" centimetros"
                + " es igual a : " + totalCentimetros+" centimetros");
    
        scanner.close();
    }
}
