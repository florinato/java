package com.example.s1_01.s1_01_n3;
public abstract class Noticia {
    protected String titular;
    protected String redactor;
    protected String texto;

    public Noticia(){
            
    }
    public Noticia(String titular, String redactor,String texto) {
        this.titular = titular;
        this.redactor = redactor;
        this.texto=texto;
    }
    @Override
    public String toString() {
        return "titular=" + titular + ", redactor=" + redactor + ", texto=" + texto ;
    }
    public String getRedactor() {
        return redactor;
    }
    public abstract int calcularPuntuacion();

    public abstract double calcularPrecioNoticia();

    public abstract Noticia crearNoticia();
    
    public abstract Noticia crearNoticia(String titular, String redactor);
}


