package classes;

import gerenciadores.GerenciadorProjetos;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private String identificacao;
    private GerenciadorProjetos projetos;

    public Funcionario() {
        this.nome="";
        this.identificacao="";
        this.projetos= new GerenciadorProjetos();
       
    }

    public Funcionario(String nome, String identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.projetos= new GerenciadorProjetos();
        
    }
    
public void copiar(Funcionario outro){
    this.nome = outro.getNome();
    this.identificacao = outro.getIdentificacao();
    this.projetos = new GerenciadorProjetos();

    for(Projeto p : outro.getProjetos().getLstProjeto()){

        Projeto novo = new Projeto();

        novo.copiar(p);

        this.projetos.add(novo);
    }
}
    @Override 
    public String toString(){
        
        return " Funcionario{Nome:"+ this.nome+
                " Identificacao:"+this.identificacao+"}";               
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.identificacao);
        hash = 89 * hash + Objects.hashCode(this.projetos);
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
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.identificacao, other.identificacao)) {
            return false;
        }
        return Objects.equals(this.projetos, other.projetos);
    }
    
    
    
    public void addProjeto(Projeto p){
        this.projetos.add(p);
        System.out.println("Projeto adicionado ao funcionario");
        
    }
    
    public boolean removerProjeto(int cod){
   return projetos.remover(cod);
}
    public String getNome() {
        return this.nome;
    }

    public String getIdentificacao() {
        return this.identificacao;
    }
    public void setNome(String nome) {
       this.nome = nome;
   }

    public void setIdentificacao(String identificacao) {
      this.identificacao = identificacao;
   }

    public GerenciadorProjetos  getProjetos() {
        return this.projetos;
    }
    

}
