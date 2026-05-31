package classe;

import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.titulo);
        hash = 89 * hash + Objects.hashCode(this.diretor);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.duracao) ^ (Double.doubleToLongBits(this.duracao) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.preco) ^ (Double.doubleToLongBits(this.preco) >>> 32));
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
        final Filme other = (Filme) obj;
        if (Double.doubleToLongBits(this.duracao) != Double.doubleToLongBits(other.duracao)) {
            return false;
        }
        if (Double.doubleToLongBits(this.preco) != Double.doubleToLongBits(other.preco)) {
            return false;
        }
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return Objects.equals(this.diretor, other.diretor);
    }

    @Override
    public String toString() {
        return "Filme{" + "titulo=" + titulo + ", diretor=" + diretor + ", duracao=" + duracao + ", preco=" + preco +"}";
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