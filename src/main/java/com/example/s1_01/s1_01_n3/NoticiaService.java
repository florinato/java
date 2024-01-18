package com.example.s1_01.s1_01_n3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoticiaService {
    private List<String[]> noticias;
    private Scanner scanner;

    public NoticiaService() {
        this.noticias = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void agregarNoticia(String[] noticia) {
        noticias.add(noticia);
    }

    public void listarYEliminarNoticia() {
        System.out.println("Listado de todas las noticias:");
        listarNoticias();
        
    
        System.out.print("Elige el número de la noticia a eliminar: ");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
    
        if (eleccion > 0 && eleccion <= noticias.size()) {
            eliminarNoticiaPorIndice(eleccion); // Ajuste del índice debido a que la lista comienza en 0
        } else {
            System.out.println("Número de noticia inválido.");
        }
        listarNoticias();
    }
    
    

    private void eliminarNoticiaPorIndice(int eleccion) {
        if (eleccion > 0 && eleccion <= noticias.size()) {
            noticias.remove(eleccion - 1); 
            System.out.println("Noticia eliminada.");
        } else {
            System.out.println("Número de noticia inválido.");
        }
    }
    
    public void mostrarNoticiasPorRedactor(String nombreRedactor) {
        System.out.println("Noticias del redactor: " + nombreRedactor);
        int contador = 0;
        for (String[] noticia : noticias) {
            if (noticia[1].equals(nombreRedactor)) { 
                System.out.print(++contador + ": ");
                for (int i = 0; i < noticia.length; i++) {
                    System.out.print(noticia[i]);
                    if (i < noticia.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println();
            }
        }
    
        if (contador == 0) {
            System.out.println("No hay noticias para este redactor.");
        }
    }
    
    public void listarNoticias() {
        if (noticias.isEmpty()) {
            System.out.println("No hay noticias disponibles.");
            return;
        }
        System.out.println("Listado de todas las noticias:");
        int numeroNoticia = 1;
        for (String[] noticia : noticias) {
            System.out.print(numeroNoticia++ + ": "); 
            for (int i = 0; i < noticia.length; i++) { 
                System.out.print(noticia[i] + " ");
            }
            System.out.println(); 
        }
    }
    
    public String[] getNoticia(int i) {
        
        if (i >= 0 && i < noticias.size()) {          
            return noticias.get(i);
        } else {
            System.out.println("Índice fuera de rango.");
            return null;
        }
    }
    
}
