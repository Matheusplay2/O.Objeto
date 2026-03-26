package classe;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Musica {
    private String titulo;
    private String artista;
    private double duracao;
    private double preco;

    public Musica() {
    }

    
    public Musica(String titulo, String artista, double duracao, double preco) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.preco = preco;
    }

 @Override
 public String toString(){
     return " Musica "+ "Titulo:"+this.titulo
             +" Artista:"+this.artista
             +" Duração:"+this.duracao
             +"Preço:R$" +this.preco;
 
    
 }
    public void Copiar(Musica outra){
        this.titulo = outra.getTitulo();
        this.artista = outra.getArtista();
        this.duracao = outra.getDuracao();
        this.preco = outra.getPreco();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.titulo);
        hash = 29 * hash + Objects.hashCode(this.artista);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.duracao) ^ (Double.doubleToLongBits(this.duracao) >>> 32));
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Musica other = (Musica) obj;
        if (Double.doubleToLongBits(this.duracao) != Double.doubleToLongBits(other.duracao)) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.artista, other.artista);
    }
    
    
   
    public void imprimir (){
        System.out.println("Musica{ "+
                "Titulo:"+this.titulo+
                "  Artista(s):"+this.artista+
                "  Duraçao:"+this.duracao+"min"+
                "  Preço: R$"+this.preco+
                 "}");

    
    }
    public static void inserir (List<Musica>musica,Scanner ler){
        System.out.println(" Adicionando Musica");
        
        
       Musica m=new Musica();
        
        System.out.print(" Nome da Musica: ");
        m.titulo=ler.nextLine();
        System.out.print(" Nome dos Artista(s): ");
        m.artista=ler.nextLine();
        
        musica.add(m);
        System.out.println("Musica adicionada");
    }
    public   static void remover(List<Musica> musica, Scanner ler){
        
        System.out.println("Removendo");
        System.out.print("Nome da musica que deseja remover da lista: ");
        String titulo=ler.nextLine();
    
        
        for (int i=0 ;i < musica.size();i++){
            if (musica.get(i).getTitulo().equalsIgnoreCase(titulo)){
          
              musica.remove(i);
                System.out.println("Musica removida");
              
            }else{
                
            System.out.println("Musica não encontrada");
        }
      }
    }
  
    public static void pesquisar(List<Musica> musica, Scanner ler){

    System.out.print("Digite o titulo da musica: ");
    String titulo = ler.nextLine();

    for(Musica m : musica){

        if(m.getTitulo().equalsIgnoreCase(titulo)){

            System.out.println("Musica encontrada!");
            System.out.println(m.getTitulo() + " - " + m.getArtista());
            return;

        }

    }

    System.out.println("Musica nao encontrada.");
}
    public static void PlayList(List<Musica> musica){

    for(Musica m : musica){
        System.out.println(m.getTitulo() + " - " + m.getArtista());
    }

}

    
    public void tocarMusica(){
        
        System.out.println("A música "+ "("+this.titulo+")" + " está tocando.");
    }
    public void desligarMusica(){
        System.out.println("("+"A música " +this.titulo+ ")"+ " foi desligada.");
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
    public double getDuracao() {
        return duracao;
    }
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    

}