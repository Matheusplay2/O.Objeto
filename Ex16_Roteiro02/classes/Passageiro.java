
package classes;

import java.util.Objects;


public class Passageiro {
    private String nome;
    private String cpf;
    private SistemaFidelidade sistema;

    public Passageiro() {
        this.nome="";
        this.cpf="";
        this.sistema= new SistemaFidelidade();
    }
    
    public Passageiro(String nome, String cpf){
        this.nome=nome;
        this.cpf=cpf;
        this.sistema=new SistemaFidelidade();
    }
    public Passageiro (Passageiro outro){
        this.nome=outro.getNome();
        this.cpf=outro.getCpf();
        this.sistema=new SistemaFidelidade(outro.getSistema());
    }
      
    public void copiar(Passageiro outro){
        this.nome=outro.getNome();
        this.cpf=outro.getCpf();
        this.sistema= new SistemaFidelidade(outro.getSistema());
        
    }
    public void imprimir(){
        System.out.println(this);
        
    }
    @Override
    public String toString(){
      return "Passageiro{Nome:"+ this.nome+",Cpf:"+this.cpf+"}";  
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + Objects.hashCode(this.nome);
        hash = 61 * hash + Objects.hashCode(this.cpf);
        hash = 61 * hash + Objects.hashCode(this.sistema);
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
        final Passageiro other = (Passageiro) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.sistema, other.sistema);
    }
    
    
  public String getNome(){  
    return this.nome;
  }
  public String getCpf(){
      return this.cpf;
  }
  public SistemaFidelidade getSistema(){
      return this.sistema;
  }
  
  public void setNome(String nome){
      this.nome=nome;
  }
  public void setCpf(String cpf){
      this.cpf=cpf;
  }
}
