package src.Ejercicios_Java;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicios_2 {

    public static void main(String[] args) {
        double iva, baseImponible, ivaImporte;
        double total;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Intoduce la base imponible: ");
        baseImponible = sc.nextDouble();

        System.out.println("Introduce el iva a aplicar: ");
        iva = sc.nextDouble();

        total = baseImponible + (baseImponible * iva / 100);
        ivaImporte = (baseImponible * iva / 100);
        System.out.println("El iva aplicado es: " + iva + "%,de un total de " + ivaImporte + "€");
        System.out.println("");
        System.out.println("El total de la base imponible mas el iva es: " + total);

        sc.close();
    }
}