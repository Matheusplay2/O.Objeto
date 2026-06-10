
package com.mycompany.exclasseabst.abstracts;


public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    
    abstract public double getBonus();

    @Override
    public String toString() {
        return "\nNome: " + this.nome 
             + "\nSalario: " + this.salario 
             + "\nBonus: " + this.getBonus();
    }
    
}
