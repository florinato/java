package com.example.demo;

public class CalculoDni {
    private static final String SECUENCIA_LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public static char calcularLetraDni(int numeroDni) {
        int indice = numeroDni % 23;
        return SECUENCIA_LETRAS.charAt(indice);
    }
}
