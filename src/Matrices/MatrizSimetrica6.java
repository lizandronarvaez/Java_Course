package Java_Curso.src.Matrices;

public class MatrizSimetrica6 {
    public static void main(String[] args) {

        int[][] matrizSimetrica = {
                { 1, 2, 3, 4 },
                { 2, 1, 0, 5 },
                { 3, 0, 1, 6 },
                { 4, 5, 6, 8 }
        };
        boolean simetria = true;

        int i = 0, j = 0;

        while (i < matrizSimetrica.length && simetria) {

            while (j < i && simetria) {
                if (matrizSimetrica[i][j] != matrizSimetrica[j][i]) {
                    simetria = false;
                }
                j++;
            }
            i++;
        }

        if (simetria) {
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("La matriz no es simetrica");
        }
    }
}
