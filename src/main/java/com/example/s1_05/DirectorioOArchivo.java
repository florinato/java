package com.example.s1_05;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectorioOArchivo {
    private static PrintStream salida = System.out;
    public static void main(String[] args) {
        if (args.length < 1) {
            salida.println("Por favor, proporciona un directorio o un archivo TXT.");
            return;
        }

        File entrada = new File(args[0]);
        if (entrada.isDirectory()) {
            listarDirectorio(entrada, 0);
        } else if (entrada.isFile() && entrada.getName().endsWith(".txt")) {
            mostrarContenidoArchivo(entrada);
        } else {
            salida.println("El argumento proporcionado no es un directorio ni un archivo TXT válido.");
        }
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
                salida.print("  "); // Indentación para subdirectorios
            }
            salida.print(archivo.isDirectory() ? "D" : "F");
            salida.println(" - " + archivo.getName() + " - Última modificación: " + sdf.format(archivo.lastModified()));

            if (archivo.isDirectory()) {
                listarDirectorio(archivo, nivel + 1); // Llamada recursiva para subdirectorios
            }
        }
    }

    private static void mostrarContenidoArchivo(File archivo) {
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                salida.println(linea);
            }
        } catch (IOException e) {
            salida.println("Error al leer el archivo: " + e.getMessage());
        }
        
    }
    public static void configurarSalidaArchivo(String rutaArchivo) throws FileNotFoundException {
        salida = new PrintStream(new FileOutputStream(rutaArchivo));
    }
}


