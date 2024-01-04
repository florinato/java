package com.example.s1_07.n1;

public abstract class Treballador {
    private String nom;
    private String cognom;
    private double preuHora;

    public Treballador(String nom, String cognom, double preuHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuHora = preuHora;
    }

    public double calcularSou(int horesTreballades) {
        return horesTreballades * preuHora;
    }

    
}

