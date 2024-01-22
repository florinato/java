package com.example.s1_05.n1.e5;

import java.io.IOException;

public class Main {
    
    public static void main(String[] args) {
        String nombreArchivo = "persona.ser";
    
        try {
            // Crear un objeto de Persona y serializarlo
            Persona persona = new Persona("Juan", 30);
            Serializador.serializar(persona, nombreArchivo);
    
            // Deserializar el objeto
            Persona personaDeserializada = (Persona) Serializador.deserializar(nombreArchivo);
            System.out.println("Objeto deserializado: " + personaDeserializada);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
