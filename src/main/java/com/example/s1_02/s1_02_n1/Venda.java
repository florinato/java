package com.example.s1_02.s1_02_n1;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Producte> productes;
    private double preuTotal;

    public Venda() {
        this.productes = new ArrayList<>();
        this.preuTotal = 0.0;
    }

    public void afegirProducte(Producte producte) {
        productes.add(producte);
    }

    public void calcularTotal() throws VendaBuidaException {
        if (productes.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }
        preuTotal = 0.0;
        for (Producte producte : productes) {
            preuTotal += producte.getPreu();
        }
    }

    // Getters y setters
    public double getPreuTotal() {
        return preuTotal;
    }
}

