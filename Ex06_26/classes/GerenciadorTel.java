
package classes;

import java.util.ArrayList;
import java.util.List;



public class GerenciadorTel {
    
    List<Telefone> lstTel;

    public GerenciadorTel() {
        this.lstTel= new ArrayList<>();
    }

  public GerenciadorTel(GerenciadorTel outro){
      this.lstTel= new ArrayList<>();
      for ( Telefone tel: this.lstTel){
            Telefone novo=new Telefone();
            novo.copiar(tel);
          this.lstTel.add(novo);
      }
      
  }
      public void addTel(Telefone tel){
       
          this.lstTel.add(tel);
          System.out.println("Telefone adicionado");
          
      }
      
      public boolean removeTel(String numero){
          
          for(int i=0; i < lstTel.size();i++){
              if (lstTel.get(i).getNumero().equals(numero)){
                  
                  lstTel.remove(i);
                  System.out.println("Telefone excluido");
                  return true;
              }
          }
          
         return false; 
      }
      
      public Telefone pesquisar(String ddd,String numero ){
          
          for(Telefone tel: this.lstTel){
            if(tel.getDdd().equals(ddd)){  
                if (tel.getNumero().equals(numero)){
                    System.out.println("Encontrado");  
                 return tel;   
                    
                }
            }
   
     }
          
       return null;     
      }
 
 public void listar (){
           for( Telefone t: this.lstTel){ 
       
           
               System.out.println("---------------------------");
               System.out.println(t.toString()); 
               System.out.println("-----------------------");
           }
             
         }

    public List<Telefone> getLstTel() {
        return this.lstTel;
    }
   
         
}
  
