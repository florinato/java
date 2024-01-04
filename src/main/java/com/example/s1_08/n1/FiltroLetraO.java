package com.example.s1_08.n1;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroLetraO {
    public static void main(String[] args) {
        List<String> miLista = List.of("Hola", "Mundo", "Java", "Oscar", "Programación");

        List<String> resultado = miLista.stream()
                                        .filter(cadena -> cadena.contains("o"))
                                        .collect(Collectors.toList());

        System.out.println(resultado);
    }
}
