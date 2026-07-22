
package com.mycompany.biblioteca.Controller;

import com.mycompany.biblioteca.model.Valid.ValidadorAutor;
import com.mycompany.biblioteca.model.dao.IAutorDao;

import com.mycompany.biblioteca.model.entidades.Autor;
import java.util.List;


public class AutorController {
    private IAutorDao repositorio;

   
     public AutorController(IAutorDao repositorio) {
        this.repositorio = repositorio;
    }

    public void salvar(String nome,String cddNatal){
        ValidadorAutor valid= new ValidadorAutor();
        Autor novoAutor= valid.validacao(nome, cddNatal);
        repositorio.salvar(novoAutor);
     }
    
    public void remover(String nome, String cddNatal){
         repositorio.remove(nome, cddNatal);
        
      }
    
    public Autor pesquisar(String nome, String cddNatal){
        return   repositorio.pesquisar(nome, cddNatal);
       
   
   }
    
    public void atualizar(String nomeAntigo, String cddAntigo, String nomeNovo, String cddNovo) {
        ValidadorAutor valid = new ValidadorAutor();
        Autor autorAtualizado = valid.validacao(nomeNovo, cddNovo);
        repositorio.atualizar(nomeAntigo, cddAntigo, autorAtualizado);
    }
    
    public List<Autor> listarTodos(){
    return repositorio.listarTodos();
    }
}
