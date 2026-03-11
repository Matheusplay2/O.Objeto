/*marca - string; tamanho - double; resolução - string; preço - double;*/
package Tv;
import java.util.Scanner;

public class Tv {
    private String  marca;
    private double tam;
    private String reso;
    private double preco;
    
    
  public Tv() {
    }
    

 public  Tv(String marca,double tam, String reso, double preco){
    this.marca= "";
    this.preco= 0.0;
    this.reso="";
    this.tam=0.0 ;
    
}
  public void imprimir (){
      System.out.println( " marca:"+ this.getMarca());
      System.out.println( " preco:"+this.getPreco()+ " R$ ");
      System.out.println( " resolucao:"+this.getReso());
      System.out.println(" tamanho:"+this.getTam());
     
    }
        
    public void preencher(){
        Scanner ler= new Scanner(System.in);
        
        System.out.print(" digite nome da marca da tv:");
        this.setMarca(ler.nextLine());
        System.out.print ( " digite preco:");
        this.setPreco(ler.nextDouble());
        System.out.print(" digite resolucao:");
        this.setReso(ler.nextLine());
        ler.nextLine();
        System.out.println( " digite o  tamanho da tv: ");
        this.setTam(ler.nextDouble());
        
    }
    
    public void copiar( Tv outra ){
        this.marca=outra.getMarca();
        this.preco=outra.getPreco();
        this.tam=outra.getTam();
        this.reso=outra.getReso();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTam() {
        return tam;
    }

    public void setTam(double tam) {
        this.tam = tam;
    }

    public String getReso() {
        return reso;
    }

    public void setReso(String reso) {
        this.reso = reso;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
 }


