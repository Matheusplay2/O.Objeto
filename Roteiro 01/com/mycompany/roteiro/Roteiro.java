
package com.mycompany.roteiro;
import classes.Triangulo;
import classes.Quadrado;
import classes.Ponto;

public class Roteiro {

    public static void main(String[] args) {
        Ponto t1,t2,t3;
        t1= new Ponto();
        t2=new Ponto();
        t3= new Ponto();
        
       t1.setX(3);
       t1.setY(6);
       t2.setX(4);
       t2.setY(3);
       t3.setX(5);
       t3.setY(5);
       
       Triangulo T= new Triangulo(t1,t2,t3);
        System.out.println("======================================");
        System.out.println("       /    TRIANGULO    /" );
        System.out.println("Area do Triangulo:"+T.areaTriangulo());
        System.out.println("Perimetro:"+T.perimetro());
        System.out.println("E colinear:"+T.isColineares());
        System.out.println("Tipo:"+T.tipo());
        T.imprimir();
        System.out.println("=====================================");
        
        
        Ponto q1, q2,q3,q4;
        q1=new Ponto();
        q2=new Ponto();
        q3=new Ponto();
        q4=new Ponto();
        
        q1.setX(0);
        q1.setY(0);
        q2.setX(0);
        q2.setY(2);
        q3.setX(2);
        q3.setY(2);
        q4.setX(2);
        q4.setY(0);
        Quadrado Q= new Quadrado(q1,q2,q3,q4);
        System.out.println("======================");
        System.out.println("        Quadrado");
        System.out.println("Perimetro:"+ Q.perimetro());
        System.out.println("Area:"+Q.areaQuadrado());
        System.out.println("Tipo:"+Q.tipo());
        System.out.println("E quadrado:"+Q.isQuadrado());
        System.out.println(Q.toString());
        System.out.println("=======================");
    }
}
