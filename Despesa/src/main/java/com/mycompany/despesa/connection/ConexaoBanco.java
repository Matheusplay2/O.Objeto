
package com.mycompany.despesa.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


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
    
    
    /**
     * MANUTENÇÃO: cria a tabela "gastos" automaticamente se ainda não existir.
     * Roda toda vez que conecta, mas "IF NOT EXISTS" garante que não duplica
     * nem apaga dado já salvo. Se mudar a estrutura da tabela (novo campo,
     * por exemplo), mexer aqui.
     */
    private static void criarTabelaSeNaoExistir(Connection conn) throws SQLException {
        String sql = "CREATE TABLE IF NOT EXISTS gastos ("
                   + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                   + "data TEXT NOT NULL, "
                   + "valor REAL NOT NULL, "
                   + "descricao TEXT NOT NULL"
                   + ")";
        try (Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
    }
}
