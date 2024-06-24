package Patrones_Disenio.Composite.Ejemplo;

import Patrones_Disenio.Composite.Archivo;
import Patrones_Disenio.Composite.Directorio;

public class EjemploComposite {
    public static void main(String[] args) {

        Directorio directorio = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));
        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        directorio.addComponente(java);

        directorio.addComponente(new Archivo("cv-lizandro.docx"));
        directorio.addComponente(new Archivo("logo.jpeg"));

        boolean encontrado = directorio.buscar("cv-lizandro.docx");

        encontrado = directorio.buscar("Api Stream");

        System.out.println();
        System.out.println("Encontrado? "+ encontrado);
        // System.out.println(directorio.mostrar(0));
    }
}
