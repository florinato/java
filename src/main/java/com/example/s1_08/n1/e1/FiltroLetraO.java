package com.example.s1_08.n1.e1;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroLetraO {
    public static void main(String[] args) {
        List<String> miLista = List.of("Hola", "Mundo", "Java", "Oscar", "Programación");

        List<String> resultado = filtrarPorLetraO(miLista);

        System.out.println(resultado);
    }

    private static List<String> filtrarPorLetraO(List<String> lista) {
        return lista.stream()
                    .filter(cadena -> cadena.toLowerCase().contains("o"))
                    .collect(Collectors.toList());
    }
}