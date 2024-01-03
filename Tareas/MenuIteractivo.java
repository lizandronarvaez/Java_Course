package Tareas;

import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

public class MenuIteractivo {
    public static void main(String[] args) {
        int opcionMenu;

        do {

            Map<String, Integer> opciones = new HashMap<>();
            opciones.put("Actualizar", 1);
            opciones.put("Eliminar", 2);
            opciones.put("Agregar", 3);
            opciones.put("Listar", 4);
            opciones.put("Salir", 5);

            Object[] opArreglo = opciones.keySet().toArray();
            Object opcion = JOptionPane.showInputDialog(null,
                    "Seleccione un Opción",
                    "Mantenedor de Productos",
                    JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debes seleccionar una operacion");
            }
            opcionMenu = opciones.get(opcion.toString());

            switch (opcionMenu) {
                case 3:
                    System.out.println("Agregar un nuevo usuario");
                    break;
                case 4:
                    System.out.println("Listando todos los usuarios");
                    break;
                case 1:
                    System.out.println("Usuario actualizado correcamente");
                    break;
                case 2:
                    System.out.println("Eliminando usuario");
                    break;
                case 5:
                    System.out.println("Saliendo del programa");
                    break;
                default:
                    break;
            }
        } while (opcionMenu != 5);

    }
}
