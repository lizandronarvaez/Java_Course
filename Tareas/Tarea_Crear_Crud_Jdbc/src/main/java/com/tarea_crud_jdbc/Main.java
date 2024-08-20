package com.tarea_crud_jdbc;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;

import com.tarea_crud_jdbc.model.Usuario;
import com.tarea_crud_jdbc.repository.Repositoy;
import com.tarea_crud_jdbc.repository.impl.UsuariosRepository;

public class Main {
    public static void main(String[] args) throws SQLException {

        Repositoy<Usuario> repository = new UsuariosRepository();
        Integer option = getOperationPanel();
        StringBuilder listUser = new StringBuilder();
        switch (option) {
            case 1:
                Usuario user = new Usuario();
                user.setUsername(JOptionPane.showInputDialog("Introduce un nombre").trim().toLowerCase());
                user.setPassword(JOptionPane.showInputDialog("Introduce una contraseña").trim().toLowerCase());
                user.setEmail(JOptionPane.showInputDialog("Introduce un email").trim().toLowerCase());

                repository.crearUsuario(user);
                System.out.println();
                System.out.println("¡Usuario creado correctamente!");
                break;
            case 2:
                if (repository.verTodosUsuarios().isEmpty()) {
                    System.out.println("No existen usuarios");
                }
                // Obtener todos los usuarios
                repository.verTodosUsuarios().forEach(u -> {
                    listUser.append("ID: ").append(u.getId())
                            .append(" || NOMBRE: ").append(u.getUsername())
                            .append(" || PASSWORD: ").append(u.getPassword())
                            .append(" || EMAIL: ").append(u.getEmail())
                            .append("\n");
                });
                JOptionPane.showMessageDialog(null, listUser, "Lista de usuarios", JOptionPane.INFORMATION_MESSAGE);
                break;
            // TODO!! REALIZAR LOGICA PARA LA ACTUALIZACION DEL USUARIO
            // MUESTRA LOS USUARIOS, ENVIA EL ID, CUANDO LO ENCUENTRA, LE PIDE EL NUEVO
            // NOMBRE, EL NUEVO EMAIL, PASSWORD
            // Y LE EL NUEVO USUARIO CON LOS NUEVOS DATOS
            case 3:
                listUser.setLength(0);
                repository.verTodosUsuarios().forEach(u -> {
                    listUser.append("ID: ").append(u.getId())
                            .append(" || NOMBRE: ").append(u.getUsername())
                            .append(" || PASSWORD: ").append(u.getPassword())
                            .append(" || EMAIL: ").append(u.getEmail())
                            .append("\n");
                });
                if (listUser.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No existe usuarios para mostrar", "Lista de usuarios",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                JOptionPane.showMessageDialog(null, listUser, "Elige un usuario para actualizar",
                        JOptionPane.INFORMATION_MESSAGE);
                String idUserUpdate = JOptionPane.showInputDialog(null, "Introduce el id del usuario");
                 
                repository.actualizarUsuario((Long.parseLong(idUserUpdate)), null);
                JOptionPane.showMessageDialog(null, "¡Usuario actualizado correctamente!", null,
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 4:
                listUser.setLength(0);
                repository.verTodosUsuarios().forEach(u -> {
                    listUser.append("ID: ").append(u.getId())
                            .append(" || NOMBRE: ").append(u.getUsername())
                            .append(" || PASSWORD: ").append(u.getPassword())
                            .append(" || EMAIL: ").append(u.getEmail())
                            .append("\n");
                });
                if (listUser.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "No existe usuarios para mostrar", "Lista de usuarios",
                            JOptionPane.INFORMATION_MESSAGE);
                }
                JOptionPane.showMessageDialog(null, listUser, "Elige un usuario para eliminar",
                        JOptionPane.INFORMATION_MESSAGE);
                String idUser = JOptionPane.showInputDialog(null, "Introduce el id del usuario");
                repository.eliminarUsuario(Long.parseLong(idUser));
                JOptionPane.showMessageDialog(null, "¡Usuario eliminado correctamente!", null,
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Gracias por utilizar este programa", "Salir",
                        JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                break;
        }

    }

    private static Integer getOperationPanel() {
        Integer optionPanel = 0;

        Map<String, Integer> operacionesUsuario = new HashMap<>();

        operacionesUsuario.put("Crear Usuario", 1);
        operacionesUsuario.put("Obtener Usuarios", 2);
        operacionesUsuario.put("Actualizar Usuario", 3);
        operacionesUsuario.put("Eliminar Usuario", 4);
        operacionesUsuario.put("Salir", 5);

        Object[] optionArray = operacionesUsuario.keySet().toArray();

        Object option = JOptionPane.showInputDialog(null,
                "Seleccione una operación",
                "Crud_Usuario",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                optionArray,
                optionArray[0]);

        if (option == null) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
        } else {
            optionPanel = operacionesUsuario.get(option.toString());
        }
        return optionPanel;
    };
}