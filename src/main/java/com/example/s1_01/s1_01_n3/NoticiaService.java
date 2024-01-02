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

    public void eliminarNoticia(String nombreRedactor) {
        System.out.println("Noticias del redactor: " + nombreRedactor);
        int contador = 0;
        for (int i = 0; i < noticias.size(); i++) {
            if (noticias.get(i)[0].equals(nombreRedactor)) {
                contador++;
                // Construir la cadena de la noticia sin los dos últimos elementos
                String[] noticia = noticias.get(i);
                StringBuilder noticiaSinPrecioPuntuacion = new StringBuilder();
                for (int j = 0; j < noticia.length - 2; j++) {
                    noticiaSinPrecioPuntuacion.append(noticia[j]);
                    if (j < noticia.length - 3) {
                        noticiaSinPrecioPuntuacion.append(", ");
                    }
                }
                System.out.println(contador + ": " + noticiaSinPrecioPuntuacion);
            }
        }
    
        if (contador == 0) {
            System.out.println("No hay noticias para este redactor.");
            return;
        }
    
        System.out.print("Elige el número de la noticia a eliminar: ");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
    
        if (eleccion > 0 && eleccion <= contador) {
            eliminarNoticiaPorIndice(nombreRedactor, eleccion);
        } else {
            System.out.println("Número de noticia inválido.");
        }
    }
    

    private void eliminarNoticiaPorIndice(String nombreRedactor, int eleccion) {
        int contador = 0;
        for (int i = 0; i < noticias.size(); i++) {
            if (noticias.get(i)[0].equals(nombreRedactor)) {
                contador++;
                if (contador == eleccion) {
                    noticias.remove(i);
                    System.out.println("Noticia eliminada.");
                    return;
                }
            }
        }
    }
    public void mostrarNoticiasPorRedactor(String nombreRedactor) {
        System.out.println("Noticias del redactor: " + nombreRedactor);
        int contador = 0;
        for (String[] noticia : noticias) {
            if (noticia[0].equals(nombreRedactor)) {
                contador++;
                StringBuilder noticiaSinPrecioPuntuacion = new StringBuilder();
                noticiaSinPrecioPuntuacion.append(contador).append(": ");
                for (int i = 0; i < noticia.length - 2; i++) {
                    noticiaSinPrecioPuntuacion.append(noticia[i]);
                    if (i < noticia.length - 3) {
                        noticiaSinPrecioPuntuacion.append(", ");
                    }
                }
                System.out.println(noticiaSinPrecioPuntuacion);
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
            System.out.print(numeroNoticia++ + ": "); // Mostrar el número de la noticia
            for (int i = 0; i < noticia.length - 2; i++) { // Evita mostrar los dos últimos elementos (puntuación y precio)
                System.out.print(noticia[i] + " ");
            }
            System.out.println(); // Nueva línea después de cada noticia
        }
    }
    
    

    public String[] getNoticia(int i) {
        if (i >= 0 && i < noticias.size()) {
            // Suponiendo que cada elemento en la lista 'noticias' es de tipo Noticia
            return noticias.get(i);
        } else {
            System.out.println("Índice fuera de rango.");
            return null;
        }
    }
    
   
}
