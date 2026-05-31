
package classes;

import java.util.Objects;

public class Estudante {
    private String nome;
    private String matricula;
    private String email;
    private String curso;
    private GerenciadorTel tel;

    public Estudante() {
        this.nome="";
        this.matricula="";
        this.email="";
        this.curso="";
        this.tel= new GerenciadorTel();
        
    }
  
    
    public Estudante ( String nome, String matricula, String email, String curso){
        this.nome=nome;
        this.matricula=matricula;
        this.email=email;
        this.curso=curso;
        this.tel=new GerenciadorTel();
        
        
    }
    public Estudante (Estudante outro){
        this.nome=outro.getNome();
        this.matricula=outro.getMatricula();
        this.email=outro.getEmail();
        this.curso=outro.getCurso();
        this.tel=new GerenciadorTel(outro.geTel());
        
        
    }
    
    public void copiar(Estudante outro){
        this.nome=outro.getNome();
        this.matricula=outro.getMatricula();
        this.email=outro.getEmail();
        this.curso=outro.getCurso();
        
        this.tel=new GerenciadorTel();
        for (Telefone  t: outro.geTel().lstTel){
            Telefone novo =new Telefone();
            novo.copiar(t);
            this.tel.lstTel.add(novo);
        }
        
    }
    public void imprimirEst(){
        System.out.println(this);
    }
    @Override
    public String toString(){
        
       return "Estudante{Nome:"+this.nome+ ",Matricula:"+this.matricula+
               ",Email:"+ this.email+ " Curso:"+this.curso+"}";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nome);
        hash = 37 * hash + Objects.hashCode(this.matricula);
        hash = 37 * hash + Objects.hashCode(this.email);
        hash = 37 * hash + Objects.hashCode(this.curso);
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
        final Estudante other = (Estudante) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return Objects.equals(this.curso, other.curso);
    }
    
    
    
    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getMatricula(){
       return this.matricula; 
    }
    public void setMatricula(String matricula){
       this.matricula=matricula; 
    }
    public String getEmail(){
       return this.email; 
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getCurso(){
        return this.curso;
    }
    public void setCurso(String curso){
        this.curso=curso;
    }
    public GerenciadorTel geTel(){
        return this.tel;
    }
}
