package com.example.s1_02.s1_02_n3;

public class Butaca {
    private int numeroFila;
    private int numeroSeient;
    private String personaReserva;

    // Constructor con todos los parámetros
    public Butaca(int numeroFila, int numeroSeient, String personaReserva) {
        this.numeroFila = numeroFila;
        this.numeroSeient = numeroSeient;
        this.personaReserva = personaReserva;
    }

    // Getters
    public int getNumeroFila() {
        return numeroFila;
    }

    public int getNumeroSeient() {
        return numeroSeient;
    }

    public String getPersonaReserva() {
        return personaReserva;
    }

    // Método equals: dos butacas son iguales si tienen la misma fila y asiento
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Butaca butaca = (Butaca) obj;
        return numeroFila == butaca.numeroFila && numeroSeient == butaca.numeroSeient;
    }

    // Método toString: representación de la butaca en forma de cadena
    @Override
    public String toString() {
        return "Fila: " + numeroFila + ", Seient: " + numeroSeient + ", Persona: " + personaReserva;
    }
}
