package com.example.s1_06.n2.e2;

import com.example.s1_06.n1.e2.Persona;

public class Main {
    public static void main(String[] args) {
        VarargsGenericMethods vgm = new VarargsGenericMethods();

        // Crear un objeto Persona
        Persona persona = new Persona("Laura", "Gomez", 25);

        // Llamada al método con varargs
        vgm.imprimir(persona, "Mensaje", 123);
        vgm.imprimir("Texto", 789, persona, "Otro texto", 456);
        
    }
}

