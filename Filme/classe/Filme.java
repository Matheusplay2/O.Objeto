/*título - string; diretor - string; duração - int; preço - double;*/
package classe;
import java.util.Scanner;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;
    private double preco;

    public Filme() {
    }

    public Filme(String titulo, String diretor, int duracao, double preco) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.preco = preco;
    }
    
    
    public void copiar(Filme outro){
        this.titulo=outro.getTitulo();
        this.diretor=outro.getDiretor();
        this.duracao=outro.getDuracao();
        this.preco=outro.getPreco();
        
   
        
    }
    
    public void imprimir(){
        
        System.out.println("  === DADOS DO Filme ===");
        System.out.println("Filme {"
                + "Titulo:"+this.titulo
        +"  Diretor:"+this.diretor
        +"  Duraçao:"+this.duracao+ "min"
        +"  Preço:R$ "+this.preco);
        
    }
    
    public void preencher(){
        
        Scanner ler=new Scanner( System.in);
        System.out.println("   PREENCHENDO    ");
        System.out.print("Titulo do Filme:");
        this.titulo=ler.nextLine();
        System.out.print("Digite nome do diretor:");
        this.diretor=ler.nextLine();
        System.out.print("Duraçao do Filme:");
        this.duracao=ler.nextInt();
        System.out.print(" Digite o preço:");
        this.preco=ler.nextDouble();
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
