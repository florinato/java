package com.example.s1_05;

import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 1L; // Se recomienda para la serialización
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", edad=" + edad +
               '}';
    }

    // Getters y setters si son necesarios
}
