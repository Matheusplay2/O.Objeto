/*Um professor recebeu uma lista de presença com nomes digitados manualmente: `"Ana", "Bruno", "Ana", "Carlos", "Bruno", "Diana"`
. Use um `HashSet` para montar a lista oficial sem repetições. Exiba quantos alunos únicos há e verifique se "Carlos" está presente.

Dica: basta adicionar todos ao `Set` — ele descarta duplicatas automaticamente. Use `contains()` para verificar presença.*/

package com.mycompany.chamada;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author matheus henrique
 */
public class Chamada {

    public static void main(String[] args) {
        Set <String>nomes=new HashSet<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruno");
        nomes.add("Diana");
        
        System.out.println("Alunos na chamada:"+nomes.size());
        System.out.println("Carlos está presente:"+ nomes.contains("Carlos"));
        
    }
}
