package ManejoArchivos.Ejemplos.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {
    public void crearArchivo(String nombre, String texto) {

        // Crea el archivo
        File archivo = new File(nombre);

        try {

            // Crea la instancia para escribir en el archivo
            FileWriter escritor = new FileWriter(archivo, true);
            BufferedWriter bufferedWriter = new BufferedWriter(escritor);

            // escribe el texto en el archivo
            bufferedWriter.write(texto);

            // cierra el texto
            bufferedWriter.close();
            System.out.println();
            System.out.println("El archivo se creo con éxito!");
        } catch (IOException e) {

            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre, String texto) {

        // Crea el archivo
        File archivo = new File(nombre);

        try {

            // Crea la instancia para escribir en el archivo
            FileWriter escritor = new FileWriter(archivo, true);
            PrintWriter printWriter = new PrintWriter(escritor);
            // escribe el texto en el archivo
            printWriter.println(texto);

            // cierra el texto
            printWriter.close();
            ;
            System.out.println();
            System.out.println("El archivo se creo con éxito!");
        } catch (IOException e) {

            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre) {
        StringBuilder sBuilder = new StringBuilder();
        File archivo = new File(nombre);

        try {
            // Leer un archivo
            FileReader fileReader = new FileReader(archivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            // Lee una linea del archivo
            String linea;

            // Leer todas las linea del archivo
            while ((linea = bufferedReader.readLine()) != null) {
                // Y las agrega
                sBuilder
                        .append(linea)
                        .append("\n");
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retorna el stringbulder
        return sBuilder.toString();
    }

    public String leerArchivo2(String nombre) {
        StringBuilder sBuilder = new StringBuilder();
        File archivo = new File(nombre);

        try {
            // Leer un archivo
            Scanner scanner = new Scanner(archivo);
            scanner.useDelimiter("\n");
            
            // Leer todas las linea del archivo
            while (scanner.hasNext()) {
                // Y las agrega
                sBuilder
                        .append(scanner.next())
                        .append("\n");
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Retorna el stringbulder
        return sBuilder.toString();
    }
}