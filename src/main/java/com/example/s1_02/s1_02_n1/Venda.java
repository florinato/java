package com.example.s1_02.s1_02_n1;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<Producte> productes;
    private double preuTotal;

    public Venda() {
        productes = new ArrayList<>();
    }

    public void afegirProducte(Producte producte) {
        productes.add(producte);
    }

    public void calcularTotal() throws VendaBuidaException {
        if (productes.isEmpty()) {
            throw new VendaBuidaException("Per fer una venda primer has d’afegir productes");
        }
        preuTotal = 0;
        for (Producte producte : productes) {
            preuTotal += producte.getPreu();
        }
    }

    // Getters y setters
    public List<Producte> getProductes() {
        return productes;
    }

    public double getPreuTotal() {
        return preuTotal;
    }
}
