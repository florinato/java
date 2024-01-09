package com.example.s1_03.s1_03_n1_3;

import java.io.*;
import java.util.*;

public class CapitalesJuegoManager {
    private HashMap<String, String> paisesCapitales;
    private Scanner scanner;

    public CapitalesJuegoManager() throws IOException {
        cargarPaisesCapitales("src/main/java/com/example/s1_03/s1_03_n1_3/countries.txt");
        scanner = new Scanner(System.in);
    }

    private void cargarPaisesCapitales(String nombreArchivo) throws IOException {
        paisesCapitales = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(" ");
                String pais = partes[0];
                String capital = partes[1].replace("_", " "); // Reemplazar guiones bajos por espacios
                paisesCapitales.put(pais, capital);
            }
        }
    }

    public void jugar() throws IOException {
        System.out.println("Introduce tu nombre:");
        String nombreUsuario = scanner.nextLine();

        int puntos = 0;
        List<String> paises = new ArrayList<>(paisesCapitales.keySet());
        Random random = new Random();
        for (int i = 0; i < 10; i++) { // Se repite 10 veces
            String pais = paises.get(random.nextInt(paises.size()));
            System.out.println("¿Cuál es la capital de " + pais + "?");
            String respuesta = scanner.nextLine();
            if (paisesCapitales.get(pais).equalsIgnoreCase(respuesta)) {
                puntos++;
            }
        }

        FileManager.guardarPuntuacion(nombreUsuario, puntos);
        System.out.println("Juego terminado. " + nombreUsuario + " Tu puntuación es: " + puntos);
        FileManager.mostrarPuntuaciones();
        scanner.close();
    }
}

