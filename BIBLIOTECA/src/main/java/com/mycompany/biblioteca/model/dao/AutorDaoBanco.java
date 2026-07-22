
package com.mycompany.biblioteca.model.dao;

import com.mycompany.biblioteca.model.entidades.Autor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AutorDaoBanco implements IAutorDao {
    
    private Connection connection;

    public AutorDaoBanco(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void salvar(Autor autor) {
          String sql = "INSERT INTO autor (nome, cddNatal) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, autor.getNome());
            stmt.setString(2, autor.getCddNatal());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao salvar autor: " + e.getMessage());
        }
    }

    @Override
    public void remove(String nome, String cddNatal) {
        String sql = "DELETE FROM autor WHERE nome = ? AND cddNatal = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, cddNatal);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao remover autor: " + e.getMessage());
        }
    }
@Override
public void atualizar(String nome, String cddNatal, Autor autorAtualizado) {
    String sql = "UPDATE autor SET nome = ?, cddNatal = ? WHERE nome = ? AND cddNatal = ?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setString(1, autorAtualizado.getNome());
        stmt.setString(2, autorAtualizado.getCddNatal());
        stmt.setString(3, nome);
        stmt.setString(4, cddNatal);
        stmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Erro ao atualizar autor: " + e.getMessage());
    }
}

    @Override
    public Autor pesquisar(String nome, String cddNatal) {
        String sql = "SELECT * FROM autor WHERE nome = ? AND cddNatal = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, cddNatal);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    return new Autor(
                        rs.getString("nome"),
                        rs.getString("cddNatal")
                    );
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar autor: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Autor> listarTodos() {
        String sql = "SELECT * FROM autor";
        List<Autor> autores = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                autores.add(new Autor(
                    rs.getString("nome"),
                    rs.getString("cddNatal")
                ));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar autores: " + e.getMessage());
        }
        return autores;
    }
    

}
