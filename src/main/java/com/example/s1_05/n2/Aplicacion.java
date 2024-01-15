package com.example.s1_05.n2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.example.s1_05.n1.e3.ListadorDeDirectorio;

public class Aplicacion {
    private static Properties cargarConfiguracion(String archivoConfig) {
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(archivoConfig));
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de configuración: " + e.getMessage());
            return null;
        }
        return prop;
    }
    private static void ejecutarAplicacion(Properties prop) {
        if (prop == null) {
            return;
        }
    
        String directorioALeer = prop.getProperty("directorioALeer");
        String nombreArchivoResultante = prop.getProperty("nombreArchivoResultante");
        String directorioArchivoResultante = prop.getProperty("directorioArchivoResultante");
        String rutaArchivoResultante = directorioArchivoResultante + "\\" + nombreArchivoResultante;
    
        ListadorDeDirectorio listador = new ListadorDeDirectorio();
        listador.listarDirectorioEnArchivo(directorioALeer, rutaArchivoResultante);    
    }

    public static void main(String[] args) {
        
        Properties prop = cargarConfiguracion("src/main/java/config.properties");
        ejecutarAplicacion(prop);
        }
        
    }
   
