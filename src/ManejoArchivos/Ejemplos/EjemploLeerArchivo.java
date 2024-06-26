package ManejoArchivos.Ejemplos;

import ManejoArchivos.Ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        String archivo="/home/narvaez/Escritorio/Curso_Java_Udemy/src/ManejoArchivos/Archivos/lectura_archivo.txt";

        ArchivoServicio archivoServicio= new ArchivoServicio();


        System.out.println();
        System.out.println("****Lectura de archivos con BufferReader****");
        System.out.println(archivoServicio.leerArchivo(archivo));
        System.out.println();

        System.out.println("****Lectura de archivos con Scanner****");
        System.out.println(archivoServicio.leerArchivo2(archivo));
    }
}
