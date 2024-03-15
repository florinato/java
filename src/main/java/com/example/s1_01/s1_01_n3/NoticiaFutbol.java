package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public class NoticiaFutbol extends Noticia {
    
    private String competicion;
    private String club;
    private String jugador;
    private String texto;

    public NoticiaFutbol(String redactor, String titular, String texto, String competicion, String club, String jugador) {
        super(titular, redactor,texto);
        this.competicion = competicion;
        this.club = club;
        this.jugador = jugador;
        
    }
    @Override
    public String toString() {
        return "NoticiaFutbol ["+ super.toString()+  ", competicion=" + competicion + ", club=" + club + ", jugador="
                + jugador +  "]";
    }
    public NoticiaFutbol() {
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
        double precioNoticia = 300;

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
        System.out.print("Introduce el jugador: ");
        String jugador = scanner.nextLine();
        return new NoticiaFutbol(redactor, titular, texto, competicion, club, jugador);
    }

    @Override
    public Noticia crearNoticia(String titular, String redactor) {
        return new NoticiaFutbol(redactor, titular, texto, competicion, club, jugador);
    }
}
