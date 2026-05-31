
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Livro {
    private String nome;
    private int anoPublicacao;
    private List<Autor> lstAutor;

    public Livro() {
        this.nome="";
        this.anoPublicacao=0;
        this.lstAutor= new ArrayList<>();
    }

    public Livro(String nome, int anoPublicacao) {
        this.nome = nome;
        this.anoPublicacao = anoPublicacao;
        this.lstAutor = new ArrayList<>();
    }
   
    
    public void copiar(Livro outro){
        this.nome=outro.getNome();
        this.anoPublicacao=outro.getAnoPublicacao();
        
        this.lstAutor= new ArrayList<>();
        for(Autor a: outro.getLstAutor()){
            Autor novo =new Autor();
            novo.copiar(a);
            this.lstAutor.add(novo);  
        }    
    }
    @Override
    public String toString(){
       return "Livro{" +"Nome:"+ this.nome
               +" Ano de publicacao:"+this.anoPublicacao+
               " Autor:"+ this.lstAutor;
               
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + this.anoPublicacao;
        hash = 47 * hash + Objects.hashCode(this.lstAutor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Livro other = (Livro) obj;
        if (this.anoPublicacao != other.anoPublicacao) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.lstAutor, other.lstAutor);
    }
    
    public void addAutor(Autor a){
        this.lstAutor.add(a);
        System.out.println("Autor adicionado");
        
    }
    public void removerAutor(String nomeAutor){
        Autor a= this.pesquisarAutor(nomeAutor);
        this.lstAutor.remove(a);
        
    }
    
    public Autor pesquisarAutor(String nomeAutor){
        for(Autor a: this.lstAutor){
            if (a.getNome().equals(nomeAutor)){
                System.out.println("Autor encontrado pelo nome");
                return a;
            }        
        }  
       return null; 
    }
    public List<Autor> pesquisarAutorPcdd(String cddNatal){
        List<Autor> autorEncontrado = new ArrayList<>();
        for(Autor a: this.lstAutor){
            if(a.getCddNatal().equals(cddNatal)){
                System.out.println("Autor encontrado pela cidade Natal");
                autorEncontrado.add(a);
                return autorEncontrado;
            }
        }
        return null;
        
    }
    public void ListarAutor(){
        for(Autor a: this.lstAutor){
            System.out.println(a.toString());
            
        }
        
    }
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

  
    public  int getAnoPublicacao(){
      return this.anoPublicacao;
    }
    public List<Autor> getLstAutor() {
        return this.lstAutor;
    }
    

}
