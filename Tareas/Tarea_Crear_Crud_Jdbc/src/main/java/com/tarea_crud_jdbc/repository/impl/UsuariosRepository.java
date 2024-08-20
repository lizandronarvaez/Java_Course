package com.tarea_crud_jdbc.repository.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tarea_crud_jdbc.model.Usuario;
import com.tarea_crud_jdbc.repository.Repositoy;
import com.tarea_crud_jdbc.util.ConnetionDB;

public class UsuariosRepository implements Repositoy<Usuario> {

    @Override
    public List<Usuario> verTodosUsuarios() {

        List<Usuario> usuarios = new ArrayList<>();

        try (
                // Crea la conexion a la base de datos
                Connection connection = getConnection();
                // Crea la consulta
                Statement statement = connection.createStatement();
                // Otiene los datos
                ResultSet resultSet = statement.executeQuery(
                        "SELECT * FROM USUARIOS")

        ) {
            while (resultSet.next()) {
                Usuario user = getUsers(resultSet);
                usuarios.add(user);
            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
        }

        return usuarios;
    }

    @Override
    public void crearUsuario(Usuario t) {
        String user = "INSERT INTO USUARIOS (username, password, email) values(?,?,?)";

        try (
                Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement(user);) {
            preparedStatement.setString(1, t.getUsername());
            preparedStatement.setString(2, t.getPassword());
            preparedStatement.setString(3, t.getEmail());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // todo!!:terminar el crud solo falta actualizar!
    @Override
    public void actualizarUsuario(Long id, Usuario t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actualizarUsuario'");
    }

    @Override
    public void eliminarUsuario(Long id) {
        String eliminarUser = "DELETE FROM USUARIOS u WHERE u.id=?";

        try (
                PreparedStatement preparedStatement = getConnection().prepareStatement(eliminarUser);) {
            preparedStatement.setLong(1, id);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    // Conexion instancia a la bas de datos
    private Connection getConnection() throws SQLException {
        return ConnetionDB.getInstance();
    }

    private Usuario getUsers(ResultSet resultSet) throws SQLException {
        Usuario usuario = new Usuario();
        usuario.setId(resultSet.getLong("id"));
        usuario.setUsername(resultSet.getString("username"));
        usuario.setPassword(resultSet.getString("password"));
        usuario.setEmail(resultSet.getString("email"));
        return usuario;
    }
}
