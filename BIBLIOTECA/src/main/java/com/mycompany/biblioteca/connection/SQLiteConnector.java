
package com.mycompany.biblioteca.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class SQLiteConnector {
    
      private Connection connection;

    public SQLiteConnector(String dbName) throws SQLException {
        String url = "jdbc:sqlite:" + dbName;
        this.connection = DriverManager.getConnection(url);
        criarTabelaAutor();
        criarTabelaLivro();
    }

    public Connection getConnection() {
        return connection;
    }

    private void criarTabelaAutor() {
        String sql = "CREATE TABLE IF NOT EXISTS autor ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " nome TEXT NOT NULL,"
                + " cddNatal TEXT NOT NULL"
                + " );";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela autor: " + e.getMessage());
        }
    }

    private void criarTabelaLivro() {
        String sql = "CREATE TABLE IF NOT EXISTS livro ("
                + " id INTEGER PRIMARY KEY AUTOINCREMENT,"
                + " titulo TEXT NOT NULL,"
                + " anoPublicacao INTEGER NOT NULL,"
                + " autorNome TEXT NOT NULL,"
                + " autorCddNatal TEXT NOT NULL"
                + " );";
        try (Statement stmt = connection.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println("Erro ao criar a tabela livro: " + e.getMessage());
        }
    }
    
}
