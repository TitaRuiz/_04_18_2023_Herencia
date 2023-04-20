package com.hedima.presentacion;



import com.hedima.modelo.Producto;
import com.hedima.modelo.ProductoPerecedero;

import java.time.LocalDate;

public class ProbarProductos {

    public static void main(String[] args) {
        Producto p1 = new Producto("Coca-Cola", 500,0.6);
        System.out.println(p1.toString());



        ProductoPerecedero p2 = new ProductoPerecedero("Leche",300,1.2, LocalDate.of(2023,12,20));
        System.out.println(p2.toString());
    }
}
