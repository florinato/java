package com.example.s1_07.n1;

public class TreballadorPresencial extends Treballador {
    private static final double BENZINA = 100; // Por ejemplo

    public TreballadorPresencial(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }
    @Deprecated
    public void metodoAntiguoPresencial() {
        System.out.println("Este es un método antiguo y obsoleto para TreballadorPresencial.");
    }
    @Override
    public double calcularSou(int horesTreballades) {
        return super.calcularSou(horesTreballades) + BENZINA;
    }
}

