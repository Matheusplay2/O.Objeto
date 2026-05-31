package com.mycompany.ex01_36.classes;

/*Para cada disciplina, registre o nome, semestre, horário, 
o professor ministrante e uma lista dos alunos matriculados.*/
public class Disciplina {
    private String nome;
    private String cod;
    private String semestre;
    private String horario;
    private Professor professor;
    private Alunos alunos;
    
    
    
    public Disciplina(){
        this.nome="";
        this.semestre="";
        this.horario="";
        this.cod="";
        this.professor= new Professor();
        this.alunos=new Alunos();
        
    }
    
    public Disciplina (String nome, String semestre, String horario,String cod, Professor professor,Alunos alunos){
        this.nome=nome;
        this.horario=horario;
        this.semestre=semestre;
        this.cod=cod;
        this.professor= professor;
        this.alunos= alunos;
    }
    
    @Override 
    public String toString(){
        return "Disciplina{Nome:"+this.nome+
                ",Horario:"+this.horario+
                ",Semestre:"+ this.semestre+
                ",Codigo:"+ this.cod+
                this.professor+ this.alunos+"}";
    }
    
    @Override
    public int hashCode(){
        int hash=5;
        
        
        hash= 33* hash + this.nome.hashCode();
        hash=33 * hash+ this.horario.hashCode();
        hash= 33 * hash+ this.semestre.hashCode();
        hash=33 * hash+ this.cod.hashCode();
        hash= 33 * hash +this.professor.hashCode();
        hash=33 * hash+ this.alunos.hashCode();
                
        
        return hash;
        
    }
    
    public void copiar(Disciplina outro){
        this.nome=outro.getNome();
        this.horario=outro.getHorario();
        this.semestre=outro.getSemestre();
        this.cod=outro.getCod();
        this.alunos=outro.getAlunos();
        this.professor=outro.getProfessor();
        
    }
   
    @Override 
    public boolean equals(Object obj){
        if(obj == null)
        return false;
        Disciplina outro= (Disciplina)obj;
        return this.nome.equals(outro.getNome())&&
                this.horario.equals(outro.getHorario())&&
                this.semestre.equals(outro.getSemestre())&&
                this.cod.equals(outro.getCod())&&
                this.alunos.equals(outro.getAlunos())&&
                this.professor.equals(outro.getProfessor());
    }
    
    
    public String getNome(){
       return this.nome; 
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
    public  String getSemestre (){
       return this.semestre; 
    }
    public void setSemestre(String semestre){
        this.semestre=semestre;
    }
    public String getHorario(){
        return this.horario;
    }
    public void setHorario(String horario){
        this.horario=horario;
    }
    public String getCod(){
        return this.cod;
    }
     
    public void setCod(String cod){
        this.cod=cod;
    }
    public Professor getProfessor(){
       return this.professor;    
    }
    
    public void setProfessor(Professor professor){
        this.professor=professor;
    }
    public Alunos getAlunos(){
       return this.alunos; 
    }
    public void setAlunos(Alunos alunos){
        this.alunos=alunos;
    }
}
