package com.example.s1_08.n1.e5;

public class Principal {
    public static void main(String[] args) {
        PiValueInterface miPi = () -> 3.1415;
        double valorPi = miPi.getPiValue();
        System.out.println("Valor de Pi: " + valorPi);
    }
}
