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
    this.marca= marca;
    this.preco= preco;
    this.reso=reso;
    this.tam= tam;
    
}
  public void imprimir (){
      System.out.println( " marca:"+ marca);
      System.out.println( " preco:"+preco+ " R$ ");
      System.out.println( " resolucao:"+reso);
      System.out.println(" tamanho:"+tam);
     
    }
        
    public void preencher(){
        Scanner ler= new Scanner(System.in);
        
        System.out.print(" digite nome da marca da tv:");
        this.marca=ler.nextLine();
        System.out.print ( " digite preco:");
        this.preco=ler.nextDouble();
        System.out.print(" digite resolucao:");
        this.reso=ler.nextLine();
        ler.nextLine();
        System.out.println( " digite o  tamanho da tv: ");
        this.tam= ler.nextDouble();
        
    }
    
    public void copiar( Tv outra ){
        this.marca=outra. marca;
        this.preco=outra.preco;
        this.tam=outra.tam;
        this.reso=outra.reso;
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


