package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public class NoticiaMotociclismo extends Noticia {
    private String equipo;
    private String texto;
    private String seccion="Motociclismo";

    public NoticiaMotociclismo(String seccion,String redactor, String titular,  String texto, String equipo) {
        super(titular, redactor); 
        this.texto = texto;
        this.equipo = equipo;
        this.seccion=  seccion;
    }

    public NoticiaMotociclismo() {
        // Constructor vacío
    }

    @Override
    public int calcularPuntuacion() {
        int puntuacionMotociclismo = 3;

        if ("Honda".equals(equipo) || "Yamaha".equals(equipo)) {
            puntuacionMotociclismo += 3;
        }

        return puntuacionMotociclismo;
    }

    @Override
    public double calcularPrecioNoticia() {
        int precioNoticia = 100;

        if ("Honda".equals(equipo) || "Yamaha".equals(equipo)) {
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
        System.out.print("Introduce el equipo (ej: Honda, Yamaha): ");
        String equipo = scanner.nextLine();

        String[] datosNoticia = {
            seccion, 
            redactor, 
            titular, 
            texto, 
            equipo, 
            
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
            equipo, 
        };
        return datosNoticia;
    }

    
}

