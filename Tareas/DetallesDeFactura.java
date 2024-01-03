package Tareas;

import java.util.Scanner;

public interface DetallesDeFactura {
    public static void main(String[] args) {

        // Metodo scanner
        Scanner scanner = new Scanner(System.in);

        // Variables
        String nombreFactura;
        double precioProducto1, precioProducto2, precioSinImpuestos, precioConImpuesto, calculoImpuesto;

        // instancias del metodo scanner
        System.out.println("Introduce el nombre de la factura: ");
        nombreFactura = scanner.nextLine();
        System.out.println("Introduce el precio del primer producto: ");
        precioProducto1 = scanner.nextDouble();
        System.out.println("Introduce el precio del segundo producto: ");
        precioProducto2 = scanner.nextDouble();
        // Se cierra el metodo una vez utilizado
        scanner.close();

        // Calculo de total de productos
        precioSinImpuestos = (short) precioProducto1 + precioProducto2;
        calculoImpuesto = (short) precioSinImpuestos * 19 / 100;
        precioConImpuesto = (short) precioSinImpuestos + calculoImpuesto;

        // Imprimir el total
        System.out.println(
                "La factura " + nombreFactura + " sin impuesto es de " + precioSinImpuestos
                        + "€, a esta factura hay que sumarle un impuesto de "
                        + calculoImpuesto + "€ quedando la factura con impuestos incluidos de : " + precioConImpuesto
                        + "€");
    }
}
