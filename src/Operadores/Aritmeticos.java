package Java_Curso.src.Operadores;



public class Aritmeticos {
    public static void main(String[] args) {

        // Declaracion de variables
        int x = 5, y = 3, suma, resta, multiplicacion, division, resto;

        // entrada de datos
        suma = x + y;
        resta = x - y;
        multiplicacion = x * y;
        division = x / y;
        resto = x % y;

        // sout
        System.out.println("");
        System.out.println("La suma de x + y es: " + suma);
        System.out.println("La resta de x - y es: " + resta);
        System.out.println("La multiplicacion de x * y es: " + multiplicacion);
        System.out.println("La multiplicacion de x / y es: " + (float) division);
        System.out.println("El resto de x % y es: " + resto);

        System.out.println("");
    }
}
