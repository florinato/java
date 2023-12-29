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
                System.out.println(contador + ": " + String.join(", ", noticias.get(i)));
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
                System.out.println(contador + ": " + String.join(", ", noticia));
            }
        }

        if (contador == 0) {
            System.out.println("No hay noticias para este redactor.");
        }
    }
   
}
