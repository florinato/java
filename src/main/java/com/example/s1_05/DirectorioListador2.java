package com.example.s1_05;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectorioListador2 {
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

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("directorio_contenido.txt"));
            listarDirectorio(directorioRaiz, 0, writer);
            writer.close();
            System.out.println("El contenido del directorio ha sido guardado en 'directorio_contenido.txt'.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    static void listarDirectorio(File directorio, int nivel, PrintWriter writer) throws IOException {
        File[] archivos = directorio.listFiles();
        if (archivos == null || archivos.length == 0) {
            return;
        }

        Arrays.sort(archivos);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        for (File archivo : archivos) {
            for (int i = 0; i < nivel; i++) {
                writer.print("  "); // Indentación para subdirectorios
            }
            writer.print(archivo.isDirectory() ? "D" : "F");
            writer.println(" - " + archivo.getName() + " - Última modificación: " + sdf.format(archivo.lastModified()));

            if (archivo.isDirectory()) {
                listarDirectorio(archivo, nivel + 1, writer); // Llamada recursiva para subdirectorios
            }
        }
    }
}

