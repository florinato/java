package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public class NoticiaFutbol extends Noticia {
    private String competicion;
    private String club;
    private String jugador;
    private String texto;
    private String seccion="Futbol";

    public NoticiaFutbol(String seccion,String redactor, String titular,  String texto, String competicion, String club, String jugador) {
        super(titular, redactor); // Llama al constructor de la clase madre
        this.texto = texto;
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
        this.seccion=  seccion;
    }

    public NoticiaFutbol() {
        // Constructor vacío
    }

    @Override
    public int calcularPuntuacion() {
        int puntuacionFutbol = 5;

        if ("Liga de Campeones".equals(competicion)) {
            puntuacionFutbol += 3;
        } else if ("Liga".equals(competicion)) {
            puntuacionFutbol += 2;
        }

        if ("Barça".equals(club) || "Madrid".equals(club)) {
            puntuacionFutbol += 1;
        }

        if ("Ferran Torres".equals(jugador) || "Benzema".equals(jugador)) {
            puntuacionFutbol += 1;
        }

        return puntuacionFutbol;
    }

    @Override
    public double calcularPrecioNoticia() {
        double precioNoticia = 300.0;

        if ("Liga de Campeones".equals(competicion)) {
            precioNoticia += 100;
        }

        if ("Barça".equals(club) || "Madrid".equals(club)) {
            precioNoticia += 100;
        }

        if ("Ferran Torres".equals(jugador) || "Benzema".equals(jugador)) {
            precioNoticia += 50;
        }

        return precioNoticia;
    }

    @Override
public String[] crearNoticia(Scanner scanner) {
    System.out.print("Introduce el redactor de la noticia: ");
    String redactor = scanner.nextLine();
    System.out.print("Introduce el título de la noticia: ");
    String titulo = scanner.nextLine();
    System.out.print("Introduce el texto de la noticia: ");
    String texto = scanner.nextLine();
    System.out.print("Introduce la competición (ej: Liga, Liga de Campeones): ");
    String competicion = scanner.nextLine();
    System.out.print("Introduce el club (ej: Barça, Madrid): ");
    String club = scanner.nextLine();
    System.out.print("Introduce el jugador (ej: Ferran Torres, Benzema): ");
    String jugador = scanner.nextLine();

    String[] datosNoticia = {
        seccion, 
        redactor,  
        titulo, 
        texto, 
        competicion, 
        club, 
        jugador, 
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
        club, 
        jugador, 
    };
    return datosNoticia;
}

    
}
