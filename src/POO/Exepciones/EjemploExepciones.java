package src.POO.Exepciones;

import javax.swing.JOptionPane;

import src.POO.Exepciones.Exceptions.ErrorSplitByString;
import src.POO.Exepciones.Exceptions.ErrorSplitByZero;
import src.POO.Exepciones.Models.Calculadora;

public class EjemploExepciones {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        String numero1 = JOptionPane.showInputDialog("Ingresa un numero");
        String numero2 = JOptionPane.showInputDialog("Ingresa otro numero");
        try {
            double division2 = calculadora.dividir(numero1, numero2);
            System.out.println(division2);
        } catch (Exception e) {
            if (e instanceof ErrorSplitByString) {
                System.out.println(e.getMessage());
            }
            if (e instanceof ErrorSplitByZero) {
                System.out.println(e.getMessage());
            }
            main(args);
        }
        System.out.println("Sigue la ejecución....");
    }
}
