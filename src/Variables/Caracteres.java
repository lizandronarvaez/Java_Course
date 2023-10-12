package Java_Curso.src.Variables;

public class Caracteres {
    // Los caracteres se escribren con comillas simples
    static char caracter = 'h';

    public static void main(String[] args) {

        System.out.println(caracter);
        System.out.println("Tipo char corresponde en byte a: " + Character.BYTES);
        System.out.println("Tipo char corresponde en bites a: " + Character.SIZE);
        System.out.println("Valor maximo de byte: " + Character.MAX_VALUE);
        System.out.println("Valor minimo de byte: " + Character.MIN_VALUE);
    }
}
