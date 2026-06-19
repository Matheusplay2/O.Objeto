
package com.mycompany.exclasseabst;

import com.mycompany.exclasseabst.abstracts.Funcionario;
import com.mycompany.exclasseabst.classes.Gerente;

/**
 *
 * @author matheus henrique
 */
public class ExClasseAbst {

    public static void main(String[] args) {
        Funcionario   g = new Gerente("Matheus",1000);
        System.out.println(g);
    }
}
