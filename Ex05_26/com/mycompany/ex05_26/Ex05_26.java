

package com.mycompany.ex05_26;
import classes.Carro;
import classes.Proprietario;
import classes.Roda;

public class Ex05_26 {

    public static void main(String[] args) {
     Carro c1=new Carro("wolksvagem"," golf", "preto");
     Proprietario p1= new Proprietario("Matheus"," @gmail.com"," 787663");
     Roda r1=new Roda(22.0,"Liga leve","preta");
     c1.getRodas().addRoda(r1);
     Carro c2= new Carro("Toyota", "Corolla","Branco");
     c2.getRodas().addRoda(r1);
     p1.getCarro().addCarro(c1);
     p1.getCarro().addCarro(c2);
     
     
     
     Carro c3=new Carro("wolksvagem", " gol", "cinza");
     Carro c4= new Carro("wolksvagem", " Nivus"," Branco");
     Roda r2=new Roda( 18.0," Liga leve", " preta");
     c3.getRodas().addRoda(r2);
     c4.getRodas().addRoda(r2);
     Proprietario p2=new Proprietario(" Ana ", " jdsg@gmail.com", " 734573");
     p2.getCarro().addCarro(c3);
     p2.getCarro().addCarro(c4);
     
     
    System.out.println("=== PROPRIETARIO 1 ===");
    System.out.println("Nome: " + p1.getNome());
    p1.getCarro().listar();

    System.out.println("\n=== PROPRIETARIO 2 ===");
    System.out.println("Nome: " + p2.getNome());
    p2.getCarro().listar();
     
      boolean iguais = false;

    for(Carro carro1 : p1.getCarro().getLstCarro()){
        for(Carro carro2 : p2.getCarro().getLstCarro()){

            if(carro1.getFabricante().equals(carro2.getFabricante())){
                iguais = true;
            }
        }
    }
    if(iguais){
        System.out.println("Possuem fabricantes iguais");
    }else{
        System.out.println("Nao possuem fabricantes iguais");
    }
      
 }
 
}

