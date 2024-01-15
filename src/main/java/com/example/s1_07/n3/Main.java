package com.example.s1_07.n3;

import com.example.s1_07.n2.JsonSerializable;

import com.example.s1_07.n2.Proyecto;

public class Main {
    public static void main(String[] args) {
        // Obtener la clase Proyecto
        Class<?> proyectoClass = Proyecto.class;

        // Verificar si la anotación JsonSerializable está presente en la clase Proyecto
        if (proyectoClass.isAnnotationPresent(JsonSerializable.class)) {
            // Obtener la anotación JsonSerializable
            JsonSerializable jsonSerializable = proyectoClass.getAnnotation(JsonSerializable.class);

            // Leer y mostrar el directorio especificado en la anotación
            String directory = jsonSerializable.directory();
            System.out.println("Directorio especificado en la anotación: " + directory);
        } else {
            System.out.println("La anotación JsonSerializable no está presente en la clase Proyecto.");
        }
    }
}
