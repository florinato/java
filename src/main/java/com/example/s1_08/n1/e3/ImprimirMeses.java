package com.example.s1_08.n1.e3;

import java.util.List;

public class ImprimirMeses {
    public static void main(String[] args) {
        List<String> meses = List.of("Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", 
                                     "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");

        meses.forEach(mes -> System.out.println(mes));
    }
}

