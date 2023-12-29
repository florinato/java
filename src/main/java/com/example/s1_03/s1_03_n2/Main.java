package com.example.s1_03.s1_03_n2;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Restaurant> restaurants = new TreeSet<>();

        restaurants.add(new Restaurant("La buena mesa", 5));
        restaurants.add(new Restaurant("El chef gourmet", 4));
        restaurants.add(new Restaurant("La buena mesa", 3)); // Mismo nombre, diferente puntuación
        restaurants.add(new Restaurant("La buena mesa", 5)); // Mismo nombre y puntuación, no se añadirá

        for (Restaurant restaurant : restaurants) {
            System.out.println("Restaurant: " + restaurant.getNom() + ", Puntuación: " + restaurant.getPuntuacio());
        }
    }
}
