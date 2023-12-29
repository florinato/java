package com.example.s1_02.s1_02_n3;

public class AplicacioCine {
    public static void main(String[] args) {
        try {
            Cine cine = new Cine();
            cine.iniciar();
        } catch (Exception e) {
            System.out.println("S'ha produït un error en l'aplicació: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

