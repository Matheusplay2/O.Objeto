
package com.mycompany.timetecnico;
import classes.Tecnico;
import classes.Time;

public class TimeTecnico {

    public static void main(String[] args) {
        System.out.println("   /  Times Antes   /");
        Tecnico t1=new Tecnico(" Matheus ", "Brasileiro",2005);
        Tecnico t2= new Tecnico("Caike ", " Portugues", 2004);
        
        
        Time T1=new Time(" Casados ", " Muriae ", " 20/12/2056" ,t1);
        Time T2=new Time(" Solteiros" , " Juiz de Fora", " 10/12/2000", t2);
        
        System.out.println(T1);
        System.out.println(T2);
        Tecnico t3=new Tecnico( " Joao", "Italiano", 2000);
        T2.escalarTecnico(t3);
        System.out.println("   / Times Depois te ter trocado tecnico/");
        System.out.println(T1);
        System.out.println(T2);
    }
}
