package com.example.s1_05.n1.e5;

import java.io.*;

public class Serializador {

    // Serializa un objeto a un archivo .ser
    public static void serializar(Object objeto, String nombreArchivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
            out.writeObject(objeto);
            System.out.println("Objeto serializado a " + nombreArchivo);
        } catch (IOException e) {
            System.err.println("Error en serialización: " + e.getMessage());
        }
    }

    // Deserializa un objeto desde un archivo .ser
    public static Object deserializar(String nombreArchivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(nombreArchivo))) {
            System.out.println("Objeto deserializado desde " + nombreArchivo);
            return in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error en deserialización: " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        String nombreArchivo = "persona.ser";
    
        // Crear un objeto de Persona y serializarlo
        Persona persona = new Persona("Juan", 30);
        serializar(persona, nombreArchivo);
    
        // Deserializar el objeto
        Persona personaDeserializada = (Persona) deserializar(nombreArchivo);
        System.out.println("Objeto deserializado: " + personaDeserializada);
    }
      
    
}

class MiObjeto implements Serializable {
    // Atributos y métodos de tu objeto
}
