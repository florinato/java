package com.example.s1_06;

public interface Telefon {
    void trucar();
}
class Smartphone implements Telefon {
    @Override
    public void trucar() {
        System.out.println("Trucant des de Smartphone...");
    }

    public void ferFotos() {
        System.out.println("Fent fotos amb el Smartphone...");
    }
}
class Generica {
    public <T extends Telefon> void genericMethod1(T t) {
        t.trucar();
        // No es posible llamar a ferFotos() aquí porque T está limitado por Telefon
    }

    public <T extends Smartphone> void genericMethod2(T t) {
        t.trucar();
        t.ferFotos(); // Aquí sí es posible llamar a ferFotos()
    }
}
class TelefonBasic implements Telefon {
    @Override
    public void trucar() {
        System.out.println("Trucant des de Telefon Bàsic...");
    }
}
class Principal {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Generica generica = new Generica();
        TelefonBasic telefon=new TelefonBasic();
        generica.genericMethod1(telefon);
        generica.genericMethod1(smartphone);
        generica.genericMethod2(smartphone);
    }
}