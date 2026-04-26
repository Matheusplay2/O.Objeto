
package gerenciadores;

import classes.Funcionario;
import java.util.ArrayList;
import java.util.List;


 
public class GerenciadorFuncionario {
    
    private List<Funcionario> lstFuncionario;

    public GerenciadorFuncionario() {
        this.lstFuncionario= new ArrayList<>();
        
    }
    

    public void copiar (GerenciadorFuncionario outro){
        this.lstFuncionario= new ArrayList<>();
        for(Funcionario f: outro.lstFuncionario){
            Funcionario novo= new Funcionario();
            novo.copiar(f);
            lstFuncionario.add(novo);
            
        }
        
        
    }

    
    
    public void add(Funcionario funcionario){
        
        this.lstFuncionario.add(funcionario);
        System.out.println("Funcionario adicionado");
    }
    
    public boolean remover(String nome, String identificacao){
       for (Funcionario f: lstFuncionario){
         if(f.getNome().equals(nome)){
             if(f.getIdentificacao().equals(identificacao)){    
              lstFuncionario.remove(f);
                 System.out.println("Funcionario removido");
             return true;
             }
             
         }
           
       }
        
        return false;
    }
    
   public Funcionario pesquisar(String nome, String identificacao){
        for (Funcionario f: lstFuncionario){
         if(f.getNome().equals(nome)){
             if(f.getIdentificacao().equals(identificacao)){    
               return f;
             }
         }
        }
       return null;
   }
   
   public void Listar(){
       for(Funcionario f: lstFuncionario){
           System.out.println(f.toString());
       }
       
   }

    public  List<Funcionario> getLstFuncionario() {
        return lstFuncionario;
    }
   
}
