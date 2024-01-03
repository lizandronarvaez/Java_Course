package src.Variables;

public class ConversionesPrimitivos {
    public static void main(String[] args) {

        // Declaraciones variables
        int numero = 22000;

        // Conversiones a otro tipo de datos
        // Se realiza añadiendo un cast entre parentesis el numero a que queremos
        // convertirlo
        short numeroNuevo = (short) numero;
        long numeroNuevo2 = (long) numero;
        // Sout
        System.out.println("");
        System.out.println("Conversion a short: " + numeroNuevo);
        System.out.println("Maximo valor que soporta short: " + Short.MAX_VALUE);
        System.out.println("");
        System.out.println("Conversion a long: " + numeroNuevo2);
        System.out.println("");
    }
}
