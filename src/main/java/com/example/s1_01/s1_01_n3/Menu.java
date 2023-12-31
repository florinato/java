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
            System.out.println("6.-Calcular precio y puntuacion de la noticia.");
            System.out.println("7.- Salir.");

            System.out.print("Escoge una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

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
                    calcularNoticia();
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
                    break;
            }
        } while (opcion != 7);
    }

    private void calcularNoticia() {
        noticiaService.listarNoticias();
        System.out.print("Elige el número de la noticia para ver la puntuación y el precio: ");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
    
        String[] noticiaSeleccionada = noticiaService.getNoticia(eleccion - 1);
        if (noticiaSeleccionada != null) {
            // Los dos últimos elementos son precio y puntuación
            String precio = noticiaSeleccionada[noticiaSeleccionada.length - 2];
            String puntuacion = noticiaSeleccionada[noticiaSeleccionada.length - 1];
            System.out.println("Precio de la noticia: " + precio);
            System.out.println("Puntuación de la noticia: " + puntuacion);
        } else {
            System.out.println("Noticia no encontrada.");
        }
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
        //scanner.nextLine(); // Consumir el salto de línea restante

        switch (opcionDeporte) {
            case "1":
                System.out.println("Crear una nueva noticia de Fútbol:");
                NoticiaFutbol nuevaNoticiaFutbol = new NoticiaFutbol();
                String[] datosNoticiaFutbol = nuevaNoticiaFutbol.crearNoticia(scanner);
                noticiaService.agregarNoticia(datosNoticiaFutbol);
                break;
            case "2":
                System.out.println("Crear una nueva noticia de Basquet:");
                NoticiaBasquet nuevaNoticiaBasquet = new NoticiaBasquet();
                String[] datosNoticiaBasquet = nuevaNoticiaBasquet.crearNoticia(scanner);
                noticiaService.agregarNoticia(datosNoticiaBasquet);
                break;
            case "3":
                System.out.println("Crear una nueva noticia de Motciclismo:");
                NoticiaMotociclismo nuevaNoticiaMotos = new NoticiaMotociclismo();
                String[] datosNoticiaMotos = nuevaNoticiaMotos.crearNoticia(scanner);
                noticiaService.agregarNoticia(datosNoticiaMotos);
                break;
            case "4":
                System.out.println("Crear una nueva noticia de Tenis:");
                NoticiaTenis nuevaNoticiaTenis = new NoticiaTenis();
                String[] datosNoticiatenis = nuevaNoticiaTenis.crearNoticia(scanner);
                noticiaService.agregarNoticia(datosNoticiatenis);
                break;
            case "5":
                System.out.println("Crear una nueva noticia de F1:");
                NoticiaF1 nuevaNoticiaF1 = new NoticiaF1();
                String[] datosNoticiaF1 = nuevaNoticiaF1.crearNoticia(scanner);
                noticiaService.agregarNoticia(datosNoticiaF1);
                break;
            case "6":
                // Salir del submenú
                break;
            
            default:
                System.out.println("Opción no válida, por favor intenta de nuevo.");
                break;
        }
    }
    private void eliminarNoticia() {
        System.out.print("Introduce el nombre del redactor de la noticia a eliminar: ");
        String nombreRedactor = scanner.nextLine();
        noticiaService.eliminarNoticia(nombreRedactor);
    }
    private void mostrarNoticiasPorRedactor() {
        System.out.print("Introduce el nombre del redactor: ");
        String nombreRedactor = scanner.nextLine();
        noticiaService.mostrarNoticiasPorRedactor(nombreRedactor);
    }
    private void inicializarDatos() {
        // Crear y agregar algunos redactores
        redactorService.agregarRedactor(new Redactor("Juan", "1"));
        redactorService.agregarRedactor(new Redactor("Ana", "2"));

        // Crear y agregar algunas noticias
        NoticiaF1 noticia1 = new NoticiaF1("Gana Hamilton en Mónaco", "Juan", "Texto de la noticia...", "Mercedes");
        NoticiaF1 noticia2 = new NoticiaF1("Ferrari lidera entrenamientos", "Ana", "Texto de la noticia...",
                "Ferrari");
        NoticiaF1 noticia3 = new NoticiaF1("Nuevo récord de vuelta", "Carlos", "Texto de la noticia...",
                "Red Bull");
        NoticiaF1 noticia4 = new NoticiaF1("Sorpresas en la clasificación", "Laura", "Texto de la noticia...",
                "McLaren");
        noticiaService.agregarNoticia(noticia1.crearNoticia());       
        String [] datosNoticia2= noticia2. crearNoticia();
        noticiaService.agregarNoticia(datosNoticia2);
        String [] datosNoticia3= noticia3. crearNoticia();
        noticiaService.agregarNoticia(datosNoticia3);
        String [] datosNoticia4= noticia4. crearNoticia();
        noticiaService.agregarNoticia(datosNoticia4);
        
    }
}