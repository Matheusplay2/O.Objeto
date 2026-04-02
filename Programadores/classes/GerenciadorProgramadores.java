
package classes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorProgramadores {
    
    List<Programador> programadores =new ArrayList<>();
    

     public void add(Programador p){
           programadores.add(p);
           System.out.println("Adicionado novo programador");
       }
     public boolean remove(String nome, String  cpf){
        for (int i=0; i < programadores.size();i++ ){
           Programador  programador_i= programadores.get(i);
            if ( programador_i.getNome().equalsIgnoreCase(nome)){
                if (programador_i.getCpf().equals(cpf)){
                    
                    
                    programadores.remove(i);
                    System.out.println("Programador removido");
                    return true;
                }
            }
        }
         System.out.println(" Programador nao encontrado");
        return false;
      
     }
     public boolean procurar ( String nome, String cpf){
         for( int i=0; i < programadores.size();i++){
             Programador programador_i=programadores.get(i);
             if (programador_i.getNome().equalsIgnoreCase(nome)){
                 if (programador_i.getCpf().equals(cpf)){
                     System.out.println("Encontrado");
                     System.out.println(programador_i.toString());
                     return true;
             }
         }
     }
         System.out.println("Nao encontrado");
       return false;  
     }
    public void listar(){
    if (programadores.isEmpty()) {
        System.out.println("Nao existe programadores");
    } else {
        for (int i = 0; i < programadores.size(); i++){
            System.out.println(programadores.get(i));
        }
    }
  }
}
