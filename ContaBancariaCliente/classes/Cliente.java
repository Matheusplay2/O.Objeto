
package classes;

import java.util.Objects;

public class Cliente {
    private String nome;
    private String cpf;
    private ContaBancaria conta;

    public Cliente() {
        this.nome=" ";
        this.cpf="";
        this.conta= new ContaBancaria();
    }

    public Cliente(String nome, String cpf, ContaBancaria conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }
    public void depositar(double valor){
        this.conta.depositar(valor);
    }
    public void sacar(double valor){
        this.conta.sacar(valor);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.cpf);
        hash = 97 * hash + Objects.hashCode(this.conta);
        return hash;
    }

    @Override
    public String toString() {
        return "Cliente{" + "Nome:" + this.nome + ", Cpf:" + this.cpf +
                this.conta.toString() + '}';
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return Objects.equals(this.conta, other.conta);
    }
    public void copiar (Cliente outro){
        
       this.nome=outro.getNome();
       this.cpf=outro.getCpf();
       ContaBancaria nova=new ContaBancaria();
        nova.copiar(outro.getConta());
        this.conta= nova;
    }
    
   
 
    public String getNome(){
       return this.nome;
    }
    public void setNome(String nome){
       this.nome=nome; 
    }
    public String getCpf(){
        return this.cpf;
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public ContaBancaria getConta(){
       return this.conta; 
    }
    public void setConta(ContaBancaria conta){
        this.conta=conta;
    }
    
}
