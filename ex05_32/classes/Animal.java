
package com.mycompany.ex05_32.classes;

import static java.util.Objects.hash;

/*Animal{
	"cod": 201
	"nome": "Toto",
  "especie": "Cachorro",
  "raca": "Golden Retriever",
  "idade": 3,
  "peso": 30
}*/
public class Animal {
    private String cod;
    private String nome;
    private String especie;
    private String raca;
    private int idd;
    private  double peso;

    public Animal() {
        this.cod="";
        this.especie="";
        this.nome="";
        this.raca="";
        this.peso=0.0;
        this.idd=0;
    }
    
    public void Animal(String cod, String especie,String nome, String raca, int idd, double peso){
        this.cod=cod;
        this.nome=nome;
        this.especie=especie;
        this.peso=peso;
        this.idd=idd;
        this.raca=raca;
        
    }
    
    @Override
    public String toString (){
        return " Animal{Codigo:"+this.cod+",Nome:"+this.nome+
                ",Especie:"+this.especie+",Idade:"+this.idd+
                ",Raca:"+this.raca+",Peso:"+this.peso+" Kg"+"}";
    }
    
    @Override
    public int hashCode(){
        int hash=5;
       hash=33* hash+ this.nome.hashCode();
       hash= 33 *hash+ this.cod.hashCode();
       hash=(int) (33 * hash+ this.peso);
       hash=33 * hash + this.idd;
       hash=33 * hash + this.especie.hashCode();
       hash=33 * hash + this.raca.hashCode();
       
        
        
        return hash;
    }
    
    public  boolean equals(Object obj){
        if (obj== null)
           return false; 
       
        Animal outro= (Animal)obj;
            return this.cod.equals(outro.cod) &&
                    this.raca.equals(outro.raca)&&
                    this.especie.equals(outro.especie)&&
                    this.nome.equals(outro.nome)&&
                    this.idd== outro.idd &&
                    this.peso==outro.peso;

    }
   public void copiar(Animal outro){   
         this.cod=outro.getCod();
         this.especie=outro.getEspecie();
         this.nome=outro.getNome();
         this.peso=outro.getPeso();
         this.raca=outro.getRaca();
         this.idd=outro.getIdd();
             
         }
            
            
    public String getCod(){
       return this.cod; 
    }
    public void setCod(String cod){
       this.cod=cod; 
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getIdd() {
        return this.idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
