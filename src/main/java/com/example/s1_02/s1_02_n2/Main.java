package com.example.s1_02.s1_02_n2;

public class Main {
    public static void main(String[] args) {
        
        byte unByte = Entrada.llegirByte("Introdueix un número byte:");
        System.out.println("El número byte introduït és: " + unByte);

        // Ejemplo para llegirInt
        int unEntero = Entrada.llegirInt("Introdueix un número enter:");
        System.out.println("El número enter introduït és: " + unEntero);

        // Ejemplo para llegirFloat
        float unFloat = Entrada.llegirFloat("Introdueix un número float:");
        System.out.println("El número float introduït és: " + unFloat);

        // Ejemplo para llegirDouble
        double unDouble = Entrada.llegirDouble("Introdueix un número double:");
        System.out.println("El número double introduït és: " + unDouble);

        // Ejemplo para llegirChar
        char unCaracter = Entrada.llegirChar("Introdueix un caràcter:");
        System.out.println("El caràcter introduït és: " + unCaracter);

        // Ejemplo para llegirString
        String unaCadena = Entrada.llegirString("Introdueix una cadena de text:");
        System.out.println("La cadena de text introduïda és: " + unaCadena);

        // Ejemplo para llegirSiNo
        boolean siNo = Entrada.llegirSiNo("Introdueix 's' per Sí o 'n' per No:");
        System.out.println("Has introduït: " + (siNo ? "Sí" : "No"));
    }
    
}
