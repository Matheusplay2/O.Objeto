
package classes;

import java.util.Objects;


public class Aluno {
    
   private String nome;
   private String  sexo;
   private int idd;
   private String matricula;
   private String anoIngresso;

    public Aluno() {
    }

    public Aluno(String nome, String sexo, int idd, String matricula, String anoIngresso) {
        this.nome = nome;
        this.sexo = sexo;
        this.idd = idd;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", sexo=" + sexo + ", idd=" + idd + ", matricula=" + matricula + ", anoIngresso=" + anoIngresso + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.matricula);
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
        final Aluno other = (Aluno) obj;
        return Objects.equals(this.matricula, other.matricula);
    }
      
    public void copiar(Aluno outro){
        
        this.nome=outro.getNome();
        this.anoIngresso=outro.getAnoIngresso();
        this.idd=outro.getIdd();
        this.sexo=outro.getSexo();
        this.matricula=outro.getMatricula();
        
    }
    
     
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(String anoIngresso) {
        this.anoIngresso = anoIngresso;
    }
   
   
   
    
}
