package com.example.s1_06.n2;
import com.example.s1_06.n1.e2.Persona;
public class Main {
    public static void main(String[] args) {
        ExtendedGenericMethods egm = new ExtendedGenericMethods();

        // Crear un objeto Persona
        Persona persona = new Persona("Laura", "Gomez", 25);

        // Llamada al método modificado con un objeto Persona, un String y un entero
        egm.imprimir(persona, "Mensaje fijo", 123);

        // Llamada al método con un entero, un String fijo y un objeto Persona
        egm.imprimir(456, "Otro mensaje fijo", persona);

        
    }
}

