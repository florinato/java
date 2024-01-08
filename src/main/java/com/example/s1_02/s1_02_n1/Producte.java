package com.example.s1_02.s1_02_n1;

public class Producte {
    private String nom;
    private double preu;

    // Constructor, getters y setters
    public Producte(String nom, double preu) {
        this.nom = nom;
        this.preu = preu;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }
}
