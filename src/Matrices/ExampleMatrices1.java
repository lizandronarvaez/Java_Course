package Java_Curso.src.Matrices;

public class ExampleMatrices1 {

    public static void main(String[] args) {

        int[][] numeros = new int[2][4];

        numeros[0][0] = 1;
        numeros[0][1] = 2;
        numeros[0][2] = 3;
        numeros[0][3] = 4;

        numeros[1][0] = 5;
        numeros[1][1] = 6;
        numeros[1][2] = 7;
        numeros[1][3] = 8;

        System.out.println("DimeNsiones matriz: ");
        System.out.println("Numero de columnas: " + numeros.length);
        System.out.println("Numero de filas: " + numeros[0].length);
        System.out.println("Primer elemento del primer arreglo: " + numeros[0][0]);
        System.out.println(
                "Obtener el ultimo elemento de la fila segunda: " + numeros[numeros.length - 1][numeros[1].length - 1]);

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }

    }
}
