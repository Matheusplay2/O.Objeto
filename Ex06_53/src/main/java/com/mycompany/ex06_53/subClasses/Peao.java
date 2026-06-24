
package com.mycompany.ex06_53.subClasses;

import com.mycompany.ex06_53.Interface.Piece;


public class Peao extends Piece {

    public Peao(String cor) {
        super(cor);
    }

    @Override
    public void move() {
          System.out.println("Peão (" + getCor() + "): move 1 casa à frente. "
                + "No primeiro movimento, pode avançar 2 casas.");
    }
    
}
