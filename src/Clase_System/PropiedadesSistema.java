package Java_Curso.src.Clase_System;

import java.util.Properties;

public class PropiedadesSistema {

    public static void main(String[] args) {

        // Nombre del usuario del equipo
        String systemUser = System.getProperty("user.name");
        // directorio raiz
        String home = System.getProperty("user.home");
        // directorio de la carpeta de trabajo
        String workspace = System.getProperty("user.dir");
        // version de java
        String javaVersion = System.getProperty("java.version");
        // separacion de linea
        String lineSeparator = System.getProperty("line.separator");
        // propiedades sistema
        Properties propertiesSo = System.getProperties();

        // Salida de datos
        System.out.println(systemUser);
        System.out.println(home);
        System.out.println(workspace);
        System.out.println(javaVersion);
        System.out.println(lineSeparator);
        propertiesSo.list(System.out);
    }
}
