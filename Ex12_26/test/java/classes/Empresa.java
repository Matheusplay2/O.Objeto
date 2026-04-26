
package classes;

import gerenciadores.GerenciadorFuncionario;
import gerenciadores.GerenciadorProjetos;


public class Empresa {
    private String nomeEmpresa;
    private GerenciadorFuncionario  funcionario ;
    private GerenciadorProjetos projeto;

    public Empresa() {
        this.nomeEmpresa="";
        this.funcionario= new GerenciadorFuncionario();
        this.projeto=new GerenciadorProjetos();
    }

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.funcionario = new  GerenciadorFuncionario();
        this.projeto =  new GerenciadorProjetos();
    }

    @Override
    public String toString() {
        return "Empresa{" + "Nome da Empresa=" + this.nomeEmpresa +  "}";
    }
    
public Funcionario funcionarioMaisProdutivo(){

    Funcionario maisProdutivo =
            funcionario.getLstFuncionario().get(0);

    for(Funcionario f : funcionario.getLstFuncionario()){

        if(f.getProjetos().getLstProjeto().size() >
           maisProdutivo.getProjetos().getLstProjeto().size()){

            maisProdutivo = f;
        }
    }

    return maisProdutivo;
}
    

public Funcionario funcionarioMenosProdutivo(){

    Funcionario menosProdutivo =
            funcionario.getLstFuncionario().get(0);

    for(Funcionario f : funcionario.getLstFuncionario()){

        if(f.getProjetos().getLstProjeto().size() <
           menosProdutivo.getProjetos().getLstProjeto().size()){

            menosProdutivo = f;
        }
    }

    return menosProdutivo;
}
    public void addFuncionarioNaEmpresa(Funcionario f){
    this.funcionario.add(f);
   }

 public void addProjetoNaEmpresa(Projeto p){
    this.projeto.add(p);
   }
    
 public void ListarFuncionario(){
    this.funcionario.Listar();
}
 
 
 public void ListarProjeto(){
    this.projeto.ListarProjetos();
}
 
    public String getNomeEmpresa(){
      return this.nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa){
       this.nomeEmpresa=nomeEmpresa; 
    }
    
    public  GerenciadorProjetos getProjeto(){
        return this.projeto;
    }
    public GerenciadorFuncionario  getFuncionario(){
        return this.funcionario;
    }
    
}
