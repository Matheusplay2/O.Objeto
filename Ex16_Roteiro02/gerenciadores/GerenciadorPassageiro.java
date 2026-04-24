
package gerenciadores;

import classes.Passageiro;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorPassageiro {
    private List<Passageiro> lstPassageiros;

    public GerenciadorPassageiro() {
        this.lstPassageiros= new ArrayList<>();
        
    }
    public GerenciadorPassageiro (  GerenciadorPassageiro outro){
        this.lstPassageiros= new ArrayList<>();
        for( Passageiro p: outro.getLstPassageiros()){
            Passageiro novo= new Passageiro();
            novo.copiar(p);
            lstPassageiros.add(novo);
            
        }
    }
    
    public void copiar(GerenciadorPassageiro outro){
        this.lstPassageiros=new ArrayList<>();
        for(Passageiro p: outro.getLstPassageiros()){
            Passageiro novo= new Passageiro();
            novo.copiar(p);
            lstPassageiros.add(novo);
            
        }
        
    }
    
    
    
    public void add(Passageiro passageiros){
        this.lstPassageiros.add(passageiros);
        System.out.println("Passageiro adicionado ao voo");
        
    }
    
    public boolean remove(String cpf){
        /*this.lstPassageiros.remove(cpf);*/
     for(Passageiro p: this.lstPassageiros){
        if( p.getCpf().equals(cpf)){
        this.lstPassageiros.remove(p);
        System.out.println("Passageiro removido do voo");
             return true;
              }
          
           }
  
        return false;
        
    }
    
    public Passageiro pesquisar(String cpf){
        for( Passageiro p: this.lstPassageiros){
            if (p.getCpf().equals(cpf)){
                System.out.println(" Passageiro encontrado");
                return p;
            }
            
           }
            return null;
        }
        
       
    public void ListarPasaageiros(){
       for(Passageiro p: this.lstPassageiros) {
           System.out.println(p.toString());
       }
        
    }

    public  List<Passageiro> getLstPassageiros() {
        return lstPassageiros;
    }
 
}
