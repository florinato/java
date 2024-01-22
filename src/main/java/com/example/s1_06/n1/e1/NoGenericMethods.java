package com.example.s1_06.n1.e1;

public class NoGenericMethods {
    // Variables de instancia para almacenar tres objetos del mismo tipo
    private String objeto1;
    private String objeto2;
    private String objeto3;

    // Constructor que inicializa los tres objetos
    public NoGenericMethods(String objeto1, String objeto2, String objeto3) {
        this.objeto1 = objeto1;
        this.objeto2 = objeto2;
        this.objeto3 = objeto3;
    }

    // Métodos getters para obtener los valores de los objetos
    public String getObjeto1() {
        return objeto1;
    }

    public String getObjeto2() {
        return objeto2;
    }

    public String getObjeto3() {
        return objeto3;
    }

    // Métodos setters para asignar valores a los objetos
    public void setObjeto1(String objeto1) {
        this.objeto1 = objeto1;
    }

    public void setObjeto2(String objeto2) {
        this.objeto2 = objeto2;
    }

    public void setObjeto3(String objeto3) {
        this.objeto3 = objeto3;
    }

    
}

