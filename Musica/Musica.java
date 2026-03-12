package com.mycompany.exercicio8;
import java.util.Scanner;

public class Musica {
    private String titulo;
    private String artista;
    private double duracao;
    private double preco;
    
    
    public Musica(){
        this.titulo = "";
        this.artista = "";
        this.duracao = 0.0;
        this.preco = 0.0;
    }
    
    public void Copiar(Musica outra){
        this.titulo = outra.getTitulo();
        this.artista = outra.getArtista();
        this.duracao = outra.getDuracao();
        this.preco = outra.getPreco();
    }
    
    public void Preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("   ***  PREENCHENDO  ***");
        System.out.print("Informe o título:");
        this.titulo=ler.nextLine();
        
        System.out.print("Informe o artista:");
        this.artista=ler.nextLine();
        
        System.out.print("Informe a duração: ");
        this.duracao=ler.nextDouble();
        
        System.out.print("Informe o preço: ");
        this.preco=ler.nextDouble();    
    }
   
    public void imprimir (){
        System.out.println("Musica{ "+
                "Titulo:"+this.titulo+
                "  Artista(s):"+this.artista+
                "  Duraçao:"+this.duracao+"min"+
                "  Preço: R$"+this.preco+
                 "}");

    
    }
    public void tocarMusica(){
        System.out.println("A música "+ "("+this.titulo+")" + " está tocando.");
    }
    public void desligarMusica(){
        System.out.println("A música "+"(" +this.titulo+ ")"+ " foi desligada.");
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
