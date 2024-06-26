package Arrays;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayNotasAlumnos {

    public static void main(String[] args) {

        ArrayList<Double> claseMatematicas = new ArrayList<>();
        ArrayList<Double> claseHistoria = new ArrayList<>();
        ArrayList<Double> claseLengua = new ArrayList<>();
        int notasMatematicas = 0, notasHistoria = 0, notasLengua = 0;
        ;
        // Entrada de datos por el alumno
        for (int i = 0; i < 7; i++) {
            claseMatematicas.add(
                    Double.parseDouble(JOptionPane.showInputDialog("Introduce 7 notas de alumnos de matemáticas")));
        }

        for (int i = 0; i < 7; i++) {
            claseHistoria
                    .add(Double.parseDouble(JOptionPane.showInputDialog("Introduce 7 notas de alumnos de historia")));
        }

        for (int i = 0; i < 7; i++) {
            claseLengua.add(Double.parseDouble(JOptionPane.showInputDialog("Introduce 7 notas de alumnos de lengua")));

        }

        for (double nota : claseMatematicas) {
            notasMatematicas += nota;
        }
        for (Double nota : claseLengua) {
            notasLengua += nota;
        }

        for (Double nota : claseHistoria) {
            notasHistoria += nota;
        }

        System.out.println("La nota media de todos los alumnos de Matematicas es: "
                + (notasMatematicas / claseMatematicas.size()));
        System.out.println("La nota media de todos los alumnos de Historia es: "
                + (notasHistoria / claseHistoria.size()));
        System.out.println("La nota media de todos los alumnos de Lengua es: "
                + (notasLengua / claseLengua.size()));

    }
}
