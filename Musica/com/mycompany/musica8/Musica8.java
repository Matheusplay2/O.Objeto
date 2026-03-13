

package com.mycompany.musica8;
import classe.Musica;
public class Musica8 {

    public static void main(String[] args) {
        Musica m1;
        Musica m2;
        m1= new Musica ();
        m2=new Musica();
        m1.preencher();
        System.out.println("");
        m1.imprimir();
        m1.tocarMusica();
        m2.copiar(m1);
        m2.imprimir();
        m2.desligarMusica();
    }
}
