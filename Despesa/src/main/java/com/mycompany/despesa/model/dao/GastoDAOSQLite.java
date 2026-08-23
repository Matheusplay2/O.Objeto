
package com.mycompany.despesa.model.dao;

import com.mycompany.despesa.connection.ConexaoBanco;
import com.mycompany.despesa.model.entidade.Gasto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class GastoDAOSQLite implements GastoDao{
    
     @Override
    public void inserir(Gasto gasto) {
        String sql = "INSERT INTO gastos (data, valor, descricao) VALUES (?, ?, ?)";
        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, gasto.getData());
            stmt.setDouble(2, gasto.getValor());
            stmt.setString(3, gasto.getDescricao());
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir gasto.", e);
        }
    }

    @Override
    public void remover(int id) {
        String sql = "DELETE FROM gastos WHERE id = ?";
        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao remover gasto.", e);
        }
    }

    @Override
    public List<Gasto> listarTodos() {
        String sql = "SELECT * FROM gastos ORDER BY data";
        List<Gasto> lista = new ArrayList<>();

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                lista.add(mapearGasto(rs));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar gastos.", e);
        }
        return lista;
    }

    @Override
    public List<Gasto> listarPorMes(int mes, int ano) {
        // MANUTENÇÃO: data no banco está em ISO (yyyy-MM-dd),
        // por isso dá pra usar strftime direto. Se mudar o formato
        // de armazenamento, essa query quebra.
        String sql = "SELECT * FROM gastos "
                   + "WHERE strftime('%m', data) = ? AND strftime('%Y', data) = ? "
                   + "ORDER BY data";
        List<Gasto> lista = new ArrayList<>();

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, String.format("%02d", mes)); // "01".."12"
            stmt.setString(2, String.valueOf(ano));

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    lista.add(mapearGasto(rs));
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar gastos do mês.", e);
        }
        return lista;
    }

    @Override
    public double somarPorMes(int mes, int ano) {
        String sql = "SELECT SUM(valor) AS total FROM gastos "
                   + "WHERE strftime('%m', data) = ? AND strftime('%Y', data) = ?";

        try (Connection conn = ConexaoBanco.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, String.format("%02d", mes));
            stmt.setString(2, String.valueOf(ano));

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getDouble("total"); // vem 0.0 se não tiver gasto
                }
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao somar gastos do mês.", e);
        }
        return 0.0;
    }

    // Método auxiliar pra não repetir código de mapeamento ResultSet -> Gasto
    private Gasto mapearGasto(ResultSet rs) throws SQLException {
        return new Gasto(
                rs.getInt("id"),
                rs.getString("data"),
                rs.getDouble("valor"),
                rs.getString("descricao")
        );
    }
    
}
