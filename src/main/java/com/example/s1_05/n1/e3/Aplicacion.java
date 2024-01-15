package com.example.s1_05.n1.e3;

public class Aplicacion {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Por favor, proporciona un directorio y un nombre de archivo.");
            return;
        }

        ListadorDeDirectorio listador = new ListadorDeDirectorio();
        listador.listarDirectorioEnArchivo(args[0], args[1]);
    }
}
