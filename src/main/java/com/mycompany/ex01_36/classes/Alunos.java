
package com.mycompany.ex01_36.classes;

/*nome, sexo, idade, matrícula, e ano de ingresso.*/


public class Alunos {
    private String nome;
    private String sexo;
    private int iddAluno;
    private String matricula ;
    private int ano;

    public Alunos() {
        this.nome="";
        this.sexo="";
        this.iddAluno=0;
        this.matricula="";
        this.ano=0;
    }
    
    
    
    public Alunos(String nome, String sexo, int iddAluno,String matricula,int ano){
        this.nome=nome;
        this.sexo=sexo;
        this.iddAluno=iddAluno;
        this.matricula=matricula;
        this.ano=ano;
 }
    
    
    public void copiar(Alunos outro){
        this.nome=outro.getNome();
        this.sexo=outro.getSexo();       
        this.iddAluno=outro.getIddAluno();
        this.matricula=outro.getMatricula();
        this.ano=outro.getAno();
    }
    
    @Override 
    public String toString (){
        return "ALuno{Nome"+this.nome+
                ",Sexo:"+this.sexo+
                ",Idade:"+this.iddAluno+
                ",Matricula:"+this.matricula+
                ",Ano de Ingressao:"+this.ano+"}";
     }
    
    @Override 
    public int hashCode(){
        int hash=8;
        
        hash=33* hash +this.nome.hashCode();
        hash=33* hash +this.sexo.hashCode();
        hash=33* hash+ this.iddAluno;
        hash=33 * hash+ this.matricula.hashCode();
        hash=33 * hash+ this.ano;
        
        
        return hash;
  
 }
    
    @Override 
    public boolean equals (Object obj){
        if (obj == null)
            return false;
        
        Alunos outro=(Alunos)obj;
        return this.nome.equals(outro.getNome())&&
                this.sexo.equals(outro.getSexo())&&
                this.iddAluno== outro.getIddAluno()&&
                this.matricula.equals(outro.getMatricula())&&
                this.ano==outro.getAno();
         }

    
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    public int getIddAluno(){
       return this.iddAluno; 
    }
    public void setIddAluno(int iddAluno){
       this.iddAluno=iddAluno; 
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    public void setMatricula(String matricula){
        this.matricula= matricula;
    }
    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano=ano;
    }
}
