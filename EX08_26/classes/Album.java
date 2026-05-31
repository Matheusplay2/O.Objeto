
package classes;

import java.util.Objects;


public class Album {
    private String nome;
    private int lancamento;
    private GerenciadorMusica musicas;

    public Album() {
        this.nome="";
        this.lancamento=0;
        this.musicas=new GerenciadorMusica();
    }
    

    public Album(String nome, int lancamento) {
        this.nome = nome;
        this.lancamento = lancamento;
        this.musicas= new GerenciadorMusica();
    }
    
    public void adicionarMusica(Musica m){
        this.musicas.add(m);
    }
    public Album (Album outro){
        this.nome=outro.getNome();
        this.lancamento=outro.getLancamento();
        this.musicas=new GerenciadorMusica(outro.getMusicas());
        
 
    }
    public void copiar( Album outro){
        this.nome=outro.getNome();
        this.lancamento=outro.getLancamento();
        this.musicas= new GerenciadorMusica();
        
        for(Musica m :outro.musicas.getLstMsc()){
            Musica nova= new Musica();
            nova.copiar(m);
            musicas.add(nova);
            
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nome);
        hash = 79 * hash + this.lancamento;
        hash = 79 * hash + Objects.hashCode(this.musicas);
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
        final Album other = (Album) obj;
        if (this.lancamento != other.lancamento) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.musicas, other.musicas);
    }
    
    @Override
    public String toString(){
        return " Nome:"+this.nome+ " Lancamento:"+this.lancamento+ " }";
        
    }
    

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLancamento() {
        return this.lancamento;
    }

    public void setLancamento(int lancamento) {
        this.lancamento = lancamento;
    }
    
   public GerenciadorMusica getMusicas(){
       return this.musicas;
       
   }
    public void setMusicas(GerenciadorMusica musicas) {
        this.musicas = musicas;
    }
      
    
}
