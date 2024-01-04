package com.example.s1_07.n2n3;

import java.util.List;
@JsonSerializable(directory = "demo/src/main/java/com/example/s1_07/n2/javaproyecto.json")
public class Proyecto {
    
    private String nombre;
    private List<Empleado> empleados;
    public String getNombre() {
        return nombre;
    }
    public List<Empleado> getEmpleados() {
        return empleados;
    }
    public Proyecto(String nombre, List<Empleado> empleados) {
        this.nombre = nombre;
        this.empleados = empleados;
    }

    
}
