package com.hedima.modelo;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto{
    private LocalDate fCaducidad;

    @Override
    public String toString() {
        return super.toString() + " Fecha Caducidad " + fCaducidad;
    }

    public ProductoPerecedero() {
    }

    public ProductoPerecedero(String nombre, int cantidad, double pvp, LocalDate fCaducidad) {
        super(nombre, cantidad, pvp);
        this.fCaducidad = fCaducidad;
    }

    public LocalDate getfCaducidad() {
        return fCaducidad;
    }

    public void setfCaducidad(LocalDate fCaducidad) {
        this.fCaducidad = fCaducidad;
    }

}
