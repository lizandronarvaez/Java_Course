package com.tarea_crud_jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnetionDB {
        private static String url = "jdbc:postgresql://localhost:65432/curso_java_2024";
    private static String username = "postgres";
    private static String password = "postgres";

    public static   Connection getInstance() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
}
