
package classes;

import java.util.ArrayList;
import java.util.List;


public class gRoda {
    private List<Roda> lstRoda;

    public gRoda() {
        this.lstRoda=new ArrayList<>();
    }

 public gRoda(List<Roda> lstRoda) {
        this.lstRoda = new ArrayList<>();
        for(Roda r : lstRoda){
            Roda nova = new Roda();
            nova.copiar(r);
            this.lstRoda.add(nova);
        }
    }
    public void addRoda( Roda r){ 
        this.lstRoda.add(r);
        System.out.println("Adicionado com sucesso");    
    }
    
public boolean remove(String cor, double raio){
    for(int i = 0; i < lstRoda.size(); i++){
        if(lstRoda.get(i).getCor().equals(cor) &&
           lstRoda.get(i).getRaio() == raio){
            
            lstRoda.remove(i);
            return true;
        }
    }
    return false;
}
    public Roda pesquisar(String cor, String material){
        
       for(Roda r: this.lstRoda) {
           if (r.getMaterial().equals(material)){
              if(r.getCor().equals(cor)) {
                  return r;
              }
           }
       }
        
    return null;    
               
    }
    public void listar(){
        for( Roda r: lstRoda){
        System.out.println(r); 
        }
        
    }

    public List<Roda> getLstRoda() {
        return lstRoda;
    }
    
    
}
