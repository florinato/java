package com.example.s1_03.s1_03_n1_3;

import java.io.*;
import java.util.*;

public class JuegoCapitales {
    public static void main(String[] args) throws IOException {
        // Leer el archivo y guardar en un HashMap
        HashMap<String, String> paisesCapitales = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/com/example/s1_03/s1_03_n3/personas.csv"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(" ");
                paisesCapitales.put(partes[0], partes[1]);
            }
        }

        // Pedir el nombre del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre:");
        String nombreUsuario = scanner.nextLine();

        // Juego de adivinanzas
        int puntos = 0;
        List<String> paises = new ArrayList<>(paisesCapitales.keySet());
        Random random = new Random();
        for (int i = 0; i < 9; i++) {
            String pais = paises.get(random.nextInt(paises.size()));
            System.out.println("¿Cuál es la capital de " + pais + "?");
            String respuesta = scanner.nextLine();
            if (paisesCapitales.get(pais).equalsIgnoreCase(respuesta)) {
                puntos++;
            }
            
        }

        // Guardar la puntuación en un archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("classificacio.txt", true))) {
            writer.write(nombreUsuario + ": " + puntos + "\n");
        }
        scanner.close();
        System.out.println("Juego terminado. "+nombreUsuario+" Tu puntuación es: " + puntos);
                
        String nombreArchivo = "classificacio.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}
