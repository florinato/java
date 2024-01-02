package com.example.s1_06;

// Interfaz Telefon
interface Telefon {
    void trucar();
}

// Clase Smartphone que implementa Telefon
class Smartphone implements Telefon {
    public void trucar() {
        System.out.println("Trucant desde smarphone...");
    }

    public void ferFotos() {
        System.out.println("Fent fotos...");
    }
}
// Clase TelefonoNormal que implementa Telefon
class TelefonoNormal implements Telefon {
    public void trucar() {
        System.out.println("Trucant desde un telefon normal...");
    }
}
// Clase Generica con métodos genéricos
class Generica {
    public <T extends Telefon> void metodoTelefon(T dispositivo) {
        dispositivo.trucar();
    }

    public void metodoSmartphone(Smartphone smartphone) {
        smartphone.trucar();
        smartphone.ferFotos();
    }
}

// Clase Principal con el método main
public class Principal {
    public static void main(String[] args) {
        Smartphone miSmartphone = new Smartphone();
        TelefonoNormal telefonoNormal = new TelefonoNormal();
        Generica generica = new Generica();
        generica.metodoTelefon(telefonoNormal);
        generica.metodoTelefon(miSmartphone);
        generica.metodoSmartphone(miSmartphone);
    }
}

