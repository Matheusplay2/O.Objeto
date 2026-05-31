
package classes;

import java.util.List;
import java.util.ArrayList;

public class Departamento {
    private String nomeDepartamento;
    private Gerente gerenteDepartamento;
    private List<Funcionario> lstFuncionario;

    public Departamento(String nomeDepartamento) {
        this.gerenteDepartamento= new Gerente();
        this.nomeDepartamento="";
        this.lstFuncionario= new ArrayList<>();
        
    }

    public Departamento(String nomeDepartamento, Gerente gerenteDepartamento, List <Funcionario>lstFuncionario) {
        this.nomeDepartamento = nomeDepartamento;
        this.gerenteDepartamento = gerenteDepartamento;
        this.lstFuncionario = new ArrayList<>(lstFuncionario);
    }
    
    public Departamento(Departamento outro){
        
        this.nomeDepartamento=outro.getNomeDepartamento();
        this.gerenteDepartamento=new Gerente();
        this.lstFuncionario= new ArrayList<>();
        
        for(Funcionario f: outro.getLstFuncionario()){
            Funcionario novo =new Funcionario();
            novo.copiar(f);
            this.lstFuncionario.add(novo);
            
        }

    }
      public void definirGerente(Gerente g){
          this.gerenteDepartamento=g;
        }
        
    
    public  void addFuncionario(Funcionario f){
            this.lstFuncionario.add(f);
            System.out.println("Funcionario adicionado");
  
    }
      
    public boolean removerFuncionario(String nome, String identificacao){
        for( int i=0; i < lstFuncionario.size(); i++){
            if(lstFuncionario.get(i).getNome().equals(nome)){
                if(lstFuncionario.get(i).getIdentificacao().equals(identificacao)){
                    System.out.println("Funcionario Removido");
                    lstFuncionario.remove(i);
                    return true;
                }
            
            }
        }
            return false;
        
    }
   
    public Funcionario pesquisar(String nome, String identificacao){
        for(Funcionario f: this.lstFuncionario){
            if(f.getNome().equals(nome)){
                if(f.getIdentificacao().equals(identificacao)){
                    System.out.println("Funcionario Encontrado");
                    return f;
                }
            }
            
        }
        
        return null;
    }
    public void ListarFuncionarios(){
        for(Funcionario f: this.lstFuncionario){
            System.out.println(f.toString());;
        }
        
        
    }

    @Override
    public String toString() {
        return "Departamento{" + this.nomeDepartamento + 
                ", Gerente do departamento:" + this.gerenteDepartamento + 
                ", Lista de Funcionarios:" + this.lstFuncionario + '}';
    }
        

    public String getNomeDepartamento() {
        return nomeDepartamento;
    }

    public void setNomeDepartamento(String nomeDepartamento) {
        this.nomeDepartamento = nomeDepartamento;
    }

    public void setGerenteDepartamento(Gerente gerenteDepartamento) {
        this.gerenteDepartamento = gerenteDepartamento;
    }

    public Gerente getGerenteDepartamento() {
        return this.gerenteDepartamento;
    }

    public  List<Funcionario> getLstFuncionario() {
        return  this.lstFuncionario;
    }
    
 
    
}
