package classes;

import java.util.Objects;

public class Aula {
    private String titulo;
    private String descricao;
    private String conteudo;
    private Avaliacao avaliacao;
    private boolean concluido;

    public Aula() {
       this.titulo="";
       this.conteudo="";
       this.descricao="";
       this.avaliacao= new Avaliacao();
       this.concluido= false;
    }

    public Aula(String titulo, String descricao, String conteudo,boolean concluido) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.conteudo = conteudo;
        this.avaliacao=  new  Avaliacao();
        this.concluido= false;
    }
  
    public void copiar(Aula outro ){
        this.titulo=outro.getTitulo();
        this.descricao=outro.getDescricao();
        this.conteudo=outro.getConteudo();
        this.concluido=outro.getConcluido();
        
        this.avaliacao= new Avaliacao(outro.getAvaliacao());
      
    }

    @Override
    public String toString() {
        return "Aula{" + "Titulo:" + this.titulo + ", Descricao:" + this.descricao + ", Conteudo:" 
                + this.conteudo + ", Avaliacao:" + this.avaliacao + ", Concluido:" + this.concluido + "}";
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.titulo);
        hash = 59 * hash + Objects.hashCode(this.descricao);
        hash = 59 * hash + Objects.hashCode(this.conteudo);
        hash = 59 * hash + Objects.hashCode(this.avaliacao);
        hash = 59 * hash + (this.concluido ? 1 : 0);
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
        final Aula other = (Aula) obj;
        if (this.concluido != other.concluido) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.conteudo, other.conteudo)) {
            return false;
        }
        return Objects.equals(this.avaliacao, other.avaliacao);
    }
    
    
    
 
    
    public String getTitulo(){
     return this.titulo;
    }
    
    public String getConteudo(){
      return this.conteudo;  
    }
    public String getDescricao(){
       return this.descricao; 
    }
    
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setDescricao(String descricao){
       this.descricao=descricao; 
    }
    
    public void setConteudo(String conteudo){
        this.conteudo=conteudo;
    }
    
    public Avaliacao getAvaliacao(){
        return this.avaliacao;
    }
    public void setAvaliacao(){
        this.avaliacao=avaliacao;
        
    }
    public boolean getConcluido(){
        return this.concluido;     
    }
    public void setConcluido(boolean concluido){
       this.concluido=concluido; 
    }
}
