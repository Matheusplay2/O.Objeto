
package gerenciadores;

import classes.Projeto;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorProjetos {
    private List<Projeto> lstProjetos;

    public GerenciadorProjetos() {
        this.lstProjetos= new ArrayList<>();
    }
 

    public void copiar(GerenciadorProjetos outro){
        this.lstProjetos= new ArrayList<>();
        
        for(Projeto p: outro.lstProjetos){
            Projeto novo= new Projeto();
            novo.copiar(p);
            lstProjetos.add(novo);
        }
        
    }
    public void add(Projeto projeto){
        this.lstProjetos.add(projeto);
        System.out.println(" Projeto adicionado");
        
    }
    
public boolean remover(int cod){

    for(int i = 0; i < lstProjetos.size(); i++){
        if(lstProjetos.get(i).getCod() == cod){

            lstProjetos.remove(i);
             System.out.println("Projeto removido");
              return true;
        }
    }

    return false;
}
    
    public Projeto pesquisar(int cod, String nomeProjeto){
        for (Projeto projeto: lstProjetos){
            if (projeto.getCod()== cod){
             if (projeto.getNomeProjeto().equals(nomeProjeto)){   
               return projeto;
             }
                
            }
            
        }
        
      return null;  
    }
    
    public void ListarProjetos(){
        
        for(Projeto p : lstProjetos){ 
            System.out.println(p.toString()); 
        }
        
    }

    public List<Projeto> getLstProjeto() {
        return lstProjetos;
    }
     
    
}
