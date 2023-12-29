package com.example.s1_03.s1_03_n1_1;

import java.util.ArrayList;
import java.util.HashSet;

public class Month {
    private String name;

    public Month(String name) {
        this.name = name;
    }

    // Getters y setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
public static void main(String[] args) {
    ArrayList<Month> months = new ArrayList<>();
    months.add(new Month("Enero"));
    months.add(new Month("Febrero"));
    months.add(new Month("Marzo"));
    months.add(new Month("Abril"));
    months.add(new Month("Mayo"));
    months.add(new Month("Junio"));
    months.add(new Month("julio"));
    months.add(new Month("Septiembre"));
    months.add(new Month("Octubre"));
    months.add(new Month("Noviembre"));
    months.add(new Month("Diciembre"));
    months.add(7, new Month("Agosto")); 
    for (Month month : months) {
        System.out.println(month.getName());
    }
    HashSet<Month> monthsSet = new HashSet<>(months);
    monthsSet.add(new Month("Agosto")); // Esto no añadirá otro "Agosto" si ya existe.
    for (Month month : months) {
        System.out.println(month.getName());
    }
}
}

