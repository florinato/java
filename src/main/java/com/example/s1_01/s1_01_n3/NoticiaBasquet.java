package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public class NoticiaBasquet extends Noticia {
    private String competicion;
    private String club;
    private String texto;
    private String seccion="Basquet";
    public NoticiaBasquet(String seccion,String redactor, String titular,  String texto, String competicion, String club) {
        super(titular, redactor); // Llama al constructor de la clase madre
        this.texto = texto;
        this.competicion = competicion;
        this.club = club;
        this.seccion=seccion;
    }

    public NoticiaBasquet() {
        // Constructor vacío
    }

    @Override
    public int calcularPuntuacion() {
        int puntuacionBasquet = 4; // Puntuación base para noticias de baloncesto

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
        double precioNoticia = 250.0; // Precio base para noticias de baloncesto

        if ("Eurolliga".equals(competicion)) {
            precioNoticia += 75;
        }

        if ("Barça".equals(club) || "Madrid".equals(club)) {
            precioNoticia += 75;
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
        System.out.print("Introduce la competición (ej: Eurolliga, ACB): ");
        String competicion = scanner.nextLine();
        System.out.print("Introduce el club (ej: Barça, Madrid): ");
        String club = scanner.nextLine();

        String[] datosNoticia = {
            seccion,
            redactor,              
            titular, 
            texto, 
            competicion, 
            club 
            
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
            competicion, 
            club
        };
        return datosNoticia;
    }

    
}
