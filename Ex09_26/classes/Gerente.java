
package classes;

import java.util.Objects;

public class Gerente {
    private String nome;
    private String identificacao;
    private double salario;
    private String areaDtrabalho;

    public Gerente() {
        this.nome="";
        this.identificacao="";
        this.salario=0.0;
        this.areaDtrabalho="";
    }

    public Gerente(String nome, String identificacao, double salario, String areaDtrabalho) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.salario = salario;
        this.areaDtrabalho = areaDtrabalho;
    }
    public void copiar(Gerente outro){
        this.nome=outro.getNome();
        this.identificacao=outro.getIdentificacao();
        this.salario=outro.getSalario();
        this.areaDtrabalho=outro.getAreaDtrabalho();
   
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.identificacao);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
        hash = 83 * hash + Objects.hashCode(this.areaDtrabalho);
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
        final Gerente other = (Gerente) obj;
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.identificacao, other.identificacao)) {
            return false;
        }
        return Objects.equals(this.areaDtrabalho, other.areaDtrabalho);
    }
    public void imprimirGerente(){
        System.out.println(this);
        
    }

    @Override
    public String toString() {
        return "Gerente{" + "Nome:" + this.nome +
                ", Identificacao:" + this.identificacao + 
                ", Salario:" + this.salario + 
                ", AreaDtrabalho:" + this.areaDtrabalho + '}';
        
    }
    

    public String getNome() {
        return nome;
    }

    public String getIdentificacao() {
        return identificacao;
    }

    public double getSalario() {
        return salario;
    }

    public String getAreaDtrabalho() {
        return areaDtrabalho;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdentificacao(String identificacao) {
        this.identificacao = identificacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setAreaDtrabalho(String areaDtrabalho) {
        this.areaDtrabalho = areaDtrabalho;
    }
    
    
 
}
