

package com.mycompany.exercicio5;
import classe.Animal;

public class Exercicio5 {

    public static void main(String[] args) {
        Animal animal1 ,animal2 , animal3;
        animal1=new Animal();
       
        animal2=new Animal();
        animal3=new Animal();
        
        animal1.preencher();
        animal2.preencher();
        animal3.preencher();
        
        System.out.println("   === MEUS ANIMAIS ===   ");
        animal1.imprimir();
        animal2.imprimir();
        animal3.imprimir();
        
    }
}
