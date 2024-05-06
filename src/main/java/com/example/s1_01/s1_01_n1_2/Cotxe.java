package com.example.s1_01.s1_01_n1_2;

public class Cotxe {
    // Atributos
    private static final String marca = "Toyota"; // Constante de la clase
    private static String model; // Atributo estático
    private final int potencia; // Atributo final

    // Constructor
    public Cotxe(String model, int potencia) {
        Cotxe.model = model; // Asignación al atributo estático
        this.potencia = potencia; // Inicialización del atributo final
    }

    // Método estático para frenar
    public static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    // Método no estático para acelerar
    public void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

    // Método toString para mostrar las características del coche
    @Override
    public String toString() {
        return "Cotxe { Marca: " + marca + ", Model: " + model + ", Potència: " + potencia + " }";
    }

    
}


