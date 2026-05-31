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
        this.endereco=endereco;
        this.area=area;
        this.numQuartos=numQuartos;
        this.preco=preco;
        
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
        this.endereco=ler.nextLine();
        System.out.println(" Digite tamanho da area:");
        this.area=ler.nextDouble();
        System.out.println(" Quantidade de quartos na casa? ");
        this.numQuartos=ler.nextInt();
        System.out.println(" Preço da casa:");
        this.preco=ler.nextDouble();
    
    }
    public void imprimir (){
        System.out.println(  "  Dados da casa   ");
        System.out.println( " Endereco:"+ this.endereco);
        System.out.println( " Tamanho da Area:" +this.area);
        System.out.println( " Quantidade de Quartos:"+ this.numQuartos);
        System.out.println( " Preço :"+  " R$"+ this.preco );
        
        
    }
    public double CalcularPrecoPorM2(){
         return this.preco/this.area;
        
    }
    
    public void exibirDados(){
        
        System.out.println(this.endereco+" | "+this.area+"m²"+"|"+this.numQuartos+""
                + " quartos"+"|"+"R$" +this.preco+ "|"+"R$"+ this.CalcularPrecoPorM2()+"m²");
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