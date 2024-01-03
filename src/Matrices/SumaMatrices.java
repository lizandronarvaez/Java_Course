package src.Matrices;

public class SumaMatrices {
    public static void main(String[] args) {

        int[][] numeros1 = {
                { 1, 2, 3, 4, 5 },
                { 2, 4, 6, 8, 10 },
                { 10, 20, 30, 40, 50 }
        };
        int[][] numeros2 = {
                { 1, 1, 1, 1, 1 },
                { 2, 2, 2, 2, 2 },
                { 3, 3, 3, 3, 3 }
        };

        int[][] suma = new int[3][5];

        for (int i = 0; i < numeros1.length; i++) {
            for (int j = 0; j < numeros1[i].length; j++) {
                suma[i][j] = numeros1[i][j] + numeros2[i][j];
            }
        }

        for (int i = 0; i < suma.length; i++) {
            for (int j = 0; j < suma[i].length; j++) {
                System.out.print(suma[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
