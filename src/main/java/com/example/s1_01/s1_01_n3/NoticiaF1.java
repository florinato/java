package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public class NoticiaF1 extends Noticia {
    private String escuderia;
    private String texto;
    private String seccion="F1";

    public NoticiaF1(String seccion,String redactor, String titular,  String texto, String escuderia) {
        super(titular, redactor); // Llama al constructor de la clase madre
        this.texto = texto;
        this.escuderia = escuderia;
        this.seccion=  seccion;
    }

    public NoticiaF1() { 
        // Constructor vacío
    }

    @Override
    public int calcularPuntuacion() {
        int puntuacionF1 = 4;

        if ("Ferrari".equals(escuderia) || "Mercedes".equals(escuderia)) {
            puntuacionF1 += 2;
        }

        return puntuacionF1;
    }

    @Override
    public double calcularPrecioNoticia() {
        double precioNoticia = 100;

        if ("Ferrari".equals(escuderia) || "Mercedes".equals(escuderia)) {
            precioNoticia += 50;
        }

        return precioNoticia;
    }

    @Override
    public String[] crearNoticia(Scanner scanner) {
        System.out.print("Introduce el redactor de la noticia: ");
        String redactor = scanner.nextLine();
        System.out.print("Introduce el título de la noticia: ");
        String titular = scanner.nextLine();
        System.out.print("Introduce el texto de la noticia: ");
        String texto = scanner.nextLine();
        System.out.print("Introduce la escudería (ej: Ferrari, Mercedes): ");
        String escuderia = scanner.nextLine();

        String[] datosNoticia = {
            seccion,
            redactor,  
            titular, 
            texto, 
            escuderia    
        };
        return datosNoticia;
    }

    @Override
    public String[] crearNoticia() {
        String[] datosNoticia = {
            seccion,
            redactor, 
            titular, 
            texto, 
            escuderia    
        };
        
        
        return datosNoticia;
    }

    
}
