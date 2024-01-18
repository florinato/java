package com.example.s1_01.s1_01_n1_2;

public class Cotxe {
    // Atributos
    static final String marca = "Toyota"; // Constante de la clase
    static String model; // Atributo estático
    final int potencia; // Atributo final

    // Constructor
    private Cotxe(String model, int potencia) {
        Cotxe.model = model; // Asignación al atributo estático
        this.potencia = potencia; // Inicialización del atributo final
    }

    // Método estático para frenar
    private static void frenar() {
        System.out.println("El vehicle està frenant");
    }

    // Método no estático para acelerar
    private void accelerar() {
        System.out.println("El vehicle està accelerant");
    }

    // Método toString para mostrar las características del coche
    @Override
    public String toString() {
        return "Cotxe { Marca: " + marca + ", Model: " + model + ", Potència: " + potencia + " }";
    }

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


