package Java_Curso.src.String;

public class StringMetodosArreglos {
    public static void main(String[] args) {
        // Declaracion de variables
        String trabaLenguas = "Trabajando";
        String nombreArchivo = "formulario.pdf";

        // Transformar a arreglo
        char[] arreglo = trabaLenguas.toCharArray();
        int largo = arreglo.length;

        String[] arregloString = trabaLenguas.split("[.]");
        int logitudArreglo = arregloString.length;

        String[] obtenerExtension = nombreArchivo.split("\\."); // o "[.]""
        String extensionArchivo = obtenerExtension[obtenerExtension.length - 1];

        // bucles
        for (int i = 0; i < largo; i++) {
            // System.out.println("arreglo = " + arreglo[i]);
        }

        for (int j = 0; j < logitudArreglo; j++) {
            // System.out.println(arregloString[j]);

        }

        for (int j = 0; j < obtenerExtension.length; j++) {
            System.out.println("");
            System.out.println(obtenerExtension[j]);
        }

        // sout
        System.out.println("");
        System.out.println("La extesion del archivo introducido es: " + extensionArchivo);
        System.out.println("");

    }
}
