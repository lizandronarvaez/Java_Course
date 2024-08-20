package com.java_jdbc;

import com.java_jdbc.model.Categoria;
import com.java_jdbc.model.Producto;
import com.java_jdbc.repository.Repository;
import com.java_jdbc.repository.impl.ProductoRepositoryImpl;
import com.java_jdbc.util.ConexionBaseDatos;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import org.postgresql.util.PSQLException;

public class EjemploJdbc {
    public static void main(String[] args) {

        try (
                // Conexion a la base de datos con una clase singleton
                Connection connection = ConexionBaseDatos.getInstance();
            ) 
            {

            Repository<Producto> repository = new ProductoRepositoryImpl();

            // OBTENER TODOS LOS PRODUCTOS
            System.out.println("*LISTADO CON TODOS LOS PRODUCTOS*");
            repository.listar().forEach(
                    p -> System.out.println(
                            "Nombre Producto: " + p.getNombre().toUpperCase() + " || Precio: " +
                                    p.getPrecio() + " || Categoria: " + p.getCategoria().getNombre()));

            // OBTENER UN PRODUCTO
            System.out.println("");
            System.out.println("*****OBTENER UN PRODUCTO POR ID*****");
            System.out.println(repository.porId(2l));
            System.out.println();

            // CREAR UN PRODUCTO
            Producto producto = new Producto();
            producto.setNombre("PS5 1TB");
            producto.setPrecio(500);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setCategoria_id(1l);
            producto.setCategoria(categoria);
            // repository.guardar(producto);
            System.out.println("¡Producto creado correctamente!");
            System.out.println();

            // actualizar un producto
            // Producto productoUpdate = repository.porId(5L);

            // productoUpdate.setNombre("Ford Mondeo");
            // productoUpdate.setPrecio(3250);
            // productoUpdate.setFechaRegistro(new Date());
            // repository.guardar(productoUpdate);
            // System.out.println("¡Producto actualizado correctamente!");

            System.out.println("*****TODOS LOS PRODUCTOS*****");
            repository.listar().forEach(System.out::println);
            System.out.println();

            // eliminar un producto por id
            // repository.eliminar(5);
            // System.out.println("Producto eliminado correctamente!");
            // repository.listar().forEach(System.out::println);
            // System.out.println();

        } catch (SQLException e) {
            if (e instanceof PSQLException) {
                System.out.println();
                System.out.println("Hubo un errors en la conexión");
                return;
            }
            e.printStackTrace();
        }
    }
}