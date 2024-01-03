package src.FlujosControl;

public class BuclesEtiquetasBuscar {
    private static String frase = "tres tristes tigres tragan trigo en un trigal, pero de tanto comer se quedaron sin trigo";
    private static int cantidad = 0;
    private static String palabra = "trigo";

    public static void main(String[] args) {

        // ciclo for
        buscar: for (int i = 0; i < frase.length(); i++) {
            int k = i;
            for (int j = 0; j < palabra.length(); j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }

        // Salida de datos
        System.out.println("Palabra 'trigo' encontrada " + cantidad + " veces");
    }
}
