/*título - string; plataforma - string; classificação etária - string; preço - double;*/
package classe;
import java.util.Scanner;

public class Jogo {
    private String titulo;
    private String plataforma;
    private String classificacao;
    private double preco;

    public Jogo() {
    }

    public Jogo(String titulo, String plataforma, String classificacao, double preco) {
        this.titulo = "";
        this.plataforma = "";
        this.classificacao ="";
        this.preco = 0.0;
    }
    
    
    public  void copia ( Jogo outro){
        
        this.titulo= outro.getTitulo();
        this.plataforma= outro.getPlataforma();
        this.classificacao= outro.getClassificacao();
        this.preco= outro.getPreco();
        
    }
    public void imprimir(){
        System.out.println("    === DADOS DO JOGO ===");
        
        System.out.println( "Game{");
                System.out.println( "Titulo:"+ this.getTitulo());
                System.out.println("Plataforma:"+this.getPlataforma());
                System.out.println("Classificação_Etaria:"+this.getClassificacao());
                System.out.println("Preço:"+this.getPreco());   
                System.out.println("}");
    }
    
    public void preencher(){
       Scanner ler=new Scanner(System.in) ;
        System.out.println("    === PREENCHENDO DADOS DO JOGO ===");
       
       System.out.print(" Digite  Nome Do Jogo:");
       this.setTitulo(ler.nextLine());
       System.out.print(" Insira Plataforma do Jogo:");
       this.setPlataforma(ler.nextLine());
       System.out.print( " Classificaçaõ étaria do Jogo: ");
       this.setClassificacao(ler.nextLine());
       System.out.print( "Preço do Jogo:");
       this.setPreco(ler.nextDouble());
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    
    
}
