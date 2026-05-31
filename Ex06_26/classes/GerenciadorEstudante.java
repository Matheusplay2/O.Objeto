
package classes;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorEstudante {
    List<Estudante> lstEstudante;

    public GerenciadorEstudante() {
        this.lstEstudante=new ArrayList<>();
    }

    public GerenciadorEstudante(GerenciadorEstudante outro) {
        this.lstEstudante =new ArrayList();
        for(Estudante e: outro.lstEstudante){
            Estudante novo=new Estudante();
            novo.copiar(e);
            this.lstEstudante.add(novo);
    
        }
    }
    
    public void addEstudante(Estudante e){
        this.lstEstudante.add(e);
        System.out.println("Aluno adicionado");
    }
    
    public boolean removerEstudante(String nome, String matricula ){
        for(int i=0; i< this.lstEstudante.size();i++){
            if (lstEstudante.get(i).getNome().equals(nome)){
                if(lstEstudante.get(i).getMatricula().equals(matricula)){
                    lstEstudante.remove(i);
                    System.out.println("Removido");
                    return true;
                }
                
            }
        }

        return false;
    }
    
    public Estudante pesquisar(String matricula){
        for(Estudante e:this.lstEstudante){
            if (e.getMatricula().equals(matricula)){
                System.out.println("Aluno encontrado");
                return e;
                
            }
            
        }
        
      return null;  
    }
    public void listarEstudante(){
        for(Estudante e: this.lstEstudante){
            
            System.out.println(e.toString());
        }
        
    }
    public List<Estudante> getLstEstudante(){
           return this.lstEstudante;   
    }
    
}
