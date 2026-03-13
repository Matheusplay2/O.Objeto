/*marca - string; modelo - string; tamanho do quadro - double; preço - double;*/
package classe;
import java.util.Scanner;

public class Bicicleta {
    private String marca;
    private String modelo;
    private double tam;
    private double preco;

    public Bicicleta() {
    }
    
    public Bicicleta (String marca, String modelo, double tam, double preco){
        
        this.marca= marca;
        this.modelo=modelo;
        this.tam=tam;
        this.preco= preco;
          
    }
    
    public void copiar ( Bicicleta outra){
        
        this.marca= outra.getMarca();
        this.modelo= outra.getModelo();
        this.tam= outra.getTam();
        this.preco=outra.getPreco();
        
    }
    
    public void preeencher (){
         
       Scanner ler= new Scanner(System.in);
       
        System.out.println("  ==== PREENCHENDO ====");
        
        System.out.print(" Marca da Bicicleta :");
        this.marca=ler.nextLine();
        
        System.out.print(" Modelo da Bicicleta :");
        this.modelo=ler.nextLine();
        System.out.print(" Tamanho da Quadro :");
        this.tam=ler.nextDouble();
        System.out.print(" Preco :");
        this.preco=ler.nextDouble();
        
        
        }
    public void imprimir(){
        
        
        System.out.println( "  === INFORMAÇOES PREECHIDAS ===");
        System.out.println(  "Marca:"+this.marca+"||"+
                "Modelo:"+ this.modelo+ "||"+
                " Tamanho do Quadro:"+ this.tam+ "||"+
                " Preço:"+this.preco+ "REAIS"   );
        
        
    }
    
    
    public String getMarca(){
        return marca;
    }
    public String getModelo(){
        return modelo;
    }
    public double getTam(){
        return tam;
    }
    public double getPreco(){
        return preco;
    }
    
    public void setMarca(String marca){
        this.marca= marca;
    }
    public void setModelo (String modelo){
        this.modelo=modelo;
    }
    public void setTam( double tam){
        this.tam=tam;
    }
    public void setPreco( double preco){
        this.preco=preco;
    }
    
    

}
    
    
    



