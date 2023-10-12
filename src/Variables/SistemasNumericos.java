package Java_Curso.src.Variables;

public class SistemasNumericos {

    public static void main(String[] args) {
        int numeroDecimal = 1500;
        /**
         * conversion de numeros
         */
        // conversion de numero enter a hexadecimal
        System.out.println("Formato Hexadecimal: " + Integer.toBinaryString(numeroDecimal));

        // Conversion de binario a entero
        int numeroBinario = 0b10111011100;
        System.out.println("Formato numero entero: 0b10111011100 es  " + numeroBinario);

        // Conversion Entero a octadecimal se añade un cero ala izquierda
        int numeroOctal = 02734;
        System.out.println("Formato numero octal: " + Integer.toOctalString(numeroDecimal));
        System.out.println("Formato numero entero: " + numeroOctal);

        // Conversion de entero a hexadecimal
        int numeroHexadecimal = 0x5dc;
        System.out.println("Numero 1500 transformado a hexadecimal es: " + Integer.toHexString(numeroDecimal));
        System.out.println("Hexadecimal 0x5dc a numero entero es: "+ numeroHexadecimal);
    }
}
