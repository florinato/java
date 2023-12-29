package com.example.s1_03.s1_03_n3;

public class Persona {
    private String nom;
    private String cognom;
    private String DNI;

    public Persona(String nom, String cognom, String DNI) {
        this.nom = nom;
        this.cognom = cognom;
        this.DNI = DNI;
    }

    // Getters y setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    // Representación en forma de cadena de la persona
    @Override
    public String toString() {
        return nom + " " + cognom + " " + DNI;
    }
}
