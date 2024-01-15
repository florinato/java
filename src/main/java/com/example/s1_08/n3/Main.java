package com.example.s1_08.n3;

import java.util.List;
import java.util.Arrays;

public class Main {
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
        

        GestorDeAlumnes gestor = new GestorDeAlumnes(alumnes);

        // Llamada a los métodos
        gestor.mostrarNombreYEdad();
        gestor.mostrarAlumnesConA();
        gestor.mostrarAlumnosConNotaMayorOIgualA(5);
        gestor.mostrarAlumnosNoPHPConNotaMayorOIgualA(5);
        gestor.mostrarAlumnosJavaMayoresDeEdad();
    }
   
}
    

