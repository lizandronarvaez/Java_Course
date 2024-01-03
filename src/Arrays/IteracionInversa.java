package src.Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import javax.swing.JOptionPane;

public class IteracionInversa {

    public static void main(String[] args) {
        
        String[] nombres = new String[5];

        // Llenar datos con ventana joptionpane
        for (int i = 0; i < nombres.length; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingresa un nombre").toUpperCase().trim();
            nombres[i] = nombre;
        }
        
        // ordenar los nombres
        Arrays.sort(nombres);
        
        /**
         * Imprimir los datos de inversa
         * No funciona con datos numericos
         * Se usa la api collections y se para por argumento el array.list
         */
        // Collections.reverse(Arrays.asList(nombres));

        // Imprimir datos de forma descendente
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posicion " + i + " : " + nombres[i]);
        }

    }
}
