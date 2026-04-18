
package classes;

import java.util.ArrayList;
import java.util.List;


public class gCarro {
    private List<Carro> lstCarro;

    public gCarro() {
     this.lstCarro=new ArrayList<>();
    }

   public gCarro(List<Carro> lstCarro) {
    this.lstCarro = new ArrayList<>();

    for(Carro c : lstCarro){
        Carro novo = new Carro();
        novo.copiar(c);
        this.lstCarro.add(novo);
    }
}

public void addCarro(Carro c){
    Carro novo = new Carro();
    novo.copiar(c);
    this.lstCarro.add(novo);
       System.out.println("Carro adicionado");
}
    
 public boolean remove(String modelo, String fabricante){
    for(int i = 0; i < lstCarro.size(); i++){
        if(lstCarro.get(i).getModelo().equals(modelo) &&
           lstCarro.get(i).getFabricante().equals(fabricante)){
            
            lstCarro.remove(i);
            return true;
        }
    }
    return false;
}
    
    public Carro pesquisar(String modelo, String fabricante){
         for( Carro c: this.lstCarro){
             if (c.getModelo().equals(modelo)){
                 if (c.getFabricante().equals(fabricante)){
                          
      return c;
                 }
             }
         } 
         return null;
    }
    public void  listar(){
        
        for(Carro c: this.lstCarro){
            System.out.println(c);
        }
    }

    public List<Carro> getLstCarro() {
        return lstCarro;
    }
    
}
