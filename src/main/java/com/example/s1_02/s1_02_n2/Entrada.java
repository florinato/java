package com.example.s1_02.s1_02_n2;

import java.util.Scanner;


public class Entrada {
    private static Scanner scanner = new Scanner(System.in);

    public static int llegirInt(String missatge) {
        while (true) {
            System.out.println(missatge);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error de format. Introdueix un número enter.");
            }
        }

    }
    public static byte llegirByte(String missatge) {
        while (true) {
            System.out.println(missatge);
            try {
                return Byte.parseByte(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error de format. Introdueix un byte.");
            }
        }
    }

    public static float llegirFloat(String missatge) {
        while (true) {
            System.out.println(missatge);
            try {
                return Float.parseFloat(scanner.nextLine().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Error de format. Introdueix un float.");
            }
        }
    }

    public static double llegirDouble(String missatge) {
        while (true) {
            System.out.println(missatge);
            try {
                return Double.parseDouble(scanner.nextLine().replace(',', '.'));
            } catch (NumberFormatException e) {
                System.out.println("Error de format. Introdueix un double.");
            }
        }
    }

    public static char llegirChar(String missatge) {
        while (true) {
            System.out.println(missatge);
            String entrada = scanner.nextLine();
            if (entrada.length() == 1) {
                return entrada.charAt(0);
            } else {
                System.out.println("Error: Introdueix un sol caràcter.");
            }
        }
    }

    public static String llegirString(String missatge) {
        System.out.println(missatge);
        return scanner.nextLine();
    }

    public static boolean llegirSiNo(String missatge) {
        while (true) {
            System.out.println(missatge);
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                return true;
            } else if (resposta.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("Error: introdueix 's' o 'n'.");
            }
        }
    } 
    public static void main(String[] args) {
        
        byte unByte = llegirByte("Introdueix un número byte:");
        System.out.println("El número byte introduït és: " + unByte);

        // Ejemplo para llegirInt
        int unEntero = llegirInt("Introdueix un número enter:");
        System.out.println("El número enter introduït és: " + unEntero);

        // Ejemplo para llegirFloat
        float unFloat = llegirFloat("Introdueix un número float:");
        System.out.println("El número float introduït és: " + unFloat);

        // Ejemplo para llegirDouble
        double unDouble = llegirDouble("Introdueix un número double:");
        System.out.println("El número double introduït és: " + unDouble);

        // Ejemplo para llegirChar
        char unCaracter = llegirChar("Introdueix un caràcter:");
        System.out.println("El caràcter introduït és: " + unCaracter);

        // Ejemplo para llegirString
        String unaCadena = llegirString("Introdueix una cadena de text:");
        System.out.println("La cadena de text introduïda és: " + unaCadena);

        // Ejemplo para llegirSiNo
        boolean siNo = llegirSiNo("Introdueix 's' per Sí o 'n' per No:");
        System.out.println("Has introduït: " + (siNo ? "Sí" : "No"));
    }
       
}
   
    
        
    


