
package classes;

import gerenciadores.GerenciadorAlunos;
import gerenciadores.GerenciadorAula;
import java.util.Objects;
import java.util.logging.Logger;

public class Curso {
    private String nomeCurso;
    private String descricao;
    private GerenciadorAula aula;
    private GerenciadorAlunos alunos;

    public Curso() {
        this.nomeCurso="";
        this.descricao="";
        this.aula= new GerenciadorAula();
        this.alunos= new GerenciadorAlunos();
    }
    
    public Curso(String nomeCurso, String descricao){
        this.nomeCurso=nomeCurso;
        this.descricao=descricao;
        this.aula= new GerenciadorAula();
        this.alunos= new GerenciadorAlunos();
    
    }
    public Curso(Curso outro){
        this.nomeCurso=outro.getNomeCurso();
        this.descricao=outro.getDescricao();
        this.aula=new GerenciadorAula();
        this.alunos= new GerenciadorAlunos(outro.getAlunos());
        
    }
  
    public void copiar(Curso outro){
        this.nomeCurso=outro.getNomeCurso();
        this.descricao=outro.getDescricao();
        this.aula=new GerenciadorAula();
        this.alunos= new GerenciadorAlunos(outro.getAlunos());
        
    }

    @Override
    public String toString() {
        return "Curso{" + "Nome do Curso:" + this.nomeCurso + ", Descricao:" + this.descricao +
                ", Aula:" + this.aula + ", Alunos:" + this.alunos + '}';
    }
  

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.nomeCurso);
        hash = 17 * hash + Objects.hashCode(this.descricao);
        hash = 17 * hash + Objects.hashCode(this.aula);
        hash = 17 * hash + Objects.hashCode(this.alunos);
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
        final Curso other = (Curso) obj;
        if (!Objects.equals(this.nomeCurso, other.nomeCurso)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.aula, other.aula)) {
            return false;
        }
        return Objects.equals(this.alunos, other.alunos);
    }
    

    public void add (Aula aula){
        this.aula.add(aula);
        
    }
    
    public String getNomeCurso(){
        return this.nomeCurso;
    }
    public String getDescricao(){
       return this.descricao;
    }
    public GerenciadorAula getAula(){
        return this.aula; 
    }
    
    public  void setNomeCurso(String nomeCurso){
        this.nomeCurso= nomeCurso;
    }
    public void setDescricao(String descricao){
        this.descricao= descricao;
    }
    public void setAula(GerenciadorAula aula){
        this.aula= aula;  
    }
    public GerenciadorAlunos getAlunos(){
       return this.alunos; 
    }
    public void setAlunos(GerenciadorAlunos alunos){
        this.alunos= alunos;
    }
}
