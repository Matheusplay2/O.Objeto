
package com.mycompany.ex03_32.gerenciador;

import com.mycompany.ex03_32.classe.Casa;
import java.util.ArrayList;
import java.util.List;


public class GerenteCasa {
    private List<Casa> lstCasa;

    public GerenteCasa() {
        this.lstCasa= new ArrayList<>();
    }
    
    public void add(Casa casa){
        this.lstCasa.add(casa);
        System.out.println("casa add");
    }
    
    public boolean remover(String endereco){
        for(Casa c: this.lstCasa){
        if(c.getEndereco().equals(endereco)){    
            this.lstCasa.remove(c);
            return true;
           }    
        }
       return false; 
    }
    
    public Casa pesquisar(String endereco){
        for(Casa c: this.lstCasa){
            if (c.getEndereco().equals(endereco)){
                return c;
            }
     }
        return null;
    }
    
    public void atualizar(String endereco, Casa casaNova){
    for(Casa c : this.lstCasa){
        if (c.getEndereco().equals(endereco)){
            c.copiar(casaNova);
             }
        }
    }
    
    
 public String  listar(){
        String resultado="";
           for(Casa c: this.lstCasa){
            resultado+=c;
        }
        
        return resultado;
    }

}
