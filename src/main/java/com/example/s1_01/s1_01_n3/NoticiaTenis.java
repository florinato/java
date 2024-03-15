package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public class NoticiaTenis extends Noticia {
    
    private String competicion;
    private String tenistas;
    
    public NoticiaTenis(String redactor, String titular,  String texto, String competicion, String tenistas) {
        super(titular, redactor,texto); 
        this.competicion = competicion;
        this.tenistas = tenistas;
    }
    public NoticiaTenis(){
    }
    @Override
    public String toString() {
        return "NoticiaTenis [" +  super.toString()+  ", competicion=" + competicion + ", tenistas=" + tenistas + "]";
    }

    public int calcularPuntuacion() {
        int puntuacionTenis = 4;
    
        // Sumar puntos por tenistas famosos
        if ("Federer".equals(tenistas) || "Nadal".equals(tenistas) || "Djokovic".equals(tenistas)) {
            puntuacionTenis += 3; 
        }
    
        // Evaluar competición
        if ("Grand Slam".equals(competicion)) {
            puntuacionTenis += 2; 
        }
    
        return puntuacionTenis;
    }
    
    public double calcularPrecioNoticia() {
        double precioNoticia = 150;
    
        // Aumentar precio por tenistas famosos
        if ("Federer".equals(tenistas) || "Nadal".equals(tenistas) || "Djokovic".equals(tenistas)) {
            precioNoticia += 100; //
        }
    
        // Evaluar competición
        if ("Grand Slam".equals(competicion)) {
            precioNoticia += 50;
        }
    
        return precioNoticia;
    }
    
    @Override
    public  Noticia crearNoticia() {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el redactor de la noticia: ");
        String redactor = scanner.nextLine();
        System.out.print("Introduce el título de la noticia: ");
        String titular = scanner.nextLine();
        System.out.print("Introduce el texto de la noticia: ");
        String texto = scanner.nextLine();
        System.out.print("Introduce la competición: ");
        String competicion = scanner.nextLine();
        System.out.print("Introduce los tenistas involucrados: ");
        String tenistas = scanner.nextLine();
        Noticia datosNoticia =new NoticiaTenis(redactor,titular, texto, competicion,tenistas);
        return datosNoticia;
    }

    @Override
    public Noticia crearNoticia(String titular, String redactor) {
        Noticia datosNoticia =new NoticiaTenis(redactor,titular, texto, competicion,tenistas);
        return datosNoticia;
    }
}

