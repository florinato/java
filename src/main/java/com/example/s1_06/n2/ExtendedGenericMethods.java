package com.example.s1_06.n2;
import com.example.s1_06.n1.e2.GenericMethods;

class ExtendedGenericMethods extends GenericMethods {
    // Sobrescritura del método genérico
    @Override
    public <T, U, V> void imprimir(T arg1, U arg2, V arg3) {
        System.out.println("Valores sobrescritos:");
        super.imprimir(arg1, arg2, arg3);
        System.out.println("Fin de la impresión sobrescrita.");
    }
}
