package com.example.s1_08.n3;



public class Alumne {
    private String nom;
    private int edat;
    private String curs;
    private double nota;

    public Alumne(String nom, int edat, String curs, double nota) {
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
        this.nota = nota;
    }

    // Getters
    public String getNom() { return nom; }
    public int getEdat() { return edat; }
    public String getCurs() { return curs; }
    public double getNota() { return nota; }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", curs='" + curs + '\'' +
                ", nota=" + nota +
                '}';
    }
}

