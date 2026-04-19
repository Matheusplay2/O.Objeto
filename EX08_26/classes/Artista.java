
package classes;

import java.util.Objects;


public class Artista {
    private String nome;
    
    private GerenciadorAlbum albuns ;

    public Artista() {
        this.nome="";
        this.albuns=new GerenciadorAlbum();
    }

    public Artista(String nome ,GerenciadorAlbum albuns) {
        this.nome = nome;
        this.albuns = new GerenciadorAlbum(albuns);
    }
   

   
    public Artista(Artista outro){
        this.nome=outro.getNome();
        this.albuns=new GerenciadorAlbum(outro.getAlbuns());
      
              
    }

    @Override
    public String toString() {
        return "Artista{" + "Nome:" + this.nome +"}";
    }
    
    public void copiar(Artista outro){
        this.nome=outro.getNome();  
        this.albuns=new GerenciadorAlbum();
            
           for (Album a: outro.getAlbuns().getLstAlbum()){
              Album novo= new Album ();
              novo.copiar(a);
              albuns.add(novo);
            
        }    
    }
    public void adicionarMusica(String nomeAlbum, Musica m){
    for(Album a : albuns.getLstAlbum()){
        if(a.getNome().equals(nomeAlbum)){
            a.adicionarMusica(m);
            return;
        }
    }
}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.albuns);
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
        final Artista other = (Artista) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.albuns, other.albuns);
    }
    
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public GerenciadorAlbum getAlbuns() {
        return this.albuns;
    }

}
