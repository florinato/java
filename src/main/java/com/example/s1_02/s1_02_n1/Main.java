package com.example.s1_02.s1_02_n1;

public class Main {
    public static void main(String[] args) {
        
        Venda venda = new Venda();
        //venda.afegirProducte(new Producte("Manzana", 0.99));
        //venda.afegirProducte(new Producte("Pera", 0.98));
        try {
            venda.calcularTotal();
            
        } catch (VendaBuidaException e) {
            
            e.printStackTrace();
        }
        System.out.println("Preu total de la venda: " + venda.getPreuTotal());    

            
            
           
       
    }
}

