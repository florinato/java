package com.example.s1_01.s1_01_n1_1;

public class Main {
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
