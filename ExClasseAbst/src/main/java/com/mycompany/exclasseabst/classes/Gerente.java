
package com.mycompany.exclasseabst.classes;

import com.mycompany.exclasseabst.abstracts.Funcionario;


public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return salario * 0.20;
    }


}
