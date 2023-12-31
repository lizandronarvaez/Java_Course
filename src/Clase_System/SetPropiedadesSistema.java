package src.Clase_System;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class SetPropiedadesSistema {
    public static void main(String[] args) {
        
        // Declaracion de variables
        String workSpace = System.getProperty("user.dir");
        String ruta = workSpace.concat("/Java_Curso/src/config.properties");

        try {

            // Se busca el archivo y se lee
            FileInputStream fileInputStream = new FileInputStream(ruta);
            // Se carga los archivos con la clase properties
            Properties po = new Properties(System.getProperties());
            // Se carga el archivo
            po.load(fileInputStream);
            // establecer valores
            po.setProperty("mi.propiedad.personalizada", "Estos es una configuracion personalizada");
            // OBetener una propiedad personalidad
            po.getProperty("llave");
            System.out.println("Obtener el valor de una propiedad po.getProperty('key'): "
                    + po.getProperty("config.puerto.servidor"));
            // establecer valores en el sistema
            System.setProperties(po);
            // Leer las configuracion del sisteman
            // System.getProperties().list(System.out);

        } catch (Exception e) {
            System.out.println("No existe el archivo" + e);
            e.printStackTrace();
        }
    }
}
