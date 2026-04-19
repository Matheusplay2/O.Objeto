
package classes;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorArtista {
    List <Artista> lstArtista;

    public GerenciadorArtista() {
        this.lstArtista= new  ArrayList<>();
    }
    
    public void adicionarArtista( Artista a){
        Artista novo= new Artista(a);
        lstArtista.add(novo);
        System.out.println("Artista adicionado");
    }
    
    public boolean remover(String nome){
        for(int i=0;i < lstArtista.size();i++)
        if (lstArtista.get(i).getNome().equals(nome)){
            this.lstArtista.remove(nome);
            System.out.println("Removido");
            
            return true; 
           }
        System.out.println(" Nao encontrado");
        return false;

    }
    
    public Artista pesquisar(String nome){
        for(Artista a : this.lstArtista){
           if (a.getNome().equals(nome)){
               System.out.println("Encontrado");
             return a;
           }
        }
        System.out.println("Nao encontrado");
        return null;
        
        
    }
    public void Listar(){
        for (Artista a: this.lstArtista){
            System.out.println(a.toString());
        }
    }
    public Artista artistaComMaisAlbuns(){

    if(lstArtista.isEmpty()){
        return null;
    }

    Artista maior = lstArtista.get(0);

    for(Artista a : lstArtista){
        if(a.getAlbuns().getLstAlbum().size() >
           maior.getAlbuns().getLstAlbum().size()){
            
            maior = a;
        }
    }

    return new Artista(maior);
  }
    
    public Album albumComMaisMusicas(){

    Album maior = null;

    for(Artista a : lstArtista){
        for(Album alb : a.getAlbuns().getLstAlbum()){
            
            if(maior == null ||
               alb.getMusicas().getLstMsc().size() >
               maior.getMusicas().getLstMsc().size()){
                
                maior = alb;
            }
        }
    }

    if(maior == null){
        return null;
    }

    return new Album(maior);
   }
}
