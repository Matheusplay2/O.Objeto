
package classes;

import java.util.Objects;

/*Classe Professor (nome, idade, sexo, cpf) e GerenciadorProfessor*/

public class Professor {
    private String nome;
    private int idade;
    private String sexo;
    private String cpf;

    public Professor() {
        this.nome="";
        this.idade=-1;
        this.sexo="";
        this.cpf="";
    }

    public Professor(String nome, int idade, String sexo, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
    }
    
    public void copiar(Professor outro){
        this.nome=outro.getNome();
        this.idade=outro.getIdade();
        this.sexo=outro.getSexo();
        this.cpf=outro.getCpf();
    }
    @Override
    public String toString(){
        return "Professor{Nome:"+this.nome+",Idade:"+this.idade+
                ",Sexo:"+this.sexo+",Cpf:"+this.cpf+"}";
        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.cpf);
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
        final Professor other = (Professor) obj;
        return Objects.equals(this.cpf, other.cpf);
    }
    
    
    
    public String getNome(){
      return this.nome;  
    }
    public void setNome(String nome){
      this.nome=nome;  
    }
    public int getIdade(){
        return this.idade;
    }
    public void setIdade(int idade){
       this.idade=idade; 
    }
    public String getSexo(){
         return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo= sexo;
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
}
