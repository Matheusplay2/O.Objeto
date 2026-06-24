
package com.mycompany.ex06_53.Xadrez;

import com.mycompany.ex06_53.Interface.Piece;
import java.util.ArrayList;
import java.util.List;


public class ChessGame {
    
     private List<Piece> pecas = new ArrayList<>();

    public void adicionarPeca(Piece peca) {
        pecas.add(peca);
    }

    public void moverTodasAsPecas() {
        for (Piece peca : pecas) {
            peca.move(); 
        }
    }
    
}
