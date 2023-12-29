package com.example.s1_01.s1_01_n3;

import java.util.ArrayList;
import java.util.List;

public class RedactorService {
    private List<Redactor> redactores;

    public RedactorService() {
        this.redactores = new ArrayList<>();
    }

    public void agregarRedactor(Redactor redactor) {
        redactores.add(redactor);
    }

    public boolean eliminarRedactorPorNombre(String nombre) {
        return redactores.removeIf(redactor -> redactor.getNombre().equalsIgnoreCase(nombre));
    }

    public Redactor buscarRedactorPorNombre(String nombre) {
        for (Redactor redactor : redactores) {
            if (redactor.getNombre().equals(nombre)) {
                return redactor;
            }
        }
        return null;
    }

    public void mostrarRedactores() {
        for (Redactor redactor : redactores) {
            System.out.println("Nombre: " + redactor.getNombre() + ", DNI: " + redactor.getDni());
        }
    }
    
    
}

