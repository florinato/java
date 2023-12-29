package com.example.s1_01.s1_01_n1_1;

// Clase Instrumento (abstracta)
abstract class Instrumento {
    String nombre;
    double precio;

    abstract void tocar();
}

// Clase InstrumentoViento que extiende de Instrumento
class InstrumentoViento extends Instrumento {
    InstrumentoViento(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    void tocar() {
        System.out.println("Està sonant un instrument de vent");
    }
}

// Clase InstrumentoCuerda que extiende de Instrumento
class InstrumentoCuerda extends Instrumento {
    InstrumentoCuerda(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    void tocar() {
        System.out.println("Està sonant un instrument de corda");
    }
}

// Clase InstrumentoPercusion que extiende de Instrumento
class InstrumentoPercusion extends Instrumento {
    InstrumentoPercusion(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    void tocar() {
        System.out.println("Està sonant un instrument de percussió");
    }
     public static void main(String[] args) {
        // Creación de una instancia de InstrumentoViento y llamada al método tocar()
        InstrumentoViento viento = new InstrumentoViento("Flauta", 100.0);
        viento.tocar(); 

        // Creación de una instancia de InstrumentoCuerda y llamada al método tocar()
        InstrumentoCuerda cuerda = new InstrumentoCuerda("Guitarra", 200.0);
        cuerda.tocar(); 

        // Creación de una instancia de InstrumentoPercusion y llamada al método tocar()
        InstrumentoPercusion percusion = new InstrumentoPercusion("Batería", 500.0);
        percusion.tocar(); 
    }
}
