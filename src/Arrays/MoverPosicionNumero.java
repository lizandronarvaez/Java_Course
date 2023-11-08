package Java_Curso.src.Arrays;

public class MoverPosicionNumero {

    public static void main(String[] args) {

        // Declaracion de array
        int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        // Ultimo elemento del array
        int ultimo = numeros[numeros.length - 1];

        // itecion del array
        for (int i = numeros.length - 2; i >= 0; i--) {

            numeros[i + 1] = numeros[i];

        }

        numeros[0] = ultimo;

        for (int i = 0; i < numeros.length; i++) {

        System.out.println("Posicion: " + i + " - " + numeros[i]);
        }
    }
}
