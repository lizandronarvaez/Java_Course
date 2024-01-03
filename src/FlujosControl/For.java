package src.FlujosControl;

public class For {
    public static void main(String[] args) {
        // Crear un arreglo de string
        // Se puede poner el corchete en el tipo de la variable o en el nombrede la
        // variable
        String nombres[] = { "Lizandro", "Marina", "Jean Carlos", "Carlos Gonzalo", "Admin", "Superusuario" };

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase("lizandro")) {
                continue;
            }
            System.out.println(nombres[i]);
        }
    }
}
