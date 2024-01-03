package src.Matrices;

import java.util.Scanner;

public class ExampleMatrices5 {
    public static void main(String[] args) {

        // Busqueda de un elemento en una matriz
        Scanner scanner = new Scanner(System.in);
        String[][] marcasVehiculos = {
                { "Opel", "Nissan", "Seat" },
                { "Volvo", "Jeep", "Toyota" },
                { "Audi", "Volkswagen", "Mercedez" }
        };

        String marcaExiste;
        boolean encontrado = false;
        int i = 0;
        int j = 0;
        buscar: for (i = 0; i < marcasVehiculos.length; i++) {
            for (j = 0; j < marcasVehiculos[i].length; j++) {
                System.out.println("Introduce una marca: ");
                marcaExiste = scanner.nextLine();
                System.out.println("Buscando en el arreglo[" + i + "]");
                if (marcasVehiculos[i][j].equalsIgnoreCase(marcaExiste)) {
                    encontrado = true;
                    break buscar;
                } else {
                }
            }
        }

        if (encontrado) {

            System.out.println("Encontrado en el arreglo[" + i + "]" + "[" + j + "]");
        } else {

            System.out.println("No se encuentra en el arreglo[" + i + "]");
        }
    }
}
