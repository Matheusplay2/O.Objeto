
package gerenciadores;

import classes.Aula;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorAula {
    private List<Aula> lstAulas;

    public GerenciadorAula() {
        this.lstAulas= new ArrayList<>();
    }
    
    public GerenciadorAula(Aula outro){
        
        this.lstAulas= new ArrayList<>();
        for(Aula a: lstAulas){
            
            Aula novo = new Aula();
            novo.copiar(a);
            lstAulas.add(novo);
        }
    }
    
    public void copiar(Aula outro){
        this.lstAulas= new ArrayList<>();
        
        for(Aula a: lstAulas){
            
            Aula novo = new Aula();
            novo.copiar(a);
            lstAulas.add(novo);
        }
    }
    
    
    public void add(Aula aula){
        this.lstAulas.add(aula);
        
    }
    public boolean  remover(String titulo){
      
        for(Aula a: lstAulas){
            if(a.getTitulo().equals(a)){
                lstAulas.remove(a);
               return true; 
            }            
        }      
        return false;
    }
    
    public Aula pesquisar( String titulo){
        for( Aula a: lstAulas){
            if(a.getTitulo().equals(a)){
                return a;
            }            
        }
        
        return null; 
    }
    
    public void Listar(){
        
        for(Aula a: lstAulas){
            
        }
    }
}
