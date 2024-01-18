package com.example.s1_01.s1_01_n1_1;

 public class InstrumentoCuerda extends Instrumento {
    InstrumentoCuerda(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}
