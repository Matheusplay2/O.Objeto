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
                if(musicas_i.getTitulo().equalsIgnoreCase(titulo)){
                    musicas.remove(i);
                    System.out.println("Musica removida");
                    return true;  
               }
            
            }
        }
        System.out.println("Musica nao encontrada");
           return false;
          
    }
     public Musica pesquisarMusica(String titulo,String artista){
        
        for(int i=0; i <musicas.size();i++){
            Musica musicas_i=musicas.get(i);
            if (musicas_i.getArtista().equalsIgnoreCase(artista)){
                if(musicas_i.getTitulo().equalsIgnoreCase(titulo)){
                    System.out.println("Musica encontrada");
                    System.out.println(musicas_i);
                    return musicas_i; 
               }
            
            }
        }
         System.out.println("Musica nao encontrada");
        return null;
        
     }
   public void ListarMusica(){
       for(int i=0;i < musicas.size();i++){
           System.out.println(musicas.get(i));
           
       }
       
       
   }
 
    
}
