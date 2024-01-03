package Tareas;

import java.util.Scanner;

public class ProgamaManejoDeNombres {
    public static void main(String[] args) {
        // Declaracion de scanner
        Scanner scanner = new Scanner(System.in);

        // Declaracion de variables
        String nombrePersona1, nombrePersona2, nombrePersona3;
        String nuevaPersona1, nuevaPersona2, nuevaPersona3;
        // ENTRADA DE DATOS
        System.out.println("Introduce el nombre de la primera persona: ");
        nombrePersona1 = scanner.nextLine();
        System.out.println("Introduce el nombre de la segunda persona: ");
        nombrePersona2 = scanner.nextLine();
        System.out.println("Introduce el nombre de la tercera persona: ");
        nombrePersona3 = scanner.nextLine();
        scanner.close();
        // Aplicando metodos
        nuevaPersona1 = nombrePersona1.substring(1, 2).toUpperCase().concat(".")
                .concat(nombrePersona1.substring(nombrePersona1.length() - 2));
        nuevaPersona2 = nombrePersona2.substring(1, 2).toUpperCase().concat(".")
                .concat(nombrePersona2.substring(nombrePersona2.length() - 2));
        nuevaPersona3 = nombrePersona3.substring(1, 2).toUpperCase().concat(".")
                .concat(nombrePersona3.substring(nombrePersona3.length() - 2));

        // Resultado final
        String nombres = nuevaPersona1.concat("_").concat(nuevaPersona2).concat("_").concat(nuevaPersona3);
        // Salida de resultados
        System.out.println(nuevaPersona1);
        System.out.println(nuevaPersona2);
        System.out.println(nuevaPersona3);
        System.out.println("");
        System.out.println("Este es el resultado del ejercicio: ".concat(nombres));
        System.out.println("");
    }

}
