
package com.mycompany.ex06_53.subClasses;

import com.mycompany.ex06_53.Interface.Piece;


public class Torre extends Piece {

    public Torre(String cor) {
        super(cor);
    }

    @Override
    public void move() {
        System.out.println("Torre (" + getCor() + "): move em linha reta, "
                + "qualquer número de casas na horizontal ou vertical.");
    }
    
}
