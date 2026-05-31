
package classes;

import java.util.Objects;


public class Pessoa {
   private String nome;
   private String cpf;

    public Pessoa() {
        this.cpf="";
        this.nome="";
    }

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    
   @Override
   public String toString(){
       return "Pessoa{Nome:"+this.nome+" Cpf:"+this.cpf+"}";
 
   }
   
   public void copiar(Pessoa outro){
       this.nome=outro.getNome();
       this.cpf=outro.getCpf();

   }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + Objects.hashCode(this.nome);
        hash = 13 * hash + Objects.hashCode(this.cpf);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.cpf, other.cpf);
    }
   
   
   
   
   public String getNome(){
       return this.nome;
   }
   public String getCpf(){
      return this.cpf; 
   }
   public void setNome(String nome){
       this.nome= nome;
   }
   public void setCpf(String cpf){
       this.cpf=cpf;
   }
}
