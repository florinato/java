package com.example.s1_01.s1_01_n1_1;

public class InstrumentoViento extends Instrumento {
    

    public InstrumentoViento(String nombre, double precio) {
        super(nombre, precio);
        
    }

    @Override
    void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}