package src.Arrays;

public class ArreglosCombinados3 {
    public static void main(String[] args) {

        int[] arreglo1, arreglo2, arreglo3;

        arreglo1 = new int[10];
        arreglo2 = new int[10];
        arreglo3 = new int[20];

        int aux = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = i + 1;
        }

        for (int i = 0; i < arreglo2.length; i++) {
            arreglo2[i] = (i + 1) * 5;

        }

        for (int i = 0; i < arreglo2.length; i += 2) {

            for (int j = 0; j < 2; j++) {

                arreglo3[aux++] = arreglo1[i + j];
            }
            for (int j = 0; j < 2; j++) {

                arreglo3[aux++] = arreglo2[i+j];
            }

        }
        for (int i = 0; i < arreglo3.length; i++) {
            // System.out.println(arreglo1[i]);
            // System.out.println(arreglo2[i]);
            System.out.println(arreglo3[i]);
        }
    }
}
