
package com.mycompany.sett;

import java.util.HashSet;
import java.util.Set;

public class Sett {

    public static void main(String[] args) {
        Set< String> animais=new HashSet<>();
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add(" Tatu");
        animais.add("Cachorro");
        animais.add("Paca");
        
        
        for (String animal: animais){
            System.out.println(animal); 
        }
        System.out.println("");
        
        System.out.println("LISTA APÓS REMOÇÃO DE ANIMAL");
        animais.remove("Cachorro");
        for (String animal: animais){
            System.out.println(animal); 
        }
    }
}
