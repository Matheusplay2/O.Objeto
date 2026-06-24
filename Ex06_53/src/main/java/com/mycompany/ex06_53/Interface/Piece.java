
package com.mycompany.ex06_53.Interface;

public abstract  class Piece {
    protected String cor;

    public Piece(String cor) {
        this.cor = cor;
    }
    
    public abstract void move();

    public String getCor() {
        return  this.cor;
    }
    
    
    
}
