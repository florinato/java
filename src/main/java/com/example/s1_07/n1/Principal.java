package com.example.s1_07.n1;

public class Principal {
    public static void main(String[] args) {
        // Crear un trabajador online
        TreballadorOnline treballadorOnline = new TreballadorOnline("Oscar", "Programador", 20.0);
        // Crear un trabajador presencial
        TreballadorPresencial treballadorPresencial = new TreballadorPresencial("Anna", "Ingeniera", 25.0);

        // Calcular y mostrar el sueldo para un trabajador online
        int horesTreballadesOnline = 160; // Por ejemplo, 160 horas al mes
        double souOnline = treballadorOnline.calcularSou(horesTreballadesOnline);
        System.out.println("El sueldo del trabajador online es: " + souOnline);

        // Calcular y mostrar el sueldo para un trabajador presencial
        int horesTreballadesPresencial = 160; // Igualmente, 160 horas al mes
        double souPresencial = treballadorPresencial.calcularSou(horesTreballadesPresencial);
        System.out.println("El sueldo del trabajador presencial es: " + souPresencial);

        // Crear una instancia de Principal para llamar a métodos no estáticos
        Principal principal = new Principal();
        principal.usarMetodosObsoletos(treballadorOnline, treballadorPresencial);
    }

    @SuppressWarnings("deprecation")
    public void usarMetodosObsoletos(TreballadorOnline treballadorOnline, TreballadorPresencial treballadorPresencial) {
        treballadorOnline.metodoAntiguoOnline();
        treballadorPresencial.metodoAntiguoPresencial();
    }
}

