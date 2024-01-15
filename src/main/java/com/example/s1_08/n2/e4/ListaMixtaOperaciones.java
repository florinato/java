package com.example.s1_08.n2.e4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListaMixtaOperaciones {
    public static void main(String[] args) {
        List<String> listaMixta = Arrays.asList("Hola", "42", "Árbol", "eclipse", "123", "amanecer", "Java", "4ever");

        // Paso 1: Ordenar alfabéticamente por el primer carácter
        listaMixta.sort((s1, s2) -> s1.charAt(0) - s2.charAt(0));
        System.out.println("Ordenadas alfabéticamente por el primer carácter: " + listaMixta);

        // Añadir un salto de línea
        System.out.println();

        // Paso 2: 'e' primero, luego el resto
        listaMixta.sort((s1, s2) -> {
            if (s1.contains("e") && !s2.contains("e")) return -1;
            if (s2.contains("e") && !s1.contains("e")) return 1;
            return 0;
        });
        System.out.println("Con 'e' primero: " + listaMixta);

        // Añadir un salto de línea
        System.out.println();

        // Paso 3: Modificar elementos con 'a' a '4'
        listaMixta = listaMixta.stream()
                               .map(s -> s.replace('a', '4'))
                               .collect(Collectors.toList());
        System.out.println("Después de reemplazar 'a' por '4': " + listaMixta);

        // Añadir un salto de línea
        System.out.println();

        // Paso 4: Mostrar solo elementos numéricos
        System.out.println("Elementos numéricos:");
        listaMixta.stream()
                  .filter(s -> s.matches("\\d+"))
                  .forEach(System.out::println);
    }
}




