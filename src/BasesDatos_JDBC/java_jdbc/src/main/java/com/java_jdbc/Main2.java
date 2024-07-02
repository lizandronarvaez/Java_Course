package com.java_jdbc;

import com.java_jdbc.util.ConexionBaseDatos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.postgresql.util.PSQLException;

public class Main2 {
    public static void main(String[] args) {

        try (
                // Conexion a la base de datos con una clase singleton
                Connection connection = ConexionBaseDatos.getInstance();
                // Crea la conexion
                Statement statement = connection.createStatement();

                // Obtiene los resultados
                ResultSet result = statement.executeQuery("SELECT * FROM PRODUCTOS");

        ) {

            // Vefifica los resultados
            while (result.next()) {
                System.out.println();
                System.out.println("********************");
                System.out.println("Id_Producto: " + result.getString("product_id"));
                System.out.println("Producto: " + result.getString("nombre"));
                System.out.println("Precio: " + result.getString("precio") + "€");
                System.out.println("Fecha_Registro: " + result.getString("fecha_registro"));
                System.out.println("********************");
            }

        } catch (SQLException e) {
            if (e instanceof PSQLException) {
                System.out.println();
                System.out.println("Hubo un error en la conexión");
                return;
            }
            System.out.println(e);
        }
    }
}