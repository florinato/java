package com.example.s1_06.n1.e2;

public class GenericMethods {
    // Método genérico que acepta tres argumentos de diferentes tipos
    public <T, U, V> void imprimir(T arg1, U arg2, V arg3) {
        System.out.println(arg1);
        System.out.println(arg2);
        System.out.println(arg3);
    }
}
