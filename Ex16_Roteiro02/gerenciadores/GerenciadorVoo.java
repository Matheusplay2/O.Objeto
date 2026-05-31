
package gerenciadores;

import classes.Voo;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorVoo {
    private List<Voo> voos;
    
public GerenciadorVoo(){
    this.voos= new ArrayList<>();
}
public GerenciadorVoo(GerenciadorVoo outro){
    this.voos= new ArrayList<>();
    
    if(outro != null){
        for(Voo v : outro.getVoos()){
            this.voos.add (new Voo(v));
        }
    }
   
}
public void copiarVoo(GerenciadorVoo outro){
    this.voos= new ArrayList<>();
    
    if(outro!= null){
        for(Voo v :outro.getVoos()){
            Voo vo= new Voo();
            vo.copiarVoo(v);
            this.voos.add(vo);
        }
    }
    
    
}
public void addVoo(Voo voo){
    this.voos.add(voo);
}
public int size(){
   return this.voos.size();
}

 public boolean removerVoo(int index){
        if(index >= 0 && index < this.size()){
            this.voos.remove(index);
            return true;
        }
        return false;
    }

    public boolean removerVooBYint(int numero){
    for(int i = 0; i < this.voos.size(); i++){
        if(numero == this.voos.get(i).getNumero()){
            this.voos.remove(i);
            return true;
        }
    }
    return false;
}


    public List<Voo> getVoos() {
        return voos;
    }
}
