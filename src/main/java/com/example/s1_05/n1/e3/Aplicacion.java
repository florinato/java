package com.example.s1_05.n1.e3;

public class Aplicacion {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, proporciona un directorio.");
            
        }
        else{
        ListadorDeDirectorio listador = new ListadorDeDirectorio();
        listador.listarDirectorioEnArchivo(args[0], args[1]);
        }
    }
}
