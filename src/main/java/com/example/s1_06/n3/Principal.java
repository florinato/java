package com.example.s1_06.n3;

class Principal {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        Generica generica = new Generica();
        TelefonBasic telefon=new TelefonBasic();
        telefon.trucar();
        smartphone.trucar();
        smartphone.ferFotos();
        generica.genericMethod1(smartphone);
        generica.genericMethod1(telefon);
        generica.genericMethod2(smartphone);
    }
}
