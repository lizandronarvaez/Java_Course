package Java_Curso.src.Arrays;

public class OrdenamientoBurbuja2 {

    public static void main(String[] args) {

        String marcas[] = { "Opel", "Nissan", "Bmw", "Audi", "Volvo", "Mercedez", "Seat", "Volskwagen" };
        // Llamar al metodo
        ordenamientoBurbujaOptimizado(marcas);

    }

    public static void ordenamientoBurbujaOptimizado(Object[] arreglo) {

        int contador = 0;
        for (int i = 0; i < arreglo.length; i++) {

            for (int j = 0; j < arreglo.length - 1 - i; j++) {

                if (((String) arreglo[j + 1]).compareToIgnoreCase((String) arreglo[j]) < 0) {
                    Object aux = arreglo[j];

                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
                contador++;
            }
        }

        // MOstrar los datos
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        // IMprimir el contador
        System.out.println("Veces: " + contador);
    }

}
