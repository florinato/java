package com.example.s1_05.n2;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) {
        try {
            Properties prop = Aplicacion.cargarConfiguracion("src/main/java/config.properties");
            if (prop != null) {
                Aplicacion.ejecutarAplicacion(prop);
            } else {
                System.out.println("La configuración no se pudo cargar.");
            }
        } catch (IOException e) {
            System.out.println("Error al cargar la configuración: " + e.getMessage());
        }
    }
}

