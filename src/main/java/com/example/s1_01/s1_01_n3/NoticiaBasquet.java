package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public class NoticiaBasquet extends Noticia {
    
    private String competicion;
    private String club;
    
    public NoticiaBasquet( String redactor, String titular, String texto, String competicion, String club) {
        super(titular, redactor,texto);
        this.competicion = competicion;
        this.club = club;
        
    }
    @Override
    public String toString() {
        return "NoticiaBasquet["+ super.toString() + ", competicion=" + competicion + ", club=" + club + "]";
    }
    public NoticiaBasquet() {
        
    }
    @Override
    public int calcularPuntuacion() {
        int puntuacionBasquet = 4; 

        if ("Eurolliga".equals(competicion)) {
            puntuacionBasquet += 3;
        } else if ("ACB".equals(competicion)) {
            puntuacionBasquet += 2;
        }

        if ("Barça".equals(club) || "Madrid".equals(club)) {
            puntuacionBasquet += 1;
        }

        return puntuacionBasquet;
    }

    @Override
    public double calcularPrecioNoticia() {
        double precioNoticia = 250.0;

        if ("Eurolliga".equals(competicion)) {
            precioNoticia += 75;
        }

        if ("Barça".equals(club) || "Madrid".equals(club)) {
            precioNoticia += 75;
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
        System.out.print("Introduce la competición: ");
        String competicion = scanner.nextLine();
        System.out.print("Introduce el club: ");
        String club = scanner.nextLine();

        return new NoticiaBasquet( redactor, titular, texto, competicion, club);
    }

    @Override
    public Noticia crearNoticia(String titular, String redactor) {
        return new NoticiaBasquet(redactor, titular, texto, competicion, club);
    }
}

