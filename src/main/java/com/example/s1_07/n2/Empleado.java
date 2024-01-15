package com.example.s1_07.n2;

public class Empleado {
    private String nombre;
    private int edad;
    private String departamento;
    
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public Empleado(String nombre, int edad, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.departamento = departamento;
    }

    
}
