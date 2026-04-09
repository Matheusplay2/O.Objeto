
package classes;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private String matricula;
    private double salario;
    private Endereco endereco;

    public Funcionario() {
        this.nome="";
        this.matricula="";
        this.salario=0.0;
        this.endereco=new Endereco();
    }

    public Funcionario(String nome, String matricula, double salario, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.salario = salario;
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.matricula);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 89 * hash + Objects.hashCode(this.endereco);
        return hash;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "Nome:" + this.nome + ", Matricula:" + this.matricula + ", Salario:R$" + this.salario+ "}"+this.endereco;
    }
    public void copiar( Funcionario outro){
        
       this.nome=outro.getNome();
       this.matricula=outro.getMatricula();
       this.salario=outro.getSalario();
       this.endereco=new Endereco();
       this.endereco.copiar(outro.getEndereco());
  
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
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        return Objects.equals(this.endereco, other.endereco);
    }
    
    
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return this.matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Endereco getEndereco() {
        return this.endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
    
    
}
