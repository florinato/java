package com.example.s1_06;

// Clase Persona
public class Persona {
    private String nom;
    private String cognom;
    private int edat;

    public Persona(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    @Override
    public String toString() {
        return "Persona{" +
               "nom='" + nom + '\'' +
               ", cognom='" + cognom + '\'' +
               ", edat=" + edat +
               '}';
    }
}

// Clase GenericMethods con método genérico
class GenericMethods {
    public <T> void imprimir(T a, T b, T c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

// Clase principal para probar los métodos 


