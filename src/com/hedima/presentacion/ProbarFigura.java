package com.hedima.presentacion;

import com.hedima.modelo.Cuadrado;
import com.hedima.modelo.Figura;
import com.hedima.modelo.Triangulo;

public class ProbarFigura {

    public static void main(String[] args) {
        Figura f1 = new Figura();
        f1.setY(7);
        f1.setX(8);
        System.out.println(f1.mostrarPosicion());
        System.out.println("Triangulo");
        Triangulo t1 = new Triangulo(3,3,5,4);
        System.out.println(t1.mostrarPosicion());
        System.out.println(t1.calcularArea());

        System.out.println("Cuadrado");
        Cuadrado c1 = new Cuadrado(9,2,5);
        System.out.println(c1.mostrarPosicion());
        System.out.println(c1.calcularArea());
    }
}
