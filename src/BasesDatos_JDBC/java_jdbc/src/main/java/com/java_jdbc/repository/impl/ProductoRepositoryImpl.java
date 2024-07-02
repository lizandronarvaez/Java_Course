package com.java_jdbc.repository.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.java_jdbc.model.Producto;
import com.java_jdbc.repository.Repository;
import com.java_jdbc.util.ConexionBaseDatos;

public class ProductoRepositoryImpl implements Repository<Producto> {

    @Override
    public List<Producto> listar() {
        List<Producto> productos = new ArrayList<>();

        try (
                Statement statement = getConnection().createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM PRODUCTOS");) {

            while ((resultSet.next())) {
                Producto producto = getProducto(resultSet);

                productos.add(producto);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        return productos;
    }

    @Override
    public Producto porId(Long id) {

        // Crea el producto
        Producto producto = null;

        // Bloque trycatch para crear la consulta personalizada
        try (PreparedStatement preparedStatement = getConnection()
                .prepareStatement("SELECT * FROM PRODUCTOS WHERE product_id=?")) {
            // Primer parametro el campo y el segundo el valor
            preparedStatement.setLong(1, id);
            try (

                    // Creamos la consulta
                    ResultSet resultSet = preparedStatement.executeQuery()) {

                // Verificamos que el resultado exista
                if (resultSet.next()) {
                    producto = getProducto(resultSet);
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return producto;
    }

    @Override
    public void guardar(Producto producto) {
        String crearProducto;

        // Si no tiene indice es una actualizacion
        if (producto.getId() != null && producto.getId() > 0) {
            crearProducto = "UPDATE productos set nombre=?, precio=? WHERE product_id=?";
        } else {
            // Es un registro nuevo
            crearProducto = "INSERT INTO productos(nombre,precio,fecha_registro) values(?,?,?)";
        }

        try (
                // Prepara el tipo de consulta
                PreparedStatement preparedStatement = getConnection().prepareStatement(crearProducto);) {

            // Añade los parametros a la consulta
            preparedStatement.setString(1, producto.getNombre());
            preparedStatement.setInt(2, producto.getPrecio());

            if (producto.getId() != null && producto.getId() > 0) {
                preparedStatement.setLong(3, producto.getId());
            } else {
                preparedStatement.setDate(3, new Date(producto.getFechaRegistro().getTime()));
            }
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminar(Integer id) {

        String eliminarProducto = "DELETE FROM productos WHERE product_id=?";
        try (
                // Preparamos la consulta
                PreparedStatement preparedStatement = getConnection().prepareStatement(eliminarProducto)) {

            // Estavlecemos los valores al parametro de la consulta
            preparedStatement.setLong(1, id);

            // Ejecutamos la consulta
            preparedStatement.executeUpdate();
        } catch (SQLException e) {

            System.out.println(e.getMessage());
        }
    }

    private Connection getConnection() throws SQLException {
        return ConexionBaseDatos.getInstance();
    }

    private Producto getProducto(ResultSet resultSet) throws SQLException {
        Producto producto = new Producto();
        producto.setId(resultSet.getLong("product_id"));
        producto.setNombre(resultSet.getString("nombre"));
        producto.setPrecio(resultSet.getInt("precio"));
        producto.setFechaRegistro(resultSet.getDate("fecha_registro"));
        return producto;
    }
}
