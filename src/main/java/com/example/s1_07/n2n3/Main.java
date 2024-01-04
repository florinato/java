package com.example.s1_07.n2n3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Oscar", 30, "Desarrollo");
        Empleado empleado2 = new Empleado("Ana", 28, "Marketing");

        List<Empleado> listaEmpleados = new ArrayList<>();
        listaEmpleados.add(empleado1);
        listaEmpleados.add(empleado2);

        Proyecto proyecto = new Proyecto("Proyecto Alpha", listaEmpleados);

        JsonUtil.serializeObjectToJson(proyecto, "demo/src/main/java/com/example/s1_07/n2/javaproyecto.json");
        Class<?> clase = Proyecto.class; // Reemplaza Proyecto con la clase que tiene la anotación
        JsonSerializable annotation = clase.getAnnotation(JsonSerializable.class);

        if (annotation != null) {
            String directory = annotation.directory();
            // Aquí puedes hacer lo que necesites con el valor de 'directory'
            System.out.println("Directorio: " + directory);
        } else {
            System.out.println("La anotación JsonSerializable no está presente en la clase.");
        }
    }
}
