package com.example.s1_05;

import java.io.File;
import java.util.Arrays;

public class DirectorioListador {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, proporciona un directorio.");
            return;
        }

        File directorio = new File(args[0]);
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

