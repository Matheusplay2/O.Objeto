
/*package classe;*/

package classe;

import java.util.Scanner;


public class PC {
    private String marca;
    private String sistema;
    private double memoria;

    public PC() {
    }

    public PC(String marca, String sistema, double memoria) {
        this.marca = marca;
        this.sistema = sistema;
        this.memoria = memoria;
    }
    
    public void preencher(){
        Scanner ler=new Scanner (System.in);
        System.out.println("     === PREENCHENDO ==");
        System.out.print("Insira marca no computador:");
        this.marca=ler.nextLine();
        System.out.print("Insira seu sistema:");
        this.sistema=ler.nextLine();
        System.out.print("Digite o tamanho da memoria:");
        this.memoria=ler.nextDouble();
        ler.nextLine();
    }
    
  public void copiar (PC outro){
      
      this.marca=outro.getMarca();
      this.sistema=outro.getSistema();
      this.memoria=outro.getMemoria();
      
  }
    
    @Override

    public String toString(){
        
        String pc= "Marca:"+ this.marca;
        pc+= "Sistema:"+ this.sistema;
        pc+= "Memoria:"+ this.memoria;
        return pc;
    }
    
    
    public String getMarca(){
        return marca;
    }
    public String getSistema(){
        return sistema;
    }
    public double getMemoria(){
        return memoria;
    }
    
        
     public void setMarca(String marca)  { 
         this.marca=marca;
     }
        public void setSistema(String sistema){
            this.sistema=sistema;
        }
    public void setMemoria(double  memoria){
        this.memoria=memoria;
    }
    
}
