package com.example.s1_05;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfiguracionEjecutor {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("config.properties")) {
            prop.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String directorioALeer = prop.getProperty("directorioALeer");
        String rutaArchivoResultante = prop.getProperty("directorioArchivoResultante") + 
                                       File.separator + prop.getProperty("nombreArchivoResultante");

        try {
            DirectorioOArchivo.configurarSalidaArchivo(rutaArchivoResultante);
            DirectorioOArchivo.main(new String[]{directorioALeer});
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
