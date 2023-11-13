package Java_Curso.src.Matrices;

public class MatrizTranspuesta {

    public static void main(String[] args) {

        int[][] arr1, arr2;
        arr1 = new int[8][4];
        arr2 = new int[4][8];

        System.out.println("**Matriz normal**");
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = i + j * 3;
                System.out.print(arr1[i][j] + "\t");
            }
            System.out.println("");
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr2[j][i] = arr1[i][j];
            }
        }
        System.out.println("**Matriz transpuesta**");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
