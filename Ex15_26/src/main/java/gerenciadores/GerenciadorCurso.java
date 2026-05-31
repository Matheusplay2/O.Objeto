
package gerenciadores;

import classes.Curso;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorCurso {
    private List<Curso>lstCursos;

    public GerenciadorCurso() {
        this.lstCursos= new ArrayList<>();
    }
    
    public void copiar(Curso outro){
        this.lstCursos= new ArrayList<>();
        
        for(Curso c : lstCursos){
            
          Curso novo= new Curso();
          novo.copiar(c);
          lstCursos.add(novo);
        }
        
    }
    
   public void add(Curso curso){ 
       lstCursos.add(curso);
   }
    
    public boolean remover(String nomeCurso){
       for(Curso c: lstCursos){ 
           if(c.getNomeCurso().equals(nomeCurso)){
               lstCursos.remove(c);
           }
       }
        
       return false; 
    }
    
    public Curso pesquisar( String nomeCurso){
        for(Curso c:lstCursos){
           if (c.getNomeCurso().equals(nomeCurso)){ 
            return c;
           }        
        }
        return null;
    }
    
    public void Listar(){
        for(Curso c: lstCursos){
        System.out.println(c.toString());
        }
    }
    
}
