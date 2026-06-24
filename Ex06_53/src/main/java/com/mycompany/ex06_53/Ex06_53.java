
package com.mycompany.ex06_53;

import com.mycompany.ex06_53.Xadrez.ChessGame;
import com.mycompany.ex06_53.subClasses.Bispo;
import com.mycompany.ex06_53.subClasses.Peao;
import com.mycompany.ex06_53.subClasses.Torre;

/*@author matheus henrique*/

public class Ex06_53 {

    public static void main(String[] args) {
       
        
        ChessGame tabuleiro = new ChessGame ();
        
        tabuleiro.adicionarPeca(new Peao("Branco"));
        tabuleiro.adicionarPeca(new Torre("Preto"));
        tabuleiro.adicionarPeca(new Bispo("Branco"));

        tabuleiro.moverTodasAsPecas();
    }
}
