package src.Arrays;

public class ArreglosCombinados {

    public static void main(String[] args) {

        int[] a, b, c;
        try {

            a = new int[10];
            b = new int[10];
            c = new int[20];

            int aux = 0;
            for (int i = 0; i < a.length; i++) {
                a[i] = i + 1;
                b[i] = (i + 1) * 5;
                c[aux++] = a[i];
                c[aux++] = b[i];
            }

            // Imprimir resultados
            for (int i = 0; i < c.length; i++) {
                System.out.println(c[i]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
