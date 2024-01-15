package com.example.s1_08.n2.e1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltroNombres {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Ana", "Alberto", "Ava", "Arturo", "Ara", "Alejandro");

        List<String> resultado = nombres.stream()
                                        .filter(nombre -> nombre.startsWith("A") && nombre.length() == 3)
                                        .collect(Collectors.toList());

        System.out.println(resultado);
    }
}

