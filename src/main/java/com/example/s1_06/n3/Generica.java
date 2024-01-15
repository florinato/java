package com.example.s1_06.n3;

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