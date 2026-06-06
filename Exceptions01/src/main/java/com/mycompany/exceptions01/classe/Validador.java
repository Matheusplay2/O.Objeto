
package com.mycompany.exceptions01.classe;


public class Validador {
     
    public static void validarIdade(int idade) {
        if (idade < 0 || idade > 50) {
            throw new IllegalArgumentException("Idade inválida!");
        }
    }

}
