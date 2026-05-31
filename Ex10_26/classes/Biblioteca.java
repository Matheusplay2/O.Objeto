
package classes;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<Livro> lstLivro;

    public Biblioteca() {
        this.lstLivro= new ArrayList<>();
    }
    
   public void addLivro(Livro l){ 
    this.lstLivro.add(l);
       System.out.println("Livro adicionado");
       
   }
   public void  removerLivro(String titulo){
       Livro l=this.pesquisarLivroPTitulo(titulo);
       this.lstLivro.remove(l);
      
   }
   public Livro pesquisarLivroPTitulo(String titulo){
       for(Livro l: this.lstLivro){
           if(l.getNome().equals( titulo)){
               System.out.println("Livro encontrado");
               return l;
           } 
       }
       return null;
   }
   public Livro pesquisarPorAutor(String nomeAutor){
       for(Livro l: lstLivro){
       Autor autor=l.pesquisarAutor(nomeAutor);
       if( nomeAutor!= null){
           return l;
          }
       }
       return null;
   }
   
   public List<Autor> pesquisarAutorPcdd(String cddNatal){
        List<Autor> lstCompletaAutores  = new ArrayList<>();
        for(Livro l: this.lstLivro){
            List<Autor> lstAutoresEncontrados=l.pesquisarAutorPcdd(cddNatal);
            
            lstCompletaAutores.addAll(lstCompletaAutores);
            
        
             return lstAutoresEncontrados;
        }
        return null;
    }
   public List<Livro> encontrarLivros(){
       return this.lstLivro;
       
   }

    @Override
    public String toString() {
        return "Biblioteca{" + "Lista de Livros:" + this.lstLivro + '}';
    }
   
   
   public void ListarLivros(){
       for (Livro l: this.lstLivro){
           System.out.println(l.toString());
       }
   }

    public List<Livro> getLstLivro() {
        return this.lstLivro;
    }
   
}
