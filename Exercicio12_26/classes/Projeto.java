package classes;


import gerenciadores.GerenciadorFuncionario;

import java.util.Objects;

public class Projeto {
    private String nomeProjeto;
    private int cod;
    private String descricao;
   private GerenciadorFuncionario funcionarios;

    public Projeto() {
        this.nomeProjeto="";
        this.cod=0;
        this.descricao="";
        this.funcionarios= new GerenciadorFuncionario();
    }

    public Projeto(String nomeProjeto, int cod, String descricao) {
        this.nomeProjeto = nomeProjeto;
        this.cod = cod;
        this.descricao = descricao;
        this.funcionarios= new GerenciadorFuncionario();
    }
    
    
    public void copiar(Projeto outro){
        
        this.nomeProjeto=outro.getNomeProjeto();
        this.cod=outro.getCod();
        this.descricao=outro.getDescricao();
        this.funcionarios = new GerenciadorFuncionario();
        this.funcionarios.copiar(outro.getFuncionarios());
        
  
  
    }
    @Override 
    public String toString (){
        return "Projeto{Nome do Projeto:"+ this.nomeProjeto+
                ",Codigo:"+this.cod +" Descricao:"+ this.descricao+"}";
        
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nomeProjeto);
        hash = 97 * hash + this.cod;
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + Objects.hashCode(this.funcionarios);
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
        final Projeto other = (Projeto) obj;
        if (this.cod != other.cod) {
            return false;
        }
        if (!Objects.equals(this.nomeProjeto, other.nomeProjeto)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        return Objects.equals(this.funcionarios, other.funcionarios);
    }
    
    
    public void addFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
        System.out.println("Funcionario adicionado ao projeto  ");
 
    }
      public boolean remover(String nome, String identificacao){
       for (Funcionario f: this.funcionarios.getLstFuncionario()){
         if(f.getNome().equals(nome)){
             if(f.getIdentificacao().equals(identificacao)){    
              this.remover(nome, identificacao);
                 System.out.println("Funcionario removido");
             return true;
             }
             
         }
           
       }
        
        return false;
    }
    
    public String getNomeProjeto() {
        return this.nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public GerenciadorFuncionario getFuncionarios() {
        return  this.funcionarios;
    }

  
}
