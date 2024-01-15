package com.example.s1_05.n1.e4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class ListadorDeDirectorio {

    public void listarDirectorioEnArchivo(String rutaDirectorio, String nombreArchivo) {
        File directorioRaiz = new File(rutaDirectorio);
        if (!directorioRaiz.isDirectory()) {
            System.out.println("El argumento proporcionado no es un directorio válido.");
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(nombreArchivo))) {
            listarDirectorio(directorioRaiz, 0, writer);
            System.out.println("El contenido del directorio ha sido guardado en '" + nombreArchivo + "'.");
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    private void listarDirectorio(File directorio, int nivel, PrintWriter writer) throws IOException {
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
