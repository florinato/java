package com.example.s1_07.n2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear algunos empleados
        Empleado empleado1 = new Empleado("Juan", 30, "Desarrollo");
        Empleado empleado2 = new Empleado("Ana", 28, "Marketing");
        List<Empleado> listaEmpleados = Arrays.asList(empleado1, empleado2);

        // Crear un proyecto y agregar empleados
        Proyecto proyecto = new Proyecto("Proyecto X", listaEmpleados);

        // Serializar el proyecto a JSON
        String jsonProyecto = JsonUtil.serializeObjectToJson(proyecto);

        // Obtener el directorio desde la anotación
        JsonSerializable annotation = proyecto.getClass().getAnnotation(JsonSerializable.class);
        String directory = annotation.directory();

        // Escribir el JSON en el archivo
        JsonFileWriter.writeJsonToFile(jsonProyecto, directory, "proyecto.json");

        System.out.println("Proyecto serializado y guardado en: " + directory);
    }
}

