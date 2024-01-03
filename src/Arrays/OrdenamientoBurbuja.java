package src.Arrays;

public class OrdenamientoBurbuja {
    public static void main(String[] args) {

        String[] marcasVehiculos = { "Nissan", "Mercedez", "Opel", "Seat", "Audi", "Volkswagen" };
        int contador = 0;

        // Se declara un bucle
        for (int i = 0; i < marcasVehiculos.length; i++) {
            // Se declara otro bucle
            for (int j = 0; j < marcasVehiculos.length; j++) {

                // Se hace un condicion con el metodo compareTO
                if (marcasVehiculos[i].compareTo(marcasVehiculos[j]) < 0) {
                    // Se necesita una variable auxilir
                    String varAuxiliar = marcasVehiculos[i];

                    // Reasignamos el valor al valor i con el de j
                    marcasVehiculos[i] = marcasVehiculos[j];
                    // y el valor de j contiene el valor inicial de el valor de i
                    marcasVehiculos[j] = varAuxiliar;
                }
                contador++;
            }
        }

        System.out.println("Numeros de veces que se incrementa el contador: " + contador);
        
        // Imprimir los datos
        for (int i = 0; i < marcasVehiculos.length; i++) {

            System.out.println("Posicion " + i + " : " + marcasVehiculos[i]);
        }

    }
}
