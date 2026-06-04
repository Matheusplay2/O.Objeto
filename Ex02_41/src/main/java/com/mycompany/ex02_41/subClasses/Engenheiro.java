
package com.mycompany.ex02_41.subClasses;

import com.mycompany.ex02_41.superClasse.Funcionario;
import java.util.Objects;
import java.util.Scanner;


public class Engenheiro extends Funcionario{
    private String crea;
    private String area;

    public Engenheiro() {
        super();
        this.crea="";
        this.area="";
    }
    
    
    public Engenheiro(String nome,String cpf, int idd, String crea, String area){
        super( nome, cpf,idd);
        this.crea=crea;
        this.area=area;
        
    }
    
    
    @Override
    public String toString(){
        return super.toString()+"\nCrea:"+this.crea+
                "\nArea:"+this.area;
    }
    
    @Override
    public void imprimir(){
        System.out.println(this);   
        
    }
    
    @Override
    public void preencher(){
     Scanner ler = new Scanner(System.in);   
        super.preencher();
        System.out.println("Digite seu Crea:");
        this.crea=ler.nextLine();
        System.out.println("Area de atuação (ex: Civil, Elétrica, Software):");
        this.area=ler.nextLine();
      
    }
    
    public void copiar(Engenheiro outro){
       super.copiar(outro);
       this.crea=outro.getCrea();
       this.area=outro.getArea();
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.crea);
        hash = 89 * hash + Objects.hashCode(this.area);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Engenheiro other = (Engenheiro) obj;
        if (!Objects.equals(this.crea, other.crea)) {
            return false;
        }
        return Objects.equals(this.area, other.area);
    }
    
    
   public String getCrea(){ 
       return this.crea;
   }
   public void setCrea(String crea){
     this.crea=crea;  
    }
   public String getArea(){
     return this.area;  
   }
   
   public void setArea(String area){
      this.area=area; 
   }
    
}
