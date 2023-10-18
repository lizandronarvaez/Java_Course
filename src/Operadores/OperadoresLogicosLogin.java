package Java_Curso.src.Operadores;

import java.util.Scanner;

public class OperadoresLogicosLogin {

    public static void main(String[] args) {
        // Arreglo de String
        // String[] users = new String[2];
        // String[] passwords = new String[2];

        String[] users = { "usuario", "usuario1", "usuario2" };
        String[] passwords = { "123", "123", "1234" };
        // Declaracion de variables
        String isValidUser, isValidPassword;
        boolean isAutenticated = false;

        // credenciales usuarios
        // users[0] = "Lizandro";
        // passwords[0] = "lizan";
        // users[1] = "Marina";
        // passwords[1] = "marina";

        // Metodo scanner
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingresa el nombre de usuario: ");
        isValidUser = scanner.nextLine().toLowerCase();
        System.out.println("Ingresa la password: ");
        isValidPassword = scanner.nextLine();
        scanner.close();

        // condicional
        for (int i = 0; i < users.length; i++) {

            if (users[i].toLowerCase().equalsIgnoreCase(isValidUser)
                    && passwords[i].equalsIgnoreCase(isValidPassword)) {

                isAutenticated = true;
                System.out.println("Bienvenido " + users[i] + " te haz autenticado correctamente");
                return;
            }
        }

        // SALIDA DE DATOS
        System.out.println("Los datos introducidos son incorrectos");
    }
}
