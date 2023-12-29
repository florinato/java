package com.example.s1_03.s1_03_n3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class AplicacioPersona {
    
    public static List<Persona> llegirFitxerCSV(String rutaFitxer) {
        List<Persona> persones = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaFitxer))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                String[] dades = linia.split(",");
                persones.add(new Persona(dades[0], dades[1], dades[2]));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return persones;
    }

    // Método main
    public static void main(String[] args) {
        List<Persona> persones = llegirFitxerCSV(
            "src/main/java/com/example/s1_03/s1_03_n3/personas.csv");
        Scanner scanner = new Scanner(System.in);
        boolean sortir = false;

        while (!sortir) {

            System.out.println("1.- Mostrar les persones ordenades per nom (A-Z).");
            System.out.println("2.- Mostrar les persones ordenades per nom (Z-A).");
            System.out.println("3.- Mostrar les persones ordenades per cognoms (A-Z).");
            System.out.println("4.- Mostrar les persones ordenades per cognoms (Z-A).");
            System.out.println("5.- Mostrar les persones ordenades per DNI (1-9).");
            System.out.println("6.- Mostrar les persones ordenades per DNI (9-1).");
            System.out.println("0.- Sortir.");
            System.out.print("Escull una opció: ");
            int opcio = scanner.nextInt();
        
            switch (opcio) {
                case 1:
                    Collections.sort(persones, Comparator.comparing(Persona::getNom));
                    mostrarPersones(persones);
                    break;
                case 2:
                    Collections.sort(persones, Comparator.comparing(Persona::getNom).reversed());
                    mostrarPersones(persones);
                    break;
                case 3:
                    Collections.sort(persones, Comparator.comparing(Persona::getCognom));
                    mostrarPersones(persones);
                    break;
                case 4:
                    Collections.sort(persones, Comparator.comparing(Persona::getCognom).reversed());
                    mostrarPersones(persones);
                    break;
                case 5:
                    Collections.sort(persones, Comparator.comparing(Persona::getDNI));
                    mostrarPersones(persones);
                    break;
                case 6:
                    Collections.sort(persones, Comparator.comparing(Persona::getDNI).reversed());
                    mostrarPersones(persones);
                    break;
                case 0:
                    sortir = true;
                    break;
                default:
                    System.out.println("Opció no vàlida.");
                    break;
            }
        }
        scanner.close();
    }

    private static void mostrarPersones(List<Persona> persones) {
        for (Persona persona : persones) {
            System.out.println(persona);
        }
    }
}
