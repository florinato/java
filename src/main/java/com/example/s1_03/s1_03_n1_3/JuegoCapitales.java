package com.example.s1_03.s1_03_n1_3;

import java.io.IOException;

public class JuegoCapitales {
    public static void main(String[] args) {
        try {
            CapitalesJuegoManager juego = new CapitalesJuegoManager();
            juego.jugar();
        } catch (IOException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}


