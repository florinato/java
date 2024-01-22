package com.example.s1_05.n1.e2;

public class Aplicacion {

    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, proporciona un directorio.");
            
        }
        else{
        ListadorDeDirectorio listador = new ListadorDeDirectorio();
        listador.listarDirectorioRecursivamente(args[0]);
        }
    }
}
