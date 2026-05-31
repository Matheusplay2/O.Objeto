
package classes;

import java.util.ArrayList;
import java.util.List;


public class GerenciadorAlbum {
    
    private List <Album> lstAlbum;

    public GerenciadorAlbum() {
        this.lstAlbum=new ArrayList<>();
        
    }
    public GerenciadorAlbum(GerenciadorAlbum outro){
        this.lstAlbum=new ArrayList<>();
        for(Album a: outro.lstAlbum){
            Album novo= new Album();
            novo.copiar(a);
            this.lstAlbum.add(novo);
        }
        
    }
    
    public void add(Album a){
        Album novo=new Album(a);
       lstAlbum.add(novo);
        System.out.println("  Album adicionado");    
    }
    
    public boolean remover(String nome){
        for( int i=0; i < lstAlbum.size(); i++){
            if (lstAlbum.get(i).getNome().equals(nome)){
                this.lstAlbum.remove(i);
                System.out.println("Removido");
                return true;
              
            }
        }
        System.out.println("Nao encontrado");
        return false;
        
    }
    public Album pesquisar(String nome , int lancamento){
        for(Album a: this.lstAlbum){
          if(a.getNome().equals(nome)) { 
              if(a.getLancamento()== lancamento){
                  System.out.println("Encontrado");
                  return a;
                  
              }
          }
            
        }
        System.out.println("Nao encontrado");
      return null;  
    }
    public void listar(){
        
        for (Album a: this.lstAlbum){
            System.out.println(a.toString());
        }
        
    }

    public List<Album> getLstAlbum() {
        return this.lstAlbum;
    }
    
}
