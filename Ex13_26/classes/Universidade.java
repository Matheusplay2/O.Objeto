
package classes;

import java.util.ArrayList;
import java.util.List;


public class Universidade {
    private String nomeUniversidade;
    private List<Curso>cursos;
    private List<Estudante> estudantes;

    public Universidade() {
        this.nomeUniversidade="";
        this.cursos=new ArrayList<>();
        this.estudantes= new ArrayList<>();
    }
    
    public Universidade(String nomeUniversidade){
        this.nomeUniversidade= nomeUniversidade;
        this.estudantes= new ArrayList<>();
        this.cursos= new ArrayList<>();
        
    }
    public void addCursoUniversidade(Curso c){
        this.cursos.add(c);
        System.out.println("Curso adicionado a Universidade");
    }
    public boolean removerCurso(String nomeCurso, String cod){
      for(Curso c : this.cursos){
          if(c.getNomeCurso().equals(nomeCurso)){
              if(c.getCod().equals(cod)){
                  this.estudantes.remove(c);
                  System.out.println("Curso removido");
                  return true;                 
              }
              
          }
    }

    return false;
}
  public  void addEstudante(Estudante e){
      this.estudantes.add(e);
      System.out.println("Esudante adicionado");
  }
  
   public boolean removerEstudante(String numMatricula){
       for( Estudante e: this.estudantes){
           if(e.getNumMatricula().equals(numMatricula)){
               this.estudantes.remove(e);
               System.out.println("Estudante removido");
               return true;
           }
       }

       return false;
   }
   public void listarCursos(){
       
        for(Curso c: this.cursos){
            System.out.println(c.toString());  
        } 
   }
   public void listarEstudantes(){
       
       for(Estudante e : this.estudantes){
           System.out.println(e.toString());
       }
   }
    
   public int  totalAluno(){
       int total= this.estudantes.size();
             return total;
       
   }
   public Curso cursoComMaisAlunos(){
    Curso maior = cursos.get(0);

    for(Curso c : cursos){
        if(c.getLstEstudantes().size() >
           maior.getLstEstudantes().size()){

            maior = c;
        }
    }

    return maior;
}  
   public void top5Cursos(){

    for(int i = 0; i < cursos.size(); i++){

        for(int j = i + 1; j < cursos.size(); j++){

            if(cursos.get(j).getLstEstudantes().size() >
               cursos.get(i).getLstEstudantes().size()){

                Curso aux = cursos.get(i);

                cursos.set(i, cursos.get(j));

                cursos.set(j, aux);
            }
        }
    }

    System.out.println("TOP 5 CURSOS:");

    for(int i = 0; i < cursos.size() && i < 5; i++){

        System.out.println(
            cursos.get(i).getNomeCurso() +
            " - Alunos: " +
            cursos.get(i).getLstEstudantes().size()
        );
    }
}
    
    
    public String getNomeUniversidade() {
        return nomeUniversidade;
    }

    public List<Curso> getLstCursos() {
        return cursos;
    }

    public List<Estudante> getLstEstudantes() {
        return estudantes;
    }
    

}
