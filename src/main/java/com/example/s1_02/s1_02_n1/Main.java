package com.example.s1_02.s1_02_n1;

public class Main {
    public static void main(String[] args) {
        Venda venda = new Venda();
        try {
            venda.calcularTotal();
        } catch (VendaBuidaException e) {
            System.out.println(e.getMessage());
        }

        // Código para generar y capturar ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[5];
            int num = arr[5]; // Esto generará ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Se accedió a un índice fuera de los límites del arreglo.");
        }
    }
}



