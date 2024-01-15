package com.example.s1_06.n1.e2;
public class Main {
    
    public static void main(String[] args) {
        // Crear un objeto de GenericMethods
        GenericMethods gm = new GenericMethods();

        // Crear un objeto Persona
        Persona persona = new Persona("Laura", "Gomez", 25);

        gm.imprimir(persona, "Hola mundo", 123);
        gm.imprimir(456, persona, "Otro mensaje");
        gm.imprimir("Texto ejemplo", 789, persona);

        gm.imprimir(3.14, false, "Diferentes tipos");
    }
}


