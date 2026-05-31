
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Estudante {
    private String nome;
    private String numMatricula;
    private List<Curso> lstCursos;

    public Estudante() {
        this.nome="";
        this.numMatricula="";
        this.lstCursos=new ArrayList<>();
    }
    
   
    public Estudante (String nome, String numMatricula){
        this.nome=nome;
        this.numMatricula=numMatricula;
        this.lstCursos=new ArrayList<>();
        
    }
    
    @Override
    public String toString(){
        return "Estudante{Nome:"+this.nome+ ",Numero da Matricula:"+
                this.numMatricula+"}";
        
    }
    public void copiar(Estudante outro){

        this.nome = outro.getNome();
        this.numMatricula = outro.getNumMatricula();

        this.lstCursos = new ArrayList<>();

        this.lstCursos.addAll(outro.getLstCursos());
    }


    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.nome);
        hash = 97 * hash + Objects.hashCode(this.numMatricula);
        hash = 97 * hash + Objects.hashCode(this.lstCursos);
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
        final Estudante other = (Estudante) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.numMatricula, other.numMatricula)) {
            return false;
        }
        return Objects.equals(this.lstCursos, other.lstCursos);
    }
    public void matricularCurso(Curso c ){
        this.lstCursos.add(c);
        System.out.println(" Curso  matriculado");
    }
    
    public boolean DesmatricularCurso(String cod){ 
        for(Curso c: this.lstCursos){
            if (c.getCod().equals(cod)){
             this.lstCursos.remove(c);
                System.out.println("Curso desmatriculado ");
             return true;
            }
            
        }
        
        return false;
    }
    
    public String getNome(){
      return this.nome;  
    }
    public String getNumMatricula(){
     return this.numMatricula;   
    }
    public List<Curso> getLstCursos(){
         return this.lstCursos;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setNumMatricula(String numMatricula){
      this.numMatricula=numMatricula;  
    }

}
