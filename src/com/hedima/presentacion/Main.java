package com.hedima.presentacion;

import com.hedima.modelo.Empleado;
import com.hedima.modelo.Gerente;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Juan",3_000, LocalDate.of(1992,8,30));
        System.out.println(e1.mostrarInfo());
        Gerente g1 = new Gerente();
        g1.setNombre("Luis Rodriguez");
        g1.setSueldo(5_000);
        g1.setfNacimiento(LocalDate.of(1972,9,1));
        g1.setDepartamento("Ventas");
        System.out.println(g1.mostrarInfo());

    }
}