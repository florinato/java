package com.example.s1_08.n3;

import java.util.List;





public class GestorDeAlumnes {
    private List<Alumne> alumnes;

    public GestorDeAlumnes(List<Alumne> alumnes) {
        this.alumnes = alumnes;
    }

    public void mostrarNombreYEdad() {
        System.out.println("Nombre y edad de cada alumno:");
        alumnes.forEach(alumne -> System.out.println(alumne.getNom() + " - " + alumne.getEdat()));
    }

    public void mostrarAlumnesConA() {
        System.out.println("\nAlumnos cuyo nombre comienza con 'a':");
        alumnes.stream()
               .filter(alumne -> alumne.getNom().toLowerCase().startsWith("a"))
               .forEach(System.out::println);
    }

    public void mostrarAlumnosConNotaMayorOIgualA(double nota) {
        System.out.println("\nAlumnos con nota " + nota + " o superior:");
        alumnes.stream()
               .filter(alumne -> alumne.getNota() >= nota)
               .forEach(System.out::println);
    }

    public void mostrarAlumnosNoPHPConNotaMayorOIgualA(double nota) {
        System.out.println("\nAlumnos con nota " + nota + " o más que no son de PHP:");
        alumnes.stream()
               .filter(alumne -> alumne.getNota() >= nota && !alumne.getCurs().equals("PHP"))
               .forEach(System.out::println);
    }

    public void mostrarAlumnosJavaMayoresDeEdad() {
        System.out.println("\nAlumnos de JAVA mayores de edad:");
        alumnes.stream()
               .filter(alumne -> alumne.getEdat() >= 18 && alumne.getCurs().equals("Java"))
               .forEach(System.out::println);
    }
    
}
