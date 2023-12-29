package src.POO.Sobrecarga_Metodos;

// Usar métodos estaticos sin tener que instanciar la clase

public class EjemploSobrecarga {
    public static void main(String[] args) {

        System.out.println();
        // Acceso a los métodos
        System.out.println("Sumar dos enteros: " + Calculadora.sumar(10, 10, 10, 10, 10));
        System.out.println("Sumar dos float: " + Calculadora.sumar(15.9f, 3.14f));
        System.out.println("Sumar dos double: " + Calculadora.sumar(10.5, 20.5));
        System.out.println("Sumar dos String: " + Calculadora.sumar("2", "2"));
        System.out.println("Sumar int-float: " + Calculadora.sumar(10.5f, 5));
        System.out.println("Sumar dos long: " + Calculadora.sumar(10l, 20l));
        System.out.println();
    }
}
