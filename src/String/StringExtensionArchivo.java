package Java_Curso.src.String;

public class StringExtensionArchivo {

    public static void main(String[] args) {

        // Declaracion variables
        String tipoArchivo = "imagen_perfil.jpeg";

        // Obtener la posicion de la extesion del archivo
        int obtenerExtension = tipoArchivo.indexOf(".");
        int obtenerExtension2 = tipoArchivo.lastIndexOf(".");
        // SOUT
        System.out.println(tipoArchivo.substring(obtenerExtension + 1));
        System.out.println(tipoArchivo.substring(obtenerExtension2 + 1));
    }
}
