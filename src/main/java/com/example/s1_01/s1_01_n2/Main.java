package com.example.s1_01.s1_01_n2;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("Samsung", "Galaxy S20");

        smartphone.trucar("123456789"); // Llamar al método trucar de Telèfon
        smartphone.fotografiar(); // Llamar al método fotografiar de Camera
        smartphone.alarma(); // Llamar al método alarma de Rellotge
    }
    
}
