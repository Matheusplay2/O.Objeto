
package com.mycompany.ex06_53.subClasses;

import com.mycompany.ex06_53.Interface.Piece;


public class Bispo extends Piece {

    public Bispo(String cor) {
        super(cor);
    }

    
  
    @Override
    public void move() {
        System.out.println("Bispo (" + getCor() + "): move na diagonal, "
                + "qualquer número de casas.");
    }
    
}
