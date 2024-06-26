package ManejoArchivos.Ejemplos;

import ManejoArchivos.Ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {

    public static void main(String[] args) {

        // Ruta donde se guardara el archivo
        String nombreArchivo = "/home/narvaez/Escritorio/Curso_Java_Udemy/src/ManejoArchivos/Archivos/java_text.txt";

        // Instancia para crear el archivo
        ArchivoServicio archivoServicio = new ArchivoServicio();
        archivoServicio
                .crearArchivo2(
                        nombreArchivo,
                        "Hola estoy creando un archivo con texto incluido\nY esto es una nueva linea\n\n");

    }
}
