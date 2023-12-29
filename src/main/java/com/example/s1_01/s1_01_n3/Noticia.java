package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public abstract class Noticia {
    String titular;
    String redactor;

    public Noticia(){
            
    }
    public Noticia(String titular, String redactor) {
        this.titular = titular;
        this.redactor = redactor;
    }
    public abstract int calcularPuntuacion();
    public abstract double calcularPrecioNoticia();

    public abstract String[] crearNoticia(Scanner scanner);
    
    // Método sobrecargado con tipos de parámetros especificados
    public abstract String[] crearNoticia();
    
}


