package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public class NoticiaTenis extends Noticia {
    
    private String competicion;
    private String tenistas;
    private String texto;
    

   
    public NoticiaTenis(String titular, String redactor, String texto, String competicion, String tenistas, String jugador) {
        super(titular, redactor); // Llama al constructor de la clase madre
        this.texto = texto;
        this.competicion = competicion;
        this.tenistas = tenistas;
        
    }
     public NoticiaTenis(){
        
    }
    
  

    public  int calcularPuntuacion() {
        int puntuacionTenis = 4;

        if ("Federer".equals(tenistas) || "Nadal".equals(tenistas)|| "Djokovic".equals(tenistas)){
            puntuacionTenis += 3; // 3 puntos por Federer, Nadal o Djokovic
        }

        return puntuacionTenis;
    }

    public double calcularPrecioNoticia() {
        double precioNoticia = 150.0;

        if ("Federer".equals(tenistas) || "Nadal".equals(tenistas)|| "Djokovic".equals(tenistas)) {
            precioNoticia += 100; // 100€ por Federer, Nadal o Djokovic
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
        System.out.print("Introduce la competición: ");
        String competicion = scanner.nextLine();
        System.out.print("Introduce los tenistas involucrados: ");
        String tenistas = scanner.nextLine();
        String[] datosNoticia = {redactor,"tenis",titular, texto, competicion,
        tenistas,String.valueOf(calcularPrecioNoticia()), 
        String.valueOf(calcularPuntuacion())};
        return datosNoticia;
    }
    @Override
    public String[] crearNoticia() {
        
        String[] datosNoticia = {
            redactor, 
            "tenis", 
            titular, 
            texto, 
            competicion, 
            tenistas, 
            String.valueOf(calcularPrecioNoticia()), 
            String.valueOf(calcularPuntuacion())
        };
        return datosNoticia;
    }
}

