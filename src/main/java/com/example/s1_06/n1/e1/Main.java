package com.example.s1_06.n1.e1;

public class Main {
    public static void main(String[] args) {
        NoGenericMethods ejemplo = new NoGenericMethods("Texto1", "Texto2", "Texto3");

        System.out.println("Objeto1: " + ejemplo.getObjeto1());
        System.out.println("Objeto2: " + ejemplo.getObjeto2());
        System.out.println("Objeto3: " + ejemplo.getObjeto3());

        ejemplo.setObjeto1("Nuevo Texto1");
        ejemplo.setObjeto2("Nuevo Texto2");
        ejemplo.setObjeto3("Nuevo Texto3");

        System.out.println("Objeto1 modificado: " + ejemplo.getObjeto1());
        System.out.println("Objeto2 modificado: " + ejemplo.getObjeto2());
        System.out.println("Objeto3 modificado: " + ejemplo.getObjeto3());
    }
}
