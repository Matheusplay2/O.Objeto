
package com.mycompany.biblioteca.model.dao;

import com.mycompany.biblioteca.model.entidades.Livro;
import java.util.List;

public interface ILivroDao {
    
    void salvar(Livro livro);
    void remover(String titulo );
    void atualizar(String tituloAntigo, Livro livroAtualizado);
    Livro pesquisar(String titulo);
    List<Livro> listarTodos() ;
  
}
