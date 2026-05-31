
package classes;

import java.util.ArrayList;
import java.util.List;

public class Carro {
    private String modelo;
    private  int ano;
    private String cor;
    private List<Motorista> motor;

    public Carro() {
        this.modelo= " ";
        this.ano=0;
        this.cor=" ";
        this.motor=new ArrayList<>();
    }
    
    public Carro (String modelo, int ano, String cor){
        this.modelo= modelo;
        this.ano= ano;
        this.cor=cor;
        this.motor= new ArrayList<>();
    }
  public void adicionarMotorista(Motorista m){
      this.motor.add(m);
  }
    @Override
    public String toString() {
        return "Carro{" + "Modelo:" + this.modelo + ", Ano:" + this.ano + ", Cor:" + this.cor + '}';
    }
    public void imprimir(){
        System.out.println("Carro{ Modelo:"+this.modelo+ " Ano:"+this.ano+ " Cor:"+this.cor+" Motorista(s):"+this.motor+" }");
        
    }


    
    public int funcaoHash(){
        int hash=4;
        hash=20 * hash*this.modelo.hashCode();
        hash=20 * hash*this.ano;
        hash=20 * hash *this.cor.hashCode();
        hash=20*hash *this.motor.hashCode();
        return hash;
        
    }
    
    @Override
    public boolean equals(Object obj){
        if (obj == null)
        return false;
        
        Carro outro=(Carro)obj;
        return this.modelo.equals(modelo)&&
                this.ano== ano && 
                this.cor.equals(cor)&&
                this.motor.equals(motor);
    }

    public void buzinar() {
        System.out.println("O carro " + this.modelo + " está buzinando!");
        System.out.println("PAMMMMM!!!");
    }
    
   public void copiar(Carro outro){
       this.modelo=outro.getModelo();
       this.ano=outro.getAno();
       this.cor=outro.getCor();
       
       this.motor= new ArrayList<>();
       for (Motorista m1 :outro.getMotor()){
           Motorista novo=new Motorista();
           novo.copiar(m1);
           this.motor.add(novo);
           
       }
   }
    public void abrirPorta(){
        
        System.out.println("Abrindo porta do ("+this.modelo+")");
        System.out.println("Porta Aberta!!!");
    }
    
    
    public String getModelo(){
        return this.modelo;
    }
    public int getAno(){
        return this.ano;
    }
    public String getCor(){
        return this.cor;
    }
    public void setModelo(String modelo){
        this.modelo=modelo;
    }
    public void setAno(int ano){
      this.ano=ano;  
    }
    public void setCor(String cor){
        this.cor=cor;
    }

    public List<Motorista> getMotor() {
        return this.motor;
    }

    public void setMotor(List<Motorista> motor) {
        this.motor = motor;
    }
    
}
