package com.example.s1_08.n3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Alumne {
    private String nom;
    private int edat;
    private String curs;
    private double nota;

    public Alumne(String nom, int edat, String curs, double nota) {
        this.nom = nom;
        this.edat = edat;
        this.curs = curs;
        this.nota = nota;
    }

    // Getters
    public String getNom() { return nom; }
    public int getEdat() { return edat; }
    public String getCurs() { return curs; }
    public double getNota() { return nota; }

    @Override
    public String toString() {
        return "Alumne{" +
                "nom='" + nom + '\'' +
                ", edat=" + edat +
                ", curs='" + curs + '\'' +
                ", nota=" + nota +
                '}';
    }
    public static void main(String[] args) {
        // Creación lista de alumnos
        List<Alumne> alumnes = Arrays.asList(
            new Alumne("Ana", 20, "Java", 4.5),
            new Alumne("Albert", 22, "PHP", 5.5),          
            new Alumne("Alicia", 19, "Java", 7.0),            
            new Alumne("Alejandro", 21, "Python", 6.0),
            new Alumne("Beatriz", 23, "Java", 7.5),
            new Alumne("Carlos", 20, "PHP", 4.0),
            new Alumne("David", 19, "Java", 8.0),
            new Alumne("Eva", 22, "Python", 9.0),
            new Alumne("Fernando", 18, "Java", 5.5),
            new Alumne("Gloria", 21, "PHP", 6.5)
        );

        // Mostrar nombre y edad de cada alumno
        System.out.println("Nombre y edad de cada alumno:");
        alumnes.forEach(alumne -> System.out.println(alumne.getNom() + " - " + alumne.getEdat()));

        // Filtrar alumnos cuyo nombre comienza con 'a'
        System.out.println("\nAlumnos cuyo nombre comienza con 'a':");
        List<Alumne> alumnesConA = alumnes.stream()
                                          .filter(alumne -> alumne.getNom().toLowerCase().startsWith("a"))
                                          .collect(Collectors.toList());
        alumnesConA.forEach(System.out::println);

        // Mostrar alumnos con nota 5 o superior
        System.out.println("\nAlumnos con nota 5 o superior:");
        alumnes.stream()
               .filter(alumne -> alumne.getNota() >= 5)
               .forEach(System.out::println);

        // Mostrar alumnos con nota 5 o más que no son de PHP
        System.out.println("\nAlumnos con nota 5 o más que no son de PHP:");
        alumnes.stream()
               .filter(alumne -> alumne.getNota() >= 5 && !alumne.getCurs().equals("PHP"))
               .forEach(System.out::println);

        // Mostrar todos los alumnos de JAVA que son mayores de edad
        System.out.println("\nAlumnos de JAVA mayores de edad:");
        alumnes.stream()
               .filter(alumne -> alumne.getEdat() >= 18 && alumne.getCurs().equals("Java"))
               .forEach(System.out::println);
    }
}

