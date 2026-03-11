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
        this.titulo="";
        this.diretor="";
        this.duracao=0;
        this.preco=0.0;
    }
    
    
    public void preencher(){
        Scanner ler= new Scanner (System.in);
        System.out.println("    === PREENCHENDO ===");
        
        System.out.print(" Digite o titulo do Filme: ");
        this.setTitulo(ler.nextLine());
        System.out.print("Nome do diretor: ");
        this.setDiretor(ler.nextLine());
        System.out.print(" Duração do Filme: ");
        this.setDuracao(ler.nextInt());
        System.out.print("Digite preço do Filme: " );
        this.setPreco(ler.nextDouble());
        
    }
    public void Imprimir (){
        System.out.println("    === INFORMAÇÕES DO LIVRO ===");
        System.out.println(" LIVRO ( " +" Titulo:"+ this.getTitulo()
            +"||"+" Diretor:"+this.getDiretor()+"||"+"Duração:"+this.getDuracao()
            + "min"+"||"+ " Preço do Filme:"+ this.getPreco()+" Reais"+" )");
        
        
    }
    public void copiar( Filme outro){
        
        this.titulo= outro.getTitulo();
        this.diretor= outro.getDiretor();
        this.duracao=outro.getDuracao();
        this.preco=outro.getPreco();
        
        
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
