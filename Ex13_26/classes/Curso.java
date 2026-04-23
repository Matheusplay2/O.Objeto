package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Curso {
    private String nomeCurso;
    private String cod;
    private List<Estudante> lstEstudantes;

    public Curso() {
        this.nomeCurso="";
        this.cod="";
        this.lstEstudantes=new ArrayList<>();
    }

    public Curso(String nomeCurso, String cod) {
        this.nomeCurso = nomeCurso;
        this.cod = cod;
        this.lstEstudantes = new ArrayList<>();
 
    }
    public void copiar(Curso outro){
        this.nomeCurso=outro.getNomeCurso();
        this.cod=outro.getCod();
        this.lstEstudantes= new ArrayList<>();
        this.lstEstudantes.addAll(outro.getLstEstudantes());
       
        
        
    }
     @Override 
     public String toString(){
        return  " Curso{Nome do Curso:"+ this.nomeCurso+
                "Codigo do curso:"+this.cod+"}";
         
     }
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.nomeCurso);
        hash = 17 * hash + Objects.hashCode(this.cod);
        hash = 17 * hash + Objects.hashCode(this.lstEstudantes);
        return hash;
    }
    
   
        public void matricularAluno( Estudante e){
        this.lstEstudantes.add(e);
        System.out.println("Aluno matriculado");
        
    }
    public boolean desmatricularAluno(String nome, String matricula){
         for( Estudante e: this.lstEstudantes){
             if(e.getNome().equals(nome)){
                 if(e.getNumMatricula().equals(matricula)){
                     this.lstEstudantes.remove(e);
                     System.out.println("Aluno desmatriculado");
                     return true;
                 }
             }
             
         }
       return false;   
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
        if (!Objects.equals(this.cod, other.cod)) {
            return false;
        }
        return Objects.equals(this.lstEstudantes, other.lstEstudantes);
    }

    public String getNomeCurso() {
        return this.nomeCurso;
    }

    public String getCod() {
        return this.cod;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }
    

    public List<Estudante> getLstEstudantes() {
        return lstEstudantes;
    }
    
    
}
