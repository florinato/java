package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public class NoticiaMotociclismo extends Noticia {
    
    private String equipo;
    private String piloto;
    private String texto;

    public NoticiaMotociclismo(String redactor, String titular, String texto, String equipo, String piloto) {
        super(titular, redactor,texto);
        this.equipo = equipo;
        this.piloto = piloto;
        
    }
    @Override
    public String toString() {
        return "NoticiaMotociclismo ["+ super.toString()+  ", equipo=" + equipo + ", pilotos=" + piloto + "]";
    }

    public NoticiaMotociclismo() {
    }
    @Override
    public int calcularPuntuacion() {
        int puntuacionMotociclismo = 3;
        // Sumar puntos por pilotos famosos
        if ("Marquez".equals(piloto) || "Rossi".equals(piloto)) {
            puntuacionMotociclismo += 3; 
        }
        // Evaluar equipo
        if ("Honda".equals(equipo) || "Yamaha".equals(equipo)) {
            puntuacionMotociclismo += 2;
        }
        return puntuacionMotociclismo;
    }
    @Override
    public double calcularPrecioNoticia() {
        double precioNoticia = 120;

        if ("Marquez".equals(piloto) || "Rossi".equals(piloto)) {
            precioNoticia += 80;
        }

        // Evaluar equipo
        if ("Honda".equals(equipo) || "Yamaha".equals(equipo)) {
            precioNoticia += 40;
        }

        return precioNoticia;
    }

    @Override
    public Noticia crearNoticia() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el redactor de la noticia: ");
        String redactor = scanner.nextLine();
        System.out.print("Introduce el título de la noticia: ");
        String titular = scanner.nextLine();
        System.out.print("Introduce el texto de la noticia: ");
        String texto = scanner.nextLine();
        System.out.print("Introduce el equipo: ");
        String equipo = scanner.nextLine();
        System.out.print("Introduce los pilotos involucrados: ");
        String piloto = scanner.nextLine();
        Noticia datosNoticia = new NoticiaMotociclismo(redactor, titular, texto, equipo, piloto);
        return datosNoticia;
    }

    @Override
    public Noticia crearNoticia(String titular, String redactor) {
        Noticia datosNoticia = new NoticiaMotociclismo(redactor, titular, texto, equipo, piloto);
        return datosNoticia;
    }
}