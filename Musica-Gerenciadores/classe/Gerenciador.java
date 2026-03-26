package classe;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {

    List<Musica> musicas;

    public Gerenciador() {
        this.musicas = new ArrayList<>();
    }
    
    public void adicionarMusica(Musica novaMusicas){
        
        musicas.add(novaMusicas);
        System.out.println("Musica adicionada com Sucesso");
       
    }
    public boolean removerMusica(String titulo,String artista){
        
        for(int i=0; i <musicas.size();i++){
            Musica musicas_i=musicas.get(i);
            if (musicas_i.getArtista().equalsIgnoreCase(artista)){
                if(musicas_i.getTitulo().equalsIgnoreCase(artista)){
                    musicas.remove(i);
                    return true;  
               }
            
            }
        }
           return false;
 
    }
     public Musica pesquisarMusica(String titulo,String artista){
        
        for(int i=0; i <musicas.size();i++){
            Musica musicas_i=musicas.get(i);
            if (musicas_i.getArtista().equalsIgnoreCase(artista)){
                if(musicas_i.getTitulo().equalsIgnoreCase(artista)){
                    return musicas_i;  
               }
            
            }
        }
        return null;
        
     }
   public void ListarMusica(){
       for(int i=0;i < musicas.size();i++){
           System.out.println(musicas.get(i));
           
       }
       
       
   }
 
    
}