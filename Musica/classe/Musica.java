/*título - string; artista - string; duração - int; preço - double; */
package classe;
import java.util.Scanner;
public class Musica {
    private String titulo;
    private String artista;
    private int duracao;
    private double preco;

    public Musica() {
    }

    public Musica(String titulo, String artista, int duracao, double preco) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.preco = preco;
    }
    
    public void preencher(){
        Scanner ler=new Scanner (System.in);
        
        System.out.print(" Insira Titulo da Musica:");
        this.titulo=ler.nextLine();
        System.out.print(" Nome do Artista(s):");
        this.artista=ler.nextLine();
        System.out.print("Duração da Musica:");
        this.duracao=ler.nextInt();
        System.out.print(" Preço da Musica:");
        this.preco=ler.nextDouble();
    }
    public void imprimir(){
        System.out.println("  === DADOS DA MUSICA ===");
        System.out.println("Titulo:"+this.titulo);
        System.out.println("Artista(s):"+this.artista);
        System.out.println("Duração:"+this.duracao+ "  min");
        System.out.println("Preço:R$"+this.preco);
    }
    public void copiar(Musica outro){
        this.titulo=outro.getTitulo();
        this.artista=outro.getArtista();
        this.duracao=outro.getDuracao();
        this.preco=outro.getPreco();
    }
    
    public void tocarMusica (){
        System.out.println("A musica  ("+ this.titulo +") do artista(s)" +this.artista+" está tocando");
        
    }
                  
    public void desligarMusica(){
        System.out.println("Desligando musica("+ this.titulo+") do artista(s)"+this.artista);
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
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
