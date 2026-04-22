
package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Funcionario {
    private String nome;
    private String identificacao;
    private List <Projeto> lstProjetos;

    public Funcionario() {
        this.nome="";
        this.identificacao="";
        this.lstProjetos= new ArrayList<>();
    }

    public Funcionario(String nome, String identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.lstProjetos = new ArrayList<>();
    }
    
    public  void copiar( Funcionario outro){
        this.nome=outro.getNome();
        this.identificacao=outro.getIdentificacao();
        this.lstProjetos= new ArrayList<>();
        
        
        for(Projeto p:outro.getLstProjetos()){
            Projeto novo= new Projeto();
            novo.copiar(p);
            this.lstProjetos.add(novo);
        }
    }
    @Override 
    public String toString(){
        
        return " Funcionario{Nome:"+ this.nome+
                " Identificacao:"+this.identificacao+"}";               
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.identificacao);
        hash = 89 * hash + Objects.hashCode(this.lstProjetos);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Funcionario other = (Funcionario) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.identificacao, other.identificacao)) {
            return false;
        }
        return Objects.equals(this.lstProjetos, other.lstProjetos);
    }
    
    
    
    public void addProjeto(Projeto p){
        this.lstProjetos.add(p);
        System.out.println("Projeto adicionado ao funcionario");
        
    }
    public boolean removerProjeto(String nomeProjeto){
       for(Projeto p : this.lstProjetos){ 
           if(p.getNomeProjeto().equals(nomeProjeto)){
               System.out.println("Projeto retirado do funcionario");
               this.lstProjetos.remove(p);
           }
       }
        
       return false; 
        
    }
    
    public String getNome() {
        return this.nome;
    }

    public String getIdentificacao() {
        return this.identificacao;
    }

    public List<Projeto> getLstProjetos() {
        return this.lstProjetos;
    }
    

}
