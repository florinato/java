package com.example.s1_08.n1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaMixta {
    public static void main(String[] args) {
        List<Object> listaMixta = Arrays.asList("Java", 42, "Hola", 7, "Programación", "a");

        List<String> soloCadenas = listaMixta.stream()
                                             .filter(objeto -> objeto instanceof String)
                                             .map(objeto -> (String) objeto)
                                             .sorted((s1, s2) -> s1.length() - s2.length())
                                             .collect(Collectors.toList());

        System.out.println(soloCadenas);
    }
}

