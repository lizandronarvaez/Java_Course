package src.Arrays;

import javax.swing.JOptionPane;

public class NombreMasLargo {

    public static void main(String[] args) {

        // Declaracion de array
        String nombres[] = new String[5];
        int nombreLargo = 0;

        for (int i = 0; i < nombres.length; i++) {
            nombres[i] = JOptionPane.showInputDialog("Ingresa un nombre: ").trim().toLowerCase();
        }

        for (int i = 1; i < nombres.length; i++) {

            nombreLargo = (nombres[nombreLargo].length() > nombres[i].length()) ? nombreLargo : i;
        }

        System.out.println("El nombre con mas letras es: " + nombres[nombreLargo]);
    }
}
