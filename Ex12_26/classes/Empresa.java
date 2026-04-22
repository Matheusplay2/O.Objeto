
package classes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nomeEmpresa;
    private List<Funcionario> funcionario ;
    private  List<Projeto>projeto;

    public Empresa() {
        this.nomeEmpresa="";
        this.funcionario= new ArrayList<>();
        this.projeto=new ArrayList<>();
    }

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.funcionario = new  ArrayList<>();
        this.projeto =  new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Empresa{" + "Nome da Empresa=" + this.nomeEmpresa + '}';
    }
    
    
    public void addFuncionarioNaEmpresa(Funcionario f){
        this.funcionario.add(f);
        System.out.println("Funcionario adicionado a empresa");
    }
    
    public  boolean removerFuncioanrioDaEmpresa(String nome , String identificacao){
        
        for(Funcionario f: this.funcionario){
            if(f.getNome().equals(nome)&&
                    f.getIdentificacao().equals(identificacao)){
                System.out.println("Funcionario removido da empresa");
                this.funcionario.remove(f);
           }
        
        }
     return false;   
    }
    
    public void ListarFuncionario(){
        
        for(Funcionario f: this.funcionario){
           
            System.out.println(f.toString());
            
        }
    }
    public Funcionario funcionarioMaisProdutivo(){

    Funcionario maisProdutivo = funcionario.get(0);

    for(Funcionario f : funcionario){

        if(f.getLstProjetos().size() >
           maisProdutivo.getLstProjetos().size()){

            maisProdutivo = f;
        }
    }

    return maisProdutivo;

    }
    public Funcionario funcionarioMenosProdutivo(){

    Funcionario menosProdutivo = funcionario.get(0);

    for(Funcionario f : funcionario){

        if(f.getLstProjetos().size() <
           menosProdutivo.getLstProjetos().size()){

            menosProdutivo = f;
        }
    }

    return menosProdutivo;
}
    
    public void addProjetoNaEmpresa(Projeto p){
        this.projeto.add(p);
        System.out.println("Projeto adicionado a empresa");
    
    }
    
    public boolean removerProjetoDaEmpresa(int cod){
        for(Projeto p: this.projeto){
            if(p.getCod()== cod){
                System.out.println("Projeto removido da empresa");
                this.projeto.remove(p);
                return true;
            }
        }
        return false;
    }
    
    public void ListarProjeto(){
               for(Projeto p:this.projeto){
            
            System.out.println(p.toString());
            
            
        }        
    }
    
    public String getNomeEmpresa(){
      return this.nomeEmpresa;
    }
    public void setNomeEmpresa(String nomeEmpresa){
       this.nomeEmpresa=nomeEmpresa; 
    }
    
    public List<Projeto> getProjeto(){
        return this.projeto;
    }
    public List<Funcionario> getFuncionario(){
        return this.funcionario;
    }
    
}
