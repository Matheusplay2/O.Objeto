package gerenciador;

import classes.Pessoa;
import java.util.ArrayList;
import java.util.List;

public class GerenciadorPessoas {
    
    private List<Pessoa>lstPessoas;

    public GerenciadorPessoas() {
        this.lstPessoas= new ArrayList<>();
    }
    
    public void add(Pessoa pessoa){
        this.lstPessoas.add(pessoa);
        System.out.println("Pessoa adicionada");
    }
    
    
    public boolean remover(String cpf){
        for(Pessoa p: this.lstPessoas){
            if (p.getCpf().equals(cpf)){
                this.lstPessoas.remove(p);
                return true;
            } 
        }    
      return false;  
    }
    
    public Pessoa pesquisar(String cpf){
        for(Pessoa p: this.lstPessoas){
            if(p.getCpf().equals(cpf)){
              return p;  
            }
        }
        return null;
    }
    
    public boolean atualizar(String cpf,Pessoa novaPessoa){
    
    for(Pessoa p : this.lstPessoas){
        
        if(p.getCpf().equals(novaPessoa.getCpf())){
            
            p.setNome(novaPessoa.getNome());
            p.setCpf(novaPessoa.getCpf());
            
            return true;
        }
    }
    
    return false;
}
    
    
   public String Listar(){

    String resultado = "";

    for(Pessoa p : this.lstPessoas){

        resultado += p.toString() + "\n";
    }

    return resultado;

        
    }
}
