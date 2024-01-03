package src.Arrays;

import javax.swing.JOptionPane;

public class ArraysPushIteracion {
    public static void main(String[] args) {

        int[] numeros = new int[5];

        // Llenar datos con ventana joptionpane
        for (int i = 0; i < numeros.length; i++) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero entero"));
            numeros[i] = numero;
        }

        // imprimir datos del array
        // for (int i : numeros) {
        // System.out.println("El numero introducido en el Array numeros es: " + i);
        // }
    }
}
