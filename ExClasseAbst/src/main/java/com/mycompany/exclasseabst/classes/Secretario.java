
package com.mycompany.exclasseabst.classes;

import com.mycompany.exclasseabst.abstracts.Funcionario;


public class Secretario extends Funcionario {

    public Secretario(String nome, double salario) {
        super(nome, salario);
    }
     @Override
   public  double getBonus(){    
       return super.salario * 0.13;
    }
}
