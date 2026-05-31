
package classe;
  import java.util.Scanner;
public class Filme {
  


    private String titulo;
    private String diretor;
    private double duracao;
    private double preco;

    
    public Filme() {
    }

   
    public Filme(String titulo, String diretor, double duracao, double preco) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.preco = preco;
    }

    
    public void preencher() {

        Scanner ler = new Scanner(System.in);

        System.out.println("=== PREENCHENDO ===");

        System.out.print("Digite o titulo do Filme: ");
        this.titulo = ler.nextLine();

        System.out.print("Nome do diretor: ");
        this.diretor = ler.nextLine();

        System.out.print("Duracao do Filme: ");
        this.duracao = ler.nextDouble();

        System.out.print("Digite preco do Filme: ");
        this.preco = ler.nextDouble();
    }

    
    public void imprimir() {

        System.out.println("=== INFORMACOES DO FILME ===");

        System.out.println(
                "FILME ( " +
                "Titulo: " + this.titulo +
                " || Diretor: " + this.diretor +
                " || Duracao: " + this.duracao + " min" +
                " || Preco: " + this.preco + " Reais )"
        );
    }

   
    public void copiar(Filme outro) {

        this.titulo = outro.getTitulo();
        this.diretor = outro.getDiretor();
        this.duracao = outro.getDuracao();
        this.preco = outro.getPreco();

    }

  

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public double getDuracao() {
        return duracao;
    }

    public double getPreco() {
        return preco;
    }

 

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
    

