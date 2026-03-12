/*título - string; autor - string; número de páginas - int; preço - double;*/
package com.mycompany.exercicio4;
import java.util.Scanner;
public class Livro {
    private String titulo;
    private String autor;
    private int numPag;
    private double preco;

    public Livro() {
    }
    
    public Livro (String titulo, String autor, int numPag, double preco){
        this.autor="";
        this.titulo= "";
        this.numPag= 0;
        this.preco=0.0;
        
    }
    
    public  void copiar (Livro outro){
        this.autor= outro.getAutor();
        this.titulo=outro.getTitulo();
        this.numPag= outro.getNumPag();
        this.preco=outro.getPreco();
    }
    
    public void preencher(){
        Scanner ler= new Scanner ( System.in);
        System.out.println("    PREENCHENDO DADOS DO LIVRO"     );
        System.out.print( " Nome do Autor:");
        this.autor=ler.nextLine();
        System.out.print("Titulo do livro: " );
        this.titulo=ler.nextLine();
        System.out.print(" Quantidade  de paginas :");
        this.numPag=ler.nextInt();
        System.out.print( " Preço do livro:");
        this.preco=ler.nextDouble();
        
    }
    
    public void imprimir (){
        System.out.println("   DADOS DO LIVRO PREENCHIDO");
        System.out.println("Nome:"+this.autor);
        System.out.println("Titulo:"+this.titulo);
        System.out.println("Quantidade de Paginas:"+this.numPag);
        System.out.println("Preço:"+  "R$"+this.preco);
        
        
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
    
}
