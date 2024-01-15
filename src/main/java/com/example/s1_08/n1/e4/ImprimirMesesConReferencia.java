package com.example.s1_08.n1.e4;

import java.util.List;

public class ImprimirMesesConReferencia {
    public static void main(String[] args) {
        List<String> meses = List.of("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                                     "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");

        meses.forEach(System.out::println);
    }
}
