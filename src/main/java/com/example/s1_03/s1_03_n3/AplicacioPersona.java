package com.example.s1_03.s1_03_n3;

public class AplicacioPersona {
    public static void main(String[] args) {
        GestorPersonas gestor = new GestorPersonas("src/main/java/com/example/s1_03/s1_03_n3/personas.csv");
        gestor.mostrarMenu();
    }
}
