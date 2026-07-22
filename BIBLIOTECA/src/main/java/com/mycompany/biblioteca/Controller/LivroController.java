package com.mycompany.biblioteca.Controller;

import com.mycompany.biblioteca.model.Valid.ValidadorLivro;
import com.mycompany.biblioteca.model.dao.ILivroDao;
import com.mycompany.biblioteca.model.entidades.Autor;
import com.mycompany.biblioteca.model.entidades.Livro;

import java.util.List;


//   private String titulo;
//    private int ano;
//    private Autor autor;

public class LivroController {
     private ILivroDao repositorio;

    public LivroController(ILivroDao repositorio) {
        this.repositorio = repositorio;
    }
   

    public void salvar(String titulo,Autor autor, String anoPublicacao){
       ValidadorLivro valid = new ValidadorLivro();
       Livro novoLivro= valid.validacao(titulo,autor,anoPublicacao);
       repositorio.salvar(novoLivro);
        
    }
    
    public void   remover(String titulo){
        repositorio.remover(titulo);
    }
    
    public Livro pesquisar(String titulo){
         return repositorio.pesquisar(titulo);
    
    }
    
   public void atualizar(String tituloAntigo, String tituloNovo, Autor autorNovo, String anoNovo) {
        ValidadorLivro valid = new ValidadorLivro();
        Livro livroAtualizado = valid.validacao(tituloNovo, autorNovo, anoNovo);
        repositorio.atualizar(tituloAntigo, livroAtualizado);
    }
    
    
    public List <Livro> listarTodos(){
    return repositorio.listarTodos();
 
  }
}
