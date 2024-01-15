package com.example.s1_08.n1.e8;

@FunctionalInterface
public interface Reverser {
    String reverse(String input);
}
class Principial {
    public static void main(String[] args) {
        Reverser reverser = s -> new StringBuilder(s).reverse().toString();

        String resultado = reverser.reverse("Hola Mundo");
        System.out.println(resultado); // Debería imprimir "odnuM aloH"
    }
}