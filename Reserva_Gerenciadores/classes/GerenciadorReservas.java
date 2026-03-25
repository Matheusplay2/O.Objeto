
package classes;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorReservas {
    List<Reserva> reservas= new ArrayList<>(); 
    
    
    public void adicionar(Reserva novaReserva ){
       reservas.add(novaReserva);
        System.out.println(" Reservada Feita com sucesso");
    }
     public boolean cancelarReserva( String nome){
         
         
         for (int i=0; i < reservas.size();i++){  
             Reserva reserva_i=reservas.get(i);
         if ( reserva_i.getNome().equalsIgnoreCase(nome)){
             reservas.remove(i);
             return true; 
         }
         
      }
      return false;
 
     
   }  
      public Reserva encontrarReserva( String nome){
         for (int i=0; i < reservas.size();i++){
             Reserva reserva_i=reservas.get(i);
         if ( reserva_i.getNome().equalsIgnoreCase(nome) ){
             return reserva_i;
         
         }
     } 
      
        return null;
  }
     public void ListarReserva(){
         for(int i=0;  i< reservas.size();i++ ){
             System.out.println(reservas.get(i)); 
          }
  
     }
     
}
   





         
