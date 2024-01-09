package com.example.s1_03.s1_03_n1_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MonthManager {
    private List<Month> months;

    public MonthManager() {
        months = new ArrayList<>();
        // Inicializar la lista de meses
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
    }

    public void printMonths() {
        for (Month month : months) {
            System.out.println(month.getName());
        }
    }

    public void printUniqueMonths() {
        Set<Month> uniqueMonths = new HashSet<>(months);
        for (Month month : uniqueMonths) {
            System.out.println(month.getName());
        }
    }
}





    
    
