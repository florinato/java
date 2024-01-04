package com.example.s1_08.n2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FormatearNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(3, 55, 44);

        String resultado = numeros.stream()
                                  .map(numero -> (numero % 2 == 0 ? "e" : "o") + numero)
                                  .collect(Collectors.joining(", "));

        System.out.println(resultado);
    }
}

