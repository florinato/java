package com.example.s1_01.s1_01_n2;

public class Telefon {
    public String marca;
    public String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void trucar(String numero) {
        System.out.println("S'està trucant al número: " + numero);
    }
    
}


