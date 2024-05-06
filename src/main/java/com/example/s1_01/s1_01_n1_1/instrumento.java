package com.example.s1_01.s1_01_n1_1;

// Clase Instrumento (abstracta)
abstract class Instrumento {
    String nombre;
    double precio;

    public Instrumento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    abstract void tocar();

     
}
