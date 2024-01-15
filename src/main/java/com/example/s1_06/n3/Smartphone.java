package com.example.s1_06.n3;

class Smartphone implements Telefon {
    @Override
    public void trucar() {
        System.out.println("Trucant des de Smartphone...");
    }

    public void ferFotos() {
        System.out.println("Fent fotos amb el Smartphone...");
    }
}