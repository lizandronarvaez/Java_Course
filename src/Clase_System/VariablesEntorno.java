package Java_Curso.src.Clase_System;

import java.util.Map;

public class VariablesEntorno {
    public static void main(String[] args) {

        // Establecemos las variables
        Map<String, String> variables = System.getenv();

        // OBetener un valor
        String username = System.getenv("USERNAME");
        String javaHome = System.getenv("JAVA_HOME");
        String path = System.getenv("PATH");

        /**
         * 
         * Todos las variables de entorno van escritas en mayusculas y si se las llama
         * hay que escribirlas en mayusculas
         * 
         */
        // Obetener a traves del map
        String path2 = variables.get("PATH");
        String nombreUser = variables.get("USERNAME");

        // Buscle de datos
        for (String key : variables.keySet()) {
            System.out.println(key + " = " + variables.get(key));
        }
        // salida de datos
        System.out.println(variables);
        System.out.println(username);
        System.out.println(javaHome);
        System.out.println(path);
        System.out.println(path2);
    }
}
