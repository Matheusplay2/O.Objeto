package classe;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorFilmes {
   
    List<Filme> cinema =new ArrayList<>();
    
    
    public void adicionar( Filme filmes){
        cinema.add(filmes);
        System.out.println("Filme adicionado com sucesso!!!");
       
     }
    public boolean remover(String titulo){
        
        for (int i=0;i < cinema.size();i++){
            if ( cinema.get(i).getTitulo().equalsIgnoreCase(titulo)){
                cinema.remove(i);
                System.out.println("Filme removido");
                return true;
            
               }
        }
            System.out.println("Filme não encontrado");
        return false;
 
        
    }
        public boolean pesquisar(String titulo,String diretor){
            
            for (int i=0;i < cinema.size();i++){
            if ( cinema.get(i).getTitulo().equalsIgnoreCase(titulo)){
               if (cinema.get(i).getDiretor().equalsIgnoreCase(diretor)){
                System.out.println("Filme Encontrado");
                   System.out.println("Titulo:"+cinema.get(i).getTitulo());
                   System.out.println("Diretor:"+cinema.get(i).getDiretor());
                   System.out.println("Duracao:"+ cinema.get(i).getDuracao());
                   System.out.println("Preco:"+cinema.get(i).getPreco());
                return true;
            
              }
            }
       }
           System.out.println("Filme não encontrado");
        return false;

        }
        public  void listar(){
           
            System.out.println(cinema.toString());
        
            
     }
}
