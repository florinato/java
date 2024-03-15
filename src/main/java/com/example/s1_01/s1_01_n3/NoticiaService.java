package com.example.s1_01.s1_01_n3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoticiaService {
    private List<Noticia> noticias;
    private Scanner scanner;

    public NoticiaService() {
        this.noticias = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void agregarNoticia(Noticia noticia) {
        noticias.add(noticia);
    }

    public void listarYEliminarNoticia() {
        System.out.println("Listado de todas las noticias:");
        listarNoticias();
        
    
        System.out.print("Elige el número de la noticia a eliminar: ");
        int eleccion = scanner.nextInt();
        scanner.nextLine();
    
        if (eleccion > 0 && eleccion <= noticias.size()) {
            eliminarNoticiaPorIndice(eleccion);
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
        for (Noticia noticia : noticias) {
            if (noticia.getRedactor().equals(nombreRedactor)) {
                System.out.println(++contador + ": " + noticia);
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
        for (Noticia noticia : noticias) {
            System.out.print(numeroNoticia++ + ": "); 
            System.out.println(noticia.toString());
            System.out.println(); 
        }
    }
    
    public Noticia getNoticia(int i) {
        
        if (i >= 0 && i < noticias.size()) {
            return noticias.get(i);
        } else {
            System.out.println("Índice fuera de rango.");
            return null;
        }
    }
    
}
