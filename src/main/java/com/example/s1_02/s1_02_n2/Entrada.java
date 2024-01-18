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
    
       
}
   
    
        
    


