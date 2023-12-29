package com.example.s1_03.s1_03_n1_2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListaInversa {
    public static void main(String[] args) {

        List<Integer> listaOriginal = new ArrayList<>();
        listaOriginal.add(1);
        listaOriginal.add(2);
        listaOriginal.add(3);
        // Crear la segunda lista
        List<Integer> listaInversa = new ArrayList<>();
        // Invertir el orden usando ListIterator
        ListIterator<Integer> iterador = listaOriginal.listIterator(listaOriginal.size());
        while (iterador.hasPrevious()) {
            listaInversa.add(iterador.previous());
        }
        System.out.println("Lista Original: " + listaOriginal);
        System.out.println("Lista Inversa: " + listaInversa);
    }
    
}
