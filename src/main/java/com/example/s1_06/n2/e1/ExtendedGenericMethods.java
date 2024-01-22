package com.example.s1_06.n2.e1;
import com.example.s1_06.n1.e2.GenericMethods;

class ExtendedGenericMethods extends GenericMethods {
    // Método sobrecargado con un parámetro no genérico
    public <T, U> void imprimir(T arg1, String arg2Fijo, U arg3) {
        System.out.println("Valores con argumento no genérico:");
        System.out.println(arg1);
        System.out.println(arg2Fijo);
        System.out.println(arg3);
        System.out.println("Fin de la impresión con argumento no genérico.");
    }
}

