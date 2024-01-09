package com.example.demo;
@SuppressWarnings("unused")
public class ArrayExceptionDemo {

    public void lanzarExcepcion() {
        int[] arreglo = new int[5];
        int numero = arreglo[10]; // Esto lanzará ArrayIndexOutOfBoundsException
    }
}

