
package gerenciador;

import classes.Professor;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorProfessor {
    private List<Professor>lstProf;

    public GerenciadorProfessor() {
        this.lstProf= new ArrayList<>();
    }
    
    
     public void add(Professor professor){
        this.lstProf.add(professor);
         System.out.println("Professor adicionado");
     }
     
     public boolean remover(String cpf){
         for(Professor f : this.lstProf){
             if (f.getCpf().equals(cpf)){
                this.lstProf.remove(f);
                 System.out.println("Professor removido");
                 return true;
                 
            }
         }
         return false;
     }
     
     public Professor pesquisar(String cpf){
         for(Professor p: this.lstProf){
              if (p.getCpf().equals(cpf)){
                 return p;
             }
         }
              return null;
     }
     
   public boolean atualizar(String cpf, Professor novoProfessor){

    for(int i = 0; i < this.lstProf.size(); i++){

        if(this.lstProf.get(i).getCpf().equals(cpf)){

            this.lstProf.set(i, novoProfessor);

            System.out.println("Professor atualizado");

            return true;
        }
    }

    return false;
}
    
     public void Listar(){
         
         for(Professor f: this.lstProf){
             System.out.println(f);
         }
     }
}
