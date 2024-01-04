package com.example.s1_08.n1;

import java.util.List;
import java.util.stream.Collectors;

public class FiltroLetraOYLongitud {
    public static void main(String[] args) {
        List<String> miLista = List.of("Hola", "Mundo", "Desarrollo", "Oscar", "Programación", "Java");

        List<String> resultado = miLista.stream()
                                        .filter(cadena -> cadena.contains("o") && cadena.length() > 5)
                                        .collect(Collectors.toList());

        System.out.println(resultado);
    }
}
