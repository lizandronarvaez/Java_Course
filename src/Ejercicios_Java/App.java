package Java_Curso.src.Ejercicios_Java;

import java.util.Scanner;

public class App {

    public static void main(String args[]) throws Exception {
        Telefono nexus = new Telefono("Azul", "Google", "Nexus", "32GB");

        int x = 2;
        // Tu puedes escribir una condicicion ternario en una variable y luego
        // ejecutarla
        String str = x > 5 ? x + " es mayor que 5" : x + " es menor que 5";

        // Llamada al metido hacer llamada de la clase Telefono
        // nexus.enviarMensaje("Enviando mensaje...");

        Genericos<Integer, String> clazz = new Genericos<>(29, "hola mundo");
        Integer param1 = clazz.getGenericOne();
        String param2 = clazz.getGenericTwo();

        // Entradas por teclado
        Scanner scaner = new Scanner(System.in);
        System.out.println("Bienvenido,presentate, cual es tu nombre?");
        String nombre = scaner.nextLine();
        System.out.println("Hola " + nombre);
    }
}
