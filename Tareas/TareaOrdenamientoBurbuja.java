package Tareas;

public class TareaOrdenamientoBurbuja {

    private static String nombres[] = { "Marina", "Lizandro", "Jean Carlos", "Carlos", "Princesa" };

    private static String aux;

    private static int contador = 0;

    // Metodo
    public static void ordenamientoBurbuja() {

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres.length; j++) {

                // Variable auxilia
                aux = nombres[i];

                if (nombres[i].compareTo(nombres[j]) < 0) {
                    nombres[i] = nombres[j];
                    nombres[j] = aux;
                }
                contador++;
            }
        }

        // Ver el resultado
        for (int i = 0; i < nombres.length; i++) {
            System.out.println(nombres[i]);
        }
    }

    public static void main(String[] args) {

        // Llamada al metodo
        ordenamientoBurbuja();

        // contador
        System.out.println("Nº vueltas del contador " + contador);
    }

}
