
package com.mycompany.biblioteca.model.dao;

import com.mycompany.biblioteca.model.Exceptions.DaoException;
import com.mycompany.biblioteca.model.entidades.Autor;
import com.mycompany.biblioteca.model.entidades.Livro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class LivroDaoBanco implements ILivroDao {
    private Connection connection;

    public LivroDaoBanco(Connection connection) {
        this.connection = connection;
    }
    
    @Override
    public void salvar(Livro livro) {
        String sql = "INSERT INTO livro (titulo, anoPublicacao, autorNome, autorCddNatal) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, livro.getTitulo());
            stmt.setInt(2, livro.getAno());
            stmt.setString(3, livro.getAutor().getNome());
            stmt.setString(4, livro.getAutor().getCddNatal());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao salvar livro: " + e.getMessage());
        }
    }

    @Override
    public void remover(String titulo) {
        String sql = "DELETE FROM livro WHERE titulo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao remover livro: " + e.getMessage());
        }
    }

    @Override
    public void atualizar(String tituloAntigo, Livro livroAtualizado) {
        String sql = "UPDATE livro SET titulo = ?, anoPublicacao = ?, autorNome = ?, autorCddNatal = ? WHERE titulo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, livroAtualizado.getTitulo());
            stmt.setInt(2, livroAtualizado.getAno());
            stmt.setString(3, livroAtualizado.getAutor().getNome());
            stmt.setString(4, livroAtualizado.getAutor().getCddNatal());
            stmt.setString(5, tituloAntigo);
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar livro: " + e.getMessage());
        }
    }

    @Override
    public Livro pesquisar(String titulo) {
        String sql = "SELECT * FROM livro WHERE titulo = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, titulo);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Autor autor = new Autor(rs.getString("autorNome"), rs.getString("autorCddNatal"));
                    return new Livro(rs.getString("titulo"), rs.getInt("anoPublicacao"), autor);
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar livro: " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Livro> listarTodos() {
        String sql = "SELECT * FROM livro";
        List<Livro> livros = new ArrayList<>();
        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Autor autor = new Autor(rs.getString("autorNome"), rs.getString("autorCddNatal"));
                livros.add(new Livro(rs.getString("titulo"), rs.getInt("anoPublicacao"), autor));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar livros: " + e.getMessage());
        }
        return livros;
    }
}



