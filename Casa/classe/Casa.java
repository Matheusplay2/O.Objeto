/*endereço - string; área - double; número de quartos - int; preço - double;*/
package classe;
import java.util.Scanner;
public class Casa {
    private String endereco;
    private double area;
    private int numQuartos;
    private double preco;

    public Casa() {
    }
            
    public Casa(String endereco,double area, int numQuartos,double preco){
        this.endereco="";
        this.area=0.0;
        this.numQuartos=0;
        this.preco=0.0;
        
    }
    
    
    public void copiar( Casa outra){
        this.area=outra.getArea();
        this.endereco=outra.getEndereco();
        this.numQuartos=outra.getNumQuartos();
        this.preco=outra.getPreco();
        
    }
    
    public void preencher(){
        System.out.println("    PREENCHENDO DADOS DA CASA     ");
        System.out.println();
           
        Scanner ler= new Scanner(System.in);
        System.out.println( " Digite seu endereço:");
        this.setEndereco(ler.nextLine());
        System.out.println(" Digite tamanho da area:");
        this.setArea(ler.nextDouble());
        System.out.println(" Quantidade de quartos na casa? ");
        this.setNumQuartos(ler.nextInt());
        System.out.println(" Preço da casa:");
        this.setPreco(ler.nextDouble());
    
    }
    public void imprimir (){
        System.out.println(  "  Dados da casa   ");
        System.out.println( " Endereco:"+ this.getEndereco());
        System.out.println( " Tamanho da Area:" +this.getArea());
        System.out.println( " Quantidade de Quartos:"+ this.getNumQuartos());
        System.out.println( " Preço :"+  " R$"+ this.getPreco() );
        
        
    }
    public double CalcularPrecoPorM2(){
         return this.getPreco()/this.getArea();
        
    }
    
    public void exibirDados(){
        
        System.out.println(this.getEndereco()+" | "+this.getArea()+"m²"+"|"+this.getNumQuartos()+""
                + " quartos"+"|"+"R$" +this.getPreco()+ "|"+"R$"+ this.CalcularPrecoPorM2()+"m²");
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


   
    
}