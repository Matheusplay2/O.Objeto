
package com.mycompany.ex05_32.gerenciador;

import com.mycompany.ex05_32.classes.Animal;
import java.util.ArrayList;
import java.util.List;


public class GerenciadorAnimal {
    private List<Animal> lstAnimal;

    public GerenciadorAnimal() {
        this.lstAnimal= new ArrayList<>();
    }
    
    
    public void add(Animal animal){
        
        this.lstAnimal.add(animal);
    }
    
    public boolean remover(String cod){
        for(Animal a : this.lstAnimal){
            if (a.getCod().equals(cod)){
                this.lstAnimal.remove(a);
                return true;
            }
         }
        
        return false;
    }
    
    public Animal pesquisar(String cod){
        for (Animal a: this.lstAnimal){
           if (a.getCod().equals(cod)) {
               return a;
               
           }
        }
        return null;
    }
    
    public boolean atualizar(String cod ,Animal animal){
        
        for (Animal a: this.lstAnimal){
            if (a.getCod().equals(cod)){
             a.copiar(animal);
             return true;
            }
   
        }
        return false;
    }
    
    public String Listar(){
        String resultado="";
        
        for(Animal a: this.lstAnimal){
            resultado+=a+ "\n";
   
        }
        return resultado;
        
    }
}
