package com.example.s1_03.s1_03_n1_1;

public class Main {
    public static void main(String[] args) {
        MonthManager manager = new MonthManager();

        System.out.println("Lista de Meses:");
        manager.printMonths();

        System.out.println("-------");
        System.out.println("Lista de Meses Únicos (sin duplicados):");
        manager.printUniqueMonths();
    }
}


