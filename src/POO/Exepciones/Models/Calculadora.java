package src.POO.Exepciones.Models;

import src.POO.Exepciones.Exceptions.ErrorSplitByString;
import src.POO.Exepciones.Exceptions.ErrorSplitByZero;

public class Calculadora {

    public double dividir(int numero1, int numero2) throws ErrorSplitByZero {
        if (numero1 == 0 || numero2 == 0) {
            throw new ErrorSplitByZero("No se puede dividir por 0");
        }
        return numero1 / (double) numero2;
    }

    public double dividir(String numero1, String numero2) throws ErrorSplitByZero, ErrorSplitByString {

        try {
            int valor1 = Integer.parseInt(numero1);
            int valor2 = Integer.parseInt(numero2);
            return this.dividir(valor1, valor2);
        } catch (NumberFormatException e) {
            throw new ErrorSplitByString("Solo se permiten números");
        }
    }
}