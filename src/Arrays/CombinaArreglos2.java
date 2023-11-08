package Java_Curso.src.Arrays;

public class CombinaArreglos2 {
    public static void main(String[] args) {

        int[] arreglo1, arreglo2, arreglo3;

        arreglo1 = new int[10];
        arreglo2 = new int[10];
        arreglo3 = new int[20];

        int aux = 0;
        for (int i = 0; i < arreglo1.length; i++) {
            arreglo1[i] = i + 1;
            arreglo2[i] = (i + 1) * 5;
            arreglo3[aux++] = arreglo1[i];
            arreglo3[aux++] = arreglo2[i];
        }

        for (int i = 0; i < arreglo3.length; i++) {
            // System.out.println(arreglo1[i]);
            // System.out.println(arreglo2[i]);
            System.out.println(arreglo3[i]);
        }
    }
}
