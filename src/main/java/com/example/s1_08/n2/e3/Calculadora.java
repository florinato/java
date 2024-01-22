package com.example.s1_08.n2.e3;

class Calculadora {
    public static void main(String[] args) {
        Operacion suma = (a, b) -> a + b;
        Operacion resta = (a, b) -> a - b;
        Operacion multiplicacion = (a, b) -> a * b;
        Operacion division = (a, b) -> b != 0 ? a / b : Float.NaN;

        // Ejemplos de uso
        System.out.println("Suma: " + suma.operacio(10, 5)); 
        System.out.println("Resta: " + resta.operacio(10, 5));
        System.out.println("Multiplicación: " + multiplicacion.operacio(10, 5)); 
        System.out.println("División: " + division.operacio(10, 5)); 
    }
}
