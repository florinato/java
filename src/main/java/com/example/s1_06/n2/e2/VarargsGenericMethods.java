package com.example.s1_06.n2.e2;

public class VarargsGenericMethods {

    @SafeVarargs // Suprime la advertencia de seguridad de tipo para varargs genéricos
    public final <T> void imprimir(T... args) {
        for (T arg : args) {
            System.out.println(arg);
        }
    }
}

