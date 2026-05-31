
package com.mycompany.ex01_36.classes;

/*nome, sexo, idade, e CPF.*/
public class Professor {
    private String nome;
    private String sexo;
    private int idd;
    private String cpf;

    public Professor() {
        this.nome="";
        this.sexo="";
        this.idd=0;
        this.cpf="";
    }
    
    public Professor(String nome, String sexo, int idd, String cpf){
        this.nome=nome;
        this.sexo=sexo;
        this.idd=idd;
        this.cpf=cpf;
    }
    
    public void copiar(Professor outro){
        this.nome=outro.getNome();
        this.sexo=outro.getSexo();
        this.idd=outro.getIdd();
        this.cpf=outro.getCpf();
        
    }
    
    @Override
    public String toString (){
     return  "Professor{Nome:"+this.nome+",Sexo:"+this.sexo+   
             ",Idade:"+this.idd+"CPF:"+this.cpf+"}";
    }
    
  
    @Override 
    public int hashCode(){
        int hash=5;
        
        hash= 33 * hash+ this.nome.hashCode();
        hash=33 * hash + this.sexo.hashCode();
        hash=33 * hash+ this.idd;
        hash=33 * hash+ this.cpf.hashCode();
       
        return hash;
    }
    
    @Override
    
    public boolean equals(Object obj){
        if (obj == null)
            return false;
        
        Professor outro=(Professor)obj;
        
        return this.nome.equals(outro.getNome())&&
                this.sexo.equals(outro.getSexo())&&
                this.idd== outro.getIdd()&&
                this.cpf.equals(outro.getCpf());
        
        
    }
    public String getNome(){
       return this.nome; 
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    public int getIdd(){
        return this.idd;
    }
    public void setIdd(int idd){
       this.idd=idd; 
    }
    public String getCpf(){
       return this.cpf; 
    }
    public void setCpf(String cpf){
        this.cpf=cpf;
     }
}
