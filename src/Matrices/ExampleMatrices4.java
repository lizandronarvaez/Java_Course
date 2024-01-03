package src.Matrices;

public class ExampleMatrices4 {
    public static void main(String[] args) {

        int[][] numeros = new int[3][];

        numeros[0] = new int[5];
        numeros[1] = new int[3];
        numeros[2] = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Arreglo[" + i + "] contiene: " + numeros[i].length + " elementos");
        }
        // // System.out.println("Numero de arreglos en la lista: " + (numeros.length) +
        // " arreglos");
        // System.out.println("Elementos en el primer arreglo: " + numeros[0].length);
        // System.out.println("Elementos en el segundo arreglo: " + numeros[1].length);
        // System.out.println("Elementos en el tercer arreglo: " + numeros[2].length);

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(i + "\t");
            }
            System.out.println("");
        }
    }
}
