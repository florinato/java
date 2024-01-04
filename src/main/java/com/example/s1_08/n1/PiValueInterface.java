package com.example.s1_08.n1;

@FunctionalInterface
public interface PiValueInterface {
    double getPiValue();

}
class Principal {
    public static void main(String[] args) {
        PiValueInterface miPi = () -> 3.1415;
        double valorPi = miPi.getPiValue();
        System.out.println("Valor de Pi: " + valorPi);
    }
}