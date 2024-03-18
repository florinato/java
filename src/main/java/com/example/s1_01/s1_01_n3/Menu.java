package com.example.s1_01.s1_01_n3;

import java.util.Scanner;

public class Menu {
    private RedactorService redactorService;
    private NoticiaService noticiaService;
    private Scanner scanner;

    public Menu() {
        this.redactorService = new RedactorService();
        this.noticiaService = new NoticiaService();
        this.scanner = new Scanner(System.in);
        inicializarDatos();
    }
    
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("1.- Introducir redactor.");
            System.out.println("2.- Eliminar redactor.");
            System.out.println("3.- Introducir noticia.");
            System.out.println("4.- Eliminar noticia.");
            System.out.println("5.- Mostrar todas las noticias por redactor.");
            System.out.println("6.-Calcular  puntuacion de la noticia.");
            System.out.println("7.-Calcular  precio de la noticia.");
            System.out.println("8.- Salir.");

            System.out.print("Escoge una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:

                    agregarRedactor();
        
                    break;
                case 2:
                    eliminarRedactor();
                    break;
                case 3:
                    introducirNoticia();
                    break;
                case 4:
                    eliminarNoticia();
                    break;
                case 5:
                    mostrarNoticiasPorRedactor();
                    break;
                case 6:
                    calcularPuntuacionNoticia();
                    break;
                case 7:
                    calcularPrecioNoticia();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo");
                    break;
            }
        } while (opcion != 8);
    }

    private void calcularPrecioNoticia() {
        noticiaService.listarNoticias();
        System.out.print("Elige el número de la noticia para ver el precio: ");
        int eleccion = scanner.nextInt();
        scanner.nextLine();
        Noticia noticiaSeleccionada = noticiaService.getNoticia(eleccion - 1);
        if (noticiaSeleccionada == null) {
            System.out.println("Noticia no encontrada");
            return;
        }
        double precio = noticiaSeleccionada.calcularPrecioNoticia();
        System.out.println("El precio de la noticia es: " + precio);
    }
    
    private void calcularPuntuacionNoticia() {
        noticiaService.listarNoticias();
        System.out.print("Elige el número de la noticia para ver la puntuación");
        int eleccion = scanner.nextInt();
        scanner.nextLine();
        Noticia noticiaSeleccionada = noticiaService.getNoticia(eleccion - 1);
        if (noticiaSeleccionada == null) {
            System.out.println("Noticia no encontrada o elección fuera de rango");
            return;
        }
        int puntuacion = noticiaSeleccionada.calcularPuntuacion();
        System.out.println("La puntuación de la noticia es: " + puntuacion);
    }
    

    private void agregarRedactor() {
        System.out.println("Lista de redactores antes de añadir uno nuevo:");
        redactorService.mostrarRedactores();
    
        System.out.print("Introduce el nombre del redactor: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduce el DNI del redactor: ");
        String dni = scanner.nextLine();
    
        Redactor nuevoRedactor = new Redactor(nombre, dni);
        redactorService.agregarRedactor(nuevoRedactor);
    
        System.out.println("Redactor añadido exitosamente.");
        System.out.println("Lista de redactores después de añadir uno nuevo:");
        redactorService.mostrarRedactores();
    }
    
    private void eliminarRedactor() {
        System.out.println("Lista de redactores antes de eliminar:");
        redactorService.mostrarRedactores();
    
        System.out.print("Introduce el nombre del redactor a eliminar: ");
        String nombre = scanner.nextLine();
    
        if (redactorService.eliminarRedactorPorNombre(nombre)) {
            System.out.println("Redactor eliminado exitosamente.");
        } else {
            System.out.println("No se encontró un redactor con ese nombre.");
        }
    
        System.out.println("Lista de redactores después de eliminar:");
        redactorService.mostrarRedactores();
    }
    
    private void introducirNoticia() {
        System.out.println("Selecciona el tipo de deporte para la noticia:");
        System.out.println("1. Fútbol");
        System.out.println("2. Básquet");
        System.out.println("3. Motociclismo");
        System.out.println("4. Tenis");
        System.out.println("5. F1");
        System.out.println("6. Salir");
    
        System.out.print("Elige una opción: ");
        String opcionDeporte = scanner.nextLine();
    
        Noticia nuevaNoticia;
    
        switch (opcionDeporte) {
            case "1":
                System.out.println("Crear una nueva noticia de Fútbol:");
                nuevaNoticia = new NoticiaFutbol().crearNoticia();
                break;
            case "2":
                System.out.println("Crear una nueva noticia de Basquet:");
                nuevaNoticia = new NoticiaBasquet().crearNoticia();
                break;
            case "3":
                System.out.println("Crear una nueva noticia de Motociclismo:");
                nuevaNoticia = new NoticiaMotociclismo().crearNoticia();
                break;
            case "4":
                System.out.println("Crear una nueva noticia de Tenis:");
                nuevaNoticia = new NoticiaTenis().crearNoticia();
                break;
            case "5":
                System.out.println("Crear una nueva noticia de F1:");
                nuevaNoticia = new NoticiaF1().crearNoticia();
                break;
            case "6":
                return;
            default:
                System.out.println("Opción no válida, por favor intenta de nuevo.");
                return;
        }
    
        if (nuevaNoticia != null) {
            noticiaService.agregarNoticia(nuevaNoticia);
        } else {
            System.out.println("Hubo un problema al crear la noticia.");
        }
    }
    
    private void eliminarNoticia() {
        System.out.print("Introduce el nombre del redactor de la noticia a eliminar: ");
        
        noticiaService.listarYEliminarNoticia();
    }
    private void mostrarNoticiasPorRedactor() {
        System.out.print("Introduce el nombre del redactor: ");
        String nombreRedactor = scanner.nextLine();
        noticiaService.mostrarNoticiasPorRedactor(nombreRedactor);
    }
    public void inicializarDatos() {
        redactorService.agregarRedactor(new Redactor("Juan", "1"));
        redactorService.agregarRedactor(new Redactor("Ana", "2"));

        NoticiaF1 noticia1 = new NoticiaF1("Juan","Gana Hamilton en Mónaco",  "Texto de la noticia...", "Mercedes");
        noticiaService.agregarNoticia(noticia1);
        
        NoticiaF1 noticia2 = new NoticiaF1("Ana","Ferrari lidera entrenamientos",  "Texto de la noticia...","Ferrari");
        noticiaService.agregarNoticia(noticia2);
        
        NoticiaF1 noticia3 = new NoticiaF1("Carlos","Nuevo récord de vuelta",  "Texto de la noticia...","Red Bull");
        noticiaService.agregarNoticia(noticia3);
        
        NoticiaF1 noticia4 = new NoticiaF1("Laura","Sorpresas en la clasificación",  "Texto de la noticia...","McLaren");
        noticiaService.agregarNoticia(noticia4);
        
        NoticiaBasquet noticiaBasquet1 = new NoticiaBasquet( "Roberto","Gana Lakers en el último segundo",  "Texto de la noticia...", "Lakers", "NBA");
        noticiaService.agregarNoticia(noticiaBasquet1);

        NoticiaBasquet noticiaBasquet2 = new NoticiaBasquet( "Maria","Triple doble de LeBron James",  "Texto de la noticia...", "Lakers", "liga");
        noticiaService.agregarNoticia(noticiaBasquet2);

        NoticiaFutbol noticiaFutbol1 = new NoticiaFutbol("Juan", "Barça gana el clásico", "Texto de la noticia...", "La Liga", "Barça", "Ferran Torres");
        noticiaService.agregarNoticia(noticiaFutbol1);

        NoticiaFutbol noticiaFutbol2 = new NoticiaFutbol("Ana", "Remontada épica del Madrid", "Texto de la noticia...", "Champions League", "Madrid", "Benzema");
        noticiaService.agregarNoticia(noticiaFutbol2);

        NoticiaMotociclismo noticiaMoto1 = new NoticiaMotociclismo( "Pedro", "Honda domina las prácticas", "Texto de la noticia...", "Honda", "Marquez");
        noticiaService.agregarNoticia(noticiaMoto1);

        NoticiaMotociclismo noticiaMoto2 = new NoticiaMotociclismo("Lucía", "Yamaha sorprende en la clasificación", "Texto de la noticia...", "Yamaha", null);
        noticiaService.agregarNoticia(noticiaMoto2);

        NoticiaTenis noticiaTenis1 = new NoticiaTenis( "Alejandro", "Duelo épico en Wimbledon", "Texto de la noticia...", "Wimbledon", "Nadal");
        noticiaService.agregarNoticia(noticiaTenis1);

        NoticiaTenis noticiaTenis2 = new NoticiaTenis("Carmen", "Sorpresas en el Abierto de Australia", "Texto de la noticia...", "Grand Slam", "Murray");
        noticiaService.agregarNoticia(noticiaTenis2);

    }
}