
package classes;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorMusica {
    
    private List<Musica> lstMsc;

    public GerenciadorMusica() {
        this.lstMsc= new ArrayList<>();
    }
    
    public GerenciadorMusica( GerenciadorMusica outro){
        this.lstMsc= new ArrayList<>();
        for( Musica m: outro.getLstMsc()){     
            Musica nova =new Musica();
            nova.copiar(m);
        this.lstMsc.add(nova);
        }
    }
    
    public void add(Musica m){
        Musica nova= new Musica(m);
        lstMsc.add(nova);
        System.out.println(" Musica adicionada com sucesso..");
        
    }
    
    public boolean remove(String titulo){
        for(int i=0; i < lstMsc.size();i++){
        if(lstMsc.get(i).getTitulo().equals(titulo)){
             this.lstMsc.remove(i);
             return true;
            }
            
        } 
       return false;     
    } 
      
    public Musica buscar(String titulo){
        for(Musica m :this.lstMsc){
            if( m.getTitulo().equals(titulo)){
              return m;  
            }     
        }          
            return null;
     }
        
   public void listar(){
      for(Musica m: this.lstMsc){ 
          System.out.println(m);
          
      }
       
   } 

    public List<Musica> getLstMsc() {
        return this.lstMsc;
    }
   
   
}
