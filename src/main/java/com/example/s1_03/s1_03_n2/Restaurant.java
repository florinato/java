package com.example.s1_03.s1_03_n2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String nom;
    private int puntuacio;

    public Restaurant(String nom, int puntuacio) {
        this.nom = nom;
        this.puntuacio = puntuacio;
    }
    public int compareTo(Restaurant other) {
        int nomComparison = this.nom.compareTo(other.nom);
        if (nomComparison != 0) {
            return nomComparison;
        }
        return Integer.compare(this.puntuacio, other.puntuacio);
    }
    
    
    
    // Getters y setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPuntuacio() {
        return puntuacio;
    }

    public void setPuntuacio(int puntuacio) {
        this.puntuacio = puntuacio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return puntuacio == that.puntuacio &&
               Objects.equals(nom, that.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, puntuacio);
    }


    
}

