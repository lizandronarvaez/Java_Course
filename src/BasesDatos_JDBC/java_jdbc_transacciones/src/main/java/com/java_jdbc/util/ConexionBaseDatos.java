package com.java_jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

    private static String url = "jdbc:postgresql://localhost:65432/curso_java_2024";
    private static String username = "postgres";
    private static String password = "postgres";
    private static Connection connection;

    public static Connection getInstance() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(url, username, password);
        }

        return connection;
    }
}
