package com.example.s1_01.s1_01_n2;

class Telefon {
    String marca;
    String model;

    public Telefon(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public void trucar(String numero) {
        System.out.println("S'està trucant al número: " + numero);
    }
}

// Interfície Camera
interface Camera {
    void fotografiar();
}

// Interfície Rellotge
interface Rellotge {
    void alarma();
}

// Classe Smartphone que hereda de Telèfon e implementa Camera i Rellotge
class Smartphone extends Telefon implements Camera, Rellotge {
    public Smartphone(String marca, String model) {
        super(marca, model);
    }

    @Override
    public void fotografiar() {
        System.out.println("S'està fent una foto");
    }

    @Override
    public void alarma() {
        System.out.println("Està sonant l'alarma");
    }


// Main

    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S20");

        smartphone.trucar("123456789"); // Llamar al método trucar de Telèfon
        smartphone.fotografiar(); // Llamar al método fotografiar de Camera
        smartphone.alarma(); // Llamar al método alarma de Rellotge
    }
}


