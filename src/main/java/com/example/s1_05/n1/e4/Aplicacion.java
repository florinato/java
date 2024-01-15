package com.example.s1_05.n1.e4;

import java.io.File;

public class Aplicacion {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, proporciona al menos un argumento.");
            return;
        }

        File entrada = new File(args[0]);
        ListadorDeDirectorio listador = new ListadorDeDirectorio();
        LectorDeArchivo lector = new LectorDeArchivo();

        if (entrada.isDirectory()) {
            if (args.length < 2) {
                System.out.println("Por favor, proporciona también un nombre de archivo para guardar la salida.");
                return;
            }
            listador.listarDirectorioEnArchivo(args[0], args[1]);
        } else if (entrada.isFile() && args[0].endsWith(".txt")) {
            lector.leerArchivoTXT(args[0]);
        } else {
            System.out.println("El argumento proporcionado no es un directorio ni un archivo TXT válido.");
        }
    }
}


