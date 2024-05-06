package com.example.s1_01.s1_01_n1_2;

public class Main {
    public static void main(String[] args) {
        // Creación de una instancia de Cotxe
        Cotxe coche = new Cotxe("Corolla", 150);
        System.out.println(coche);

        // Invocación del método estático frenar() desde la clase
        Cotxe.frenar();

        // Invocación del método no estático accelerar() desde una instancia de la clase
        coche.accelerar();
    }
}
