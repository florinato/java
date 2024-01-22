package com.example.s1_05.n1.e5;

import java.io.*;

public class Serializador {

    // Serializa un objeto a un archivo .ser
    public static void serializar(Object objeto, String nombreArchivo) throws IOException {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(objeto);
            System.out.println("Objeto serializado a " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error en serialización: " + e.getMessage());
            throw e;
        }
    }

    // Deserializa un objeto desde un archivo .ser
    public static Object deserializar(String nombreArchivo) throws IOException, ClassNotFoundException {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            System.out.println("Objeto deserializado desde " + nombreArchivo);
            return in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error en deserialización: " + e.getMessage());
            throw e;
        }
    }
    

    public static void main(String[] args) {
        String nombreArchivo = "persona.ser";
    
        try {
            // Crear un objeto de Persona y serializarlo
            Persona persona = new Persona("Juan", 30);
            serializar(persona, nombreArchivo);
    
            // Deserializar el objeto
            Persona personaDeserializada = (Persona) deserializar(nombreArchivo);
            System.out.println("Objeto deserializado: " + personaDeserializada);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    
    
}


