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
             System.out.println("Cancelada a reserva ");
             return true; 
         }
         
      }
         System.out.println("Não encontrada reserva com este nome");
      return false;
 
     
   }  
      public Reserva encontrarReserva( String nome){
         for (int i=0; i < reservas.size();i++){
             Reserva reserva_i=reservas.get(i);
         if ( reserva_i.getNome().equalsIgnoreCase(nome) ){
             System.out.println("Reserva encontrada");
             System.out.println(reserva_i);
             return reserva_i;
            
         
         }
     } 
          System.out.println(" Não encontrada reserva");
        return null;
  }
     public void ListarReserva(){
         for(int i=0;  i< reservas.size();i++ ){
             System.out.println(reservas.get(i)); 
         }
         System.out.println("Não existe reservas feitas");
     }
}