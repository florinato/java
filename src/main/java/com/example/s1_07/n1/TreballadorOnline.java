package com.example.s1_07.n1;

public class TreballadorOnline extends Treballador {
    private static final double TARIFA_INTERNET = 50; // Por ejemplo

    public TreballadorOnline(String nom, String cognom, double preuHora) {
        super(nom, cognom, preuHora);
    }
    @Deprecated
    public void metodoAntiguoOnline() {
        System.out.println("Este es un método antiguo y obsoleto para TreballadorOnline.");
    }
    @Override
    public double calcularSou(int horesTreballades) {
        return super.calcularSou(horesTreballades) + TARIFA_INTERNET;
    }
}

