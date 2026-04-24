
package gerenciadores;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEscala {
    private List<String>lstEscalas;


    public GerenciadorEscala() {
        this.lstEscalas= new ArrayList<>();
    
    }

    public GerenciadorEscala(GerenciadorEscala outro) {
        this.lstEscalas = new ArrayList<>();
        
        for(String e: outro.getLstEscalas()){
            this.lstEscalas.add(e);
            
        }
    }
    
    public void copiar(GerenciadorEscala outro) { 
         this.lstEscalas=new ArrayList<>();
         for(String e: outro.getLstEscalas()){
             this.lstEscalas.add(e);
         }
    }
    
    public void add(String lstEscalas){
        this.lstEscalas.add(lstEscalas);
        System.out.println("Lista de escala adicioanada");
        
    }
    
    
   public void removerEscala(String lstEscala) {
         lstEscalas.remove(lstEscala);
         System.out.println("Escala removida");
     }
    
   
   public void listarEscalas(){
       for(String  e: this.lstEscalas){
           System.out.println(e);
       }
   }

    public List<String> getLstEscalas() {
        return this.lstEscalas;
    }
   
}
