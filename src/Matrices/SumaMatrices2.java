package src.Matrices;

public class SumaMatrices2 {

    public static void main(String[] args) {

        int[][] numeros1 = {
                { 1, 2, 3 },
                { 2, 4, 6 },
                { 10, 20, 30 }
        };
        // Si inicializamos la variable y la colocamos fuera se sigue sumando en el valor que ya tiene
        int sumaFila, sumaColumna;

        try {

            for (int i = 0; i < numeros1.length; i++) {
                //Si se inicializa dentro de un bucle, el resultado vuelve a 0 y ya no  se suma el valor anterior
                sumaFila = 0 ;
                sumaColumna = 0;
                for (int j = 0; j < numeros1[i].length; j++) {
                    sumaFila += numeros1[i][j];
                    sumaColumna += numeros1[j][i];
                }

                System.out.println("Total fila " + i + ": " + sumaFila);
                System.out.println("Total suma columna " + i + ": " + sumaColumna);
                System.out.println("");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
