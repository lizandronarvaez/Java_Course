package src.Variables;

public class ConversionDeTIpos2 {
    public static void main(String[] args) {
        // Declaraciones variables
        int numeroEntero = 100;
        double numeroEntero2 = 100.90e2;
        // Conversiones de numeros a string

        // 1ºForma
        String numeroString = Integer.toString(numeroEntero);
        String numeroString2 = Double.toString(numeroEntero2);

        // 2ºForma
        numeroString = String.valueOf(numeroString);
        numeroString2=String.valueOf(numeroEntero2);

        // SOUT
        System.out.println("Numero String 1: " + numeroString);
        System.out.println("Numero String 2: " + numeroString2);
    }
}
