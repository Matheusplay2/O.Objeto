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
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.classificacao = classificacao;
        this.preco = preco;
    }
    
    
    public  void copia ( Jogo outro){
        
        this.titulo= outro.titulo;
        this.plataforma= outro.plataforma;
        this.classificacao= outro.classificacao;
        this.preco= outro.preco;
        
    }
    public void imprimir(){
        System.out.println("    === DADOS DO JOGO ===");
        
        System.out.println( "Game{");
                System.out.println( "Titulo:"+ this.titulo);
                System.out.println("Plataforma:"+this.plataforma);
                System.out.println("Classificação_Etaria:"+this.classificacao);
                System.out.println("Preço:"+this.preco);   
                System.out.println("}");
    }
    
    public void preencher(){
       Scanner ler=new Scanner(System.in) ;
        System.out.println("    === PREENCHENDO DADOS DO JOGO ===");
       
       System.out.print(" Digite  Nome Do Jogo:");
       this.titulo=ler.nextLine();
       System.out.print(" Insira Plataforma do Jogo:");
       this.plataforma=ler.nextLine();
       System.out.print( " Classificaçaõ étaria do Jogo: ");
       this.classificacao=ler.nextLine();
       System.out.print( "Preço do Jogo:");
       this.preco=ler.nextDouble();
        
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
