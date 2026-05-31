
package classes;

import java.util.Objects;

public class Funcionario {
    private String nome;
    private String identificacao;
    private double salario;

    public Funcionario() {
        this.nome="";
        this.identificacao="";
        this.salario=0.0;
               
    }

    public Funcionario(String nome, String identificacao, double salario) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.nome);
        hash = 23 * hash + Objects.hashCode(this.identificacao);
        hash = 23 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "Nome:" + this.nome + ", Identificacao:" + this.identificacao + ", Salario:" + this.salario + "}";
    }
    
    public void imprimirFuncionario(){
        System.out.println(this);
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
        return Objects.equals(this.identificacao, other.identificacao);
    }
 
    public void copiar(Funcionario outro){
        this.nome=outro.getNome();
        this.identificacao=outro.getIdentificacao();
        this.salario=outro.getSalario();

    }
  
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdentificacao() {
        return this.identificacao;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    

}
