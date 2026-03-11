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
        
        this.marca= "";
        this.modelo="";
        this.tam=0.0;
        this.preco= 0.0;
          
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
        this.setMarca(ler.nextLine());
        
        System.out.print(" Modelo da Bicicleta :");
        this.setModelo(ler.nextLine());
        System.out.print(" Tamanho da Quadro :");
        this.setTam(ler.nextDouble());
        System.out.print(" Preco :");
        this.setPreco(ler.nextDouble());
        
        
        }
    public void imprimir(){
        
        
        System.out.println( "  === INFORMAÇOES PREECHIDAS ===");
        System.out.println(  "Marca:"+this.getMarca()+"||"+
                "Modelo:"+ this.getModelo()+ "||"+
                " Tamanho do Quadro:"+ this.getTam()+ "||"+
                " Preço:"+this.getPreco()+ "REAIS"   );
        
        
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
    
    
    



