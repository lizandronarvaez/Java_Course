package src.Arrays;

public class ArregloPrincipioFInal {

    public static void main(String[] args) {

        // Declaracion de variables
        int numeros[] = new int[10];
        int a[] = new int[10];

        // longitud de numeros
        int total = numeros.length;
        
        // Bucles
        for (int i = 0; i < total; i++) {
            numeros[i] = i + 1;
        }

        // Bcles
        int aux = 0;
        for (int i = 0; i < total - i; i++) {

            a[aux++] = numeros[i];
            a[aux++] = numeros[total - 1 - i];

            // System.out.print(numeros[i] + " ");
            // System.out.println(numeros[total - 1 - i]);
        }

        for (int i = 0; i < a.length ; i++) {
            System.out.println(a[i]);

        }
    }
}
