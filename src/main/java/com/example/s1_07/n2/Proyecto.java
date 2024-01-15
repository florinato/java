package com.example.s1_07.n2;

import java.util.List;
@JsonSerializable(directory = "src/main/java/com/example/s1_07/n2")
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
