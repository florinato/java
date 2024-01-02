package com.example.s1_06;

public class MetodosMixtos {
    // El método ahora acepta dos argumentos genéricos (T) y un String
    public <T> void imprimir(T arg1, T arg2, String argFijo) {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(argFijo);
    }
}

// Clase principal para probar los métodos
class Main {
    public static void main(String[] args) {
        MetodosMixtos mm = new MetodosMixtos();

        // Crear un objeto Persona
        Persona persona = new Persona("Laura", "Gomez", 25);

        // Llamada al método modificado con diferentes tipos de parámetros
        mm.imprimir(persona, 123, "Un String fijo");

        GenericMethods gm = new GenericMethods();

        // Crear un objeto Persona
        Persona persona1 = new Persona("Juan", "Pérez", 30);

        // Llamada al método genérico con diferentes tipos de parámetros
        gm.imprimir(persona1, "Hola mundo", 123);
    }
}