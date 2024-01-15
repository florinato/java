package com.example.s1_05.n1.e1;

import java.io.File;
import java.util.Arrays;

public class ListadorDeDirectorio {

    public void listarArchivosDelDirectorio(String rutaDirectorio) {
        File directorio = new File(rutaDirectorio);
        if (!directorio.isDirectory()) {
            System.out.println("El argumento proporcionado no es un directorio válido.");
            return;
        }

        String[] archivos = directorio.list();
        if (archivos == null || archivos.length == 0) {
            System.out.println("El directorio está vacío o no se pudo leer.");
            return;
        }

        Arrays.sort(archivos);
        for (String archivo : archivos) {
            System.out.println(archivo);
        }
    }
}
