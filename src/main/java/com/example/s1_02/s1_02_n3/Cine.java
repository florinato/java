package com.example.s1_02.s1_02_n3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cine {
    private int numFiles;
    private int numSeientsPerFila;
    private GestioButaques gestioButaques;
    private Scanner scanner;

    public Cine() {
        gestioButaques = new GestioButaques();
        scanner = new Scanner(System.in);
        demanarDadesInicials();
    }

    private void demanarDadesInicials() {
        System.out.print("Introdueix el nombre de files: ");
        numFiles = scanner.nextInt();
        System.out.print("Introdueix el nombre de seients per fila: ");
        numSeientsPerFila = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer del scanner
    }

    public void iniciar() {
        int opcio;
        do {
            opcio = menu();
            switch (opcio) {
                case 1:
                    mostrarButaques();
                    break;
                case 2:
                    mostrarButaquesPersona();
                    break;
                case 3:
                    reservarButaca();
                    break;
                case 4:
                    anularReserva();
                    break;
                case 5:
                    anularReservaPersona();
                    break;
                case 0:
                    System.out.println("Sortint de l'aplicació...");
                    break;
                default:
                    System.out.println("Opció no vàlida");
                    break;
            }
        } while (opcio != 0);
    }

    private int menu() {
        System.out.println("\nMenú de l'aplicació:");
        System.out.println("1. Mostrar totes les butaques reservades.");
        System.out.println("2. Mostrar les butaques reservades per una persona.");
        System.out.println("3. Reservar una butaca.");
        System.out.println("4. Anul·lar la reserva d'una butaca.");
        System.out.println("5. Anul·lar totes les reserves d'una persona.");
        System.out.println("0. Sortir.");
        System.out.print("Escull una opció: ");
        int opcio = scanner.nextInt();
        scanner.nextLine(); // Consume el salto de línea restante
        return opcio;
        
    }
    // En la clase Cine

    public void mostrarButaques() {
        List<Butaca> butaques = gestioButaques.getButaques();
        if (butaques.isEmpty()) {
            System.out.println("No hi ha cap butaca reservada.");
        } else {
            for (Butaca butaca : butaques) {
                System.out.println(butaca);
            }
        }
    }

    public void mostrarButaquesPersona() {
        System.out.print("Introdueix el nom de la persona: ");
        String nom = scanner.nextLine();
        boolean trobat = false;
        for (Butaca butaca : gestioButaques.getButaques()) {
            if (butaca.getPersonaReserva().equalsIgnoreCase(nom)) {
                System.out.println(butaca);
                trobat = true;
            }
        }
        if (!trobat) {
            System.out.println("No hi ha reserves per a " + nom + ".");
        }
    }

    public void reservarButaca() {
        try {
            int fila = introduirFila();
            int seient = introduirSeient();
            String persona = introduirPersona();
            Butaca novaButaca = new Butaca(fila, seient, persona);
            gestioButaques.afegirButaca(novaButaca);
            System.out.println("Butaca reservada amb èxit.");
        } catch (ExcepcioButacaOcupada e) {
            System.out.println(e.getMessage());
        }
}

// Continuación de la clase Cine

    public void anularReserva() {
        try {
            int fila = introduirFila();
            int seient = introduirSeient();
            gestioButaques.eliminarButaca(fila, seient);
            System.out.println("La reserva de la butaca ha estat anul·lada.");
        } catch (ExcepcioButacaLliure e) {
            System.out.println(e.getMessage());
        }
    }

    public void anularReservaPersona() {
        String persona = introduirPersona();
        boolean reservaEliminada = false;
        List<Butaca> butaquesAEliminar = new ArrayList<>();
        for (Butaca butaca : gestioButaques.getButaques()) {
            if (butaca.getPersonaReserva().equalsIgnoreCase(persona)) {
                butaquesAEliminar.add(butaca);
                reservaEliminada = true;
            }
        }
        gestioButaques.getButaques().removeAll(butaquesAEliminar);
        if (reservaEliminada) {
            System.out.println("Totes les reserves de " + persona + " han estat anul·lades.");
        } else {
            System.out.println("No s'han trobat reserves per a " + persona + ".");
        }
}

public int introduirFila() {
    int fila;
    do {
        System.out.print("Introdueix el número de fila: ");
        fila = scanner.nextInt();
        scanner.nextLine();
        if (fila < 1 || fila > numFiles) {
            System.out.println("Número de fila incorrecte. Ha de ser entre 1 i " + numFiles + ".");
        }
    } while (fila < 1 || fila > numFiles);
    return fila;
}

public int introduirSeient() {
    int seient;
    do {
        System.out.print("Introdueix el número de seient: ");
        seient = scanner.nextInt();
        scanner.nextLine();
        if (seient < 1 || seient > numSeientsPerFila) {
            System.out.println("Número de seient incorrecte. Ha de ser entre 1 i " + numSeientsPerFila + ".");
        }
    } while (seient < 1 || seient > numSeientsPerFila);
    return seient;
}

public String introduirPersona() {
    String persona;
    System.out.print("Introdueix el nom de la persona: ");
    persona = scanner.nextLine();
    return persona;
}


    
}
