package com.mycompany.roteiro01;

import classes.Ponto;
import classes.Triangulo;
import classes.Quadrado;
import java.util.Scanner;

public class roteiro01 {

    public static void main(String[] args) {
        Scanner ler=new Scanner (System.in);
        Ponto t1,t2,t3;
        t1= new Ponto();
        t2=new Ponto();
        t3= new Ponto();
        
      
       Triangulo T= new Triangulo(t1,t2,t3);
       preencherTriangulo(ler, T);
       
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
        
       
        Quadrado Q= new Quadrado(q1,q2,q3,q4);
        preencherQuadrado(ler , Q);
        System.out.println("======================");
        System.out.println("        Quadrado");
        System.out.println("Perimetro:"+ Q.perimetro());
        System.out.println("Area:"+Q.areaQuadrado());
        System.out.println("Tipo:"+Q.tipo());
        System.out.println("E quadrado:"+Q.isQuadrado());
        System.out.println(Q.toString());
        System.out.println("=======================");
    }
    public  static void preencherTriangulo (Scanner ler ,Triangulo t){
       
        System.out.print("Digite  X do primeiro ponto do triangulo:");
        t.getP1().setX(ler.nextDouble());
         System.out.print("Y do primeiro ponto:");
        t.getP1().setY(ler.nextDouble());
        System.out.print(" X do segundo ponto:");
        t.getP2().setX(ler.nextDouble());
        System.out.print("Y do segundo ponto:");
        t.getP2().setY(ler.nextDouble());
        System.out.print("X do terceiro ponto:");
        t.getP3().setX(ler.nextDouble());
        System.out.print("Y do terceiro ponto:");
        t.getP3().setY(ler.nextDouble());
   
    }
    public static void preencherQuadrado(Scanner ler , Quadrado q){
        System.out.print("X do primeiro ponto do Quadrado:");
        q.getP1().setX(ler.nextDouble());
        System.out.print("Y do primeiro ponto:");
        q.getP1().setY(ler.nextDouble());
        System.out.print("X do segundo ponto:");
        q.getP2().setX(ler.nextDouble());
        System.out.print("Y do segundo ponto:");
        q.getP2().setY(ler.nextDouble());
        System.out.print("X do terceiro ponto:");
        q.getP3().setX(ler.nextDouble());
        System.out.print("Y do terceiro ponto:");
        q.getP3().setY(ler.nextDouble());
        System.out.print("X do quarto ponto:");
        q.getP4().setX(ler.nextDouble());
        System.out.print("Y do quarto ponto:");
        q.getP4().setY(ler.nextDouble());
    }
}