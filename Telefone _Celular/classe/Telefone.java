/*marca - string; modelo - string; preço - double; memória - double;*/
package classe;

import java.util.Scanner;
public class Telefone {
    
    private String marca;
    private String modelo;
    private double preco;
    private double memoria;

    public Telefone() {
    }

    public Telefone(String marca, String modelo, double preco, double memoria) {
        this.marca = "";
        this.modelo = "";
        this.preco = 0.0;
        this.memoria = 0.0;
    }
    
    public void preencher(){
        Scanner ler=new Scanner(System.in);
        System.out.println(" === PREENCHENDO ===");
        
        System.out.print(" Digite Marca do telefone:");
        this.marca=ler.nextLine();
        System.out.print("Digite o Modelo:");
        this.modelo=ler.nextLine();
        System.out.print("Preço do telefone:");
        this.preco=ler.nextDouble();
        System.out.print("Memoria:");
        this.memoria=ler.nextDouble();
    }
    public void imprimir() {
        System.out.println("  **** INFORMAÇÕES DO TELEFONE ****");
        System.out.println("Telefone {"+
                " Marca:"+this.marca
               +" Modelo:"+ this.modelo
               +" Preço: R$ "+ this.preco
                + " Memória: "+ this.memoria + "gb");
            

            }
    public void copiar (Telefone outro){
        this.marca=outro.getMarca();
        this.modelo=outro.getModelo();
        this.preco=outro.getPreco();
        this.memoria= outro.getMemoria();
        
        
    }
    
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public double getPreco(){
        return this.preco;
    }
    public double getMemoria(){
        return this.memoria;
    }
    public void setMarca(String marca){
        this.marca=marca; 
    }
    public void setModelo(String modelo){
       this.modelo=modelo; 
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
    public void setMemoria(double memoria){
        this.memoria=memoria;
    }
    
}
    


