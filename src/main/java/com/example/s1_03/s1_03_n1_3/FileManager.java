package com.example.s1_03.s1_03_n1_3;

import java.io.*;

public class FileManager {
    private static final String NOMBRE_ARCHIVO = "src/main/java/com/example/s1_03/s1_03_n1_3/classificacio.txt";

    public static void guardarPuntuacion(String nombreUsuario, int puntos) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO, true))) {
            writer.write(nombreUsuario + ": " + puntos + "\n");
        }
    }

    public static void mostrarPuntuaciones() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(NOMBRE_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}

