package com.example.s1_05.n2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.example.s1_05.n1.e3.ListadorDeDirectorio;

public class Aplicacion {
    public static Properties cargarConfiguracion(String archivoConfig) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream(archivoConfig));
        return prop;
    }
    public static void ejecutarAplicacion(Properties prop) {
        String directorioALeer = prop.getProperty("directorioALeer");
        String nombreArchivoResultante = prop.getProperty("nombreArchivoResultante");
        String directorioArchivoResultante = prop.getProperty("directorioArchivoResultante");
        String rutaArchivoResultante = directorioArchivoResultante + "\\" + nombreArchivoResultante;
    
        ListadorDeDirectorio listador = new ListadorDeDirectorio();
        listador.listarDirectorioEnArchivo(directorioALeer, rutaArchivoResultante);
    }
    

    
    }
   
