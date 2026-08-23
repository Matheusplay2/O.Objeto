
package com.mycompany.despesa.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoBanco {
      private static final String URL = "jdbc:sqlite:despesas.db";

    public static Connection conectar() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver do SQLite não encontrado.", e);
        }
        return DriverManager.getConnection(URL);
    }
}
