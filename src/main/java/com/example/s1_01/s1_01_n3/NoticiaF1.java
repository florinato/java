package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public class NoticiaF1 extends Noticia {
    private String escuderia;
    
    public NoticiaF1( String redactor, String titular, String texto, String escuderia) {
        super(titular, redactor,texto);
        this.escuderia = escuderia;
        
    }

    @Override
    public String toString() {
        return "NoticiaF1["+ super.toString()+  ", escuderia=" + escuderia + "]";
    }

    public NoticiaF1() {
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

    @SuppressWarnings("resource")
    @Override
    public Noticia crearNoticia() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el redactor de la noticia: ");
        String redactor = scanner.nextLine();
        System.out.print("Introduce el título de la noticia: ");
        String titular = scanner.nextLine();
        System.out.print("Introduce el texto de la noticia: ");
        String texto = scanner.nextLine();
        System.out.print("Introduce la escudería: ");
        String escuderia = scanner.nextLine();

        return new NoticiaF1( redactor, titular, texto, escuderia);
    }

    @Override
    public Noticia crearNoticia(String titular, String redactor) {
        return new NoticiaF1(redactor, titular, texto, escuderia);
    }
}

    

