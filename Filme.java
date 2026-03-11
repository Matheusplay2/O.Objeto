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
    
    
    
    public Filme (String titulo,String diretor, int duracao,double preco){
        this.titulo= titulo;
        this.diretor=diretor;
        this.duracao=duracao;
        this.preco=preco;
    }
    
    
    public void preencher(){
        Scanner ler= new Scanner (System.in);
        System.out.println("    === PREENCHENDO ===");
        
        System.out.print(" Digite o titulo do Filme: ");
        this.titulo=ler.nextLine();
        System.out.print("Nome do diretor: ");
        this.diretor=ler.nextLine();
        System.out.print(" Duração do Filme: ");
        this.duracao=ler.nextInt();
        System.out.print("Digite preço do Filme: " );
        this.preco=ler.nextDouble();
        
    }
    public void Imprimir (){
        System.out.println("    === INFORMAÇÕES DO LIVRO ===");
        System.out.println(" LIVRO ( " +" Titulo:"+ this.titulo
            +"||"+" Diretor:"+this.diretor+"||"+"Duração:"+this.duracao
            + "min"+"||"+ " Preço do Filme:"+ this.preco+" Reais"+" )");
        
        
    }
    public void copiar( Filme outro){
        
        this.titulo= outro.titulo;
        this.diretor= outro.diretor;
        this.duracao=outro.duracao;
        this.preco=outro.preco;
        
        
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
