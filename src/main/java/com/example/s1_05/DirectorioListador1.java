package com.example.s1_05;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectorioListador1 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, proporciona un directorio.");
            return;
        }

        File directorioRaiz = new File(args[0]);
        if (!directorioRaiz.isDirectory()) {
            System.out.println("El argumento proporcionado no es un directorio válido.");
            return;
        }

        listarDirectorio(directorioRaiz, 0);
    }

    private static void listarDirectorio(File directorio, int nivel) {
        File[] archivos = directorio.listFiles();
        if (archivos == null || archivos.length == 0) {
            return;
        }

        Arrays.sort(archivos);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (File archivo : archivos) {
            for (int i = 0; i < nivel; i++) {
                System.out.print("  "); // Indentación para subdirectorios
            }
            System.out.print(archivo.isDirectory() ? "D" : "F");
            System.out.println(" - " + archivo.getName() + " - Última modificación: " + sdf.format(archivo.lastModified()));

            if (archivo.isDirectory()) {
                listarDirectorio(archivo, nivel + 1); // Llamada recursiva para subdirectorios
            }
        }
    }
}

