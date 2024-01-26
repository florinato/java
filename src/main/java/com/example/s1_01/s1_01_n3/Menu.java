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
                    calcularPuntuacionNoticia();
                    break;
                case 7:
                    calcularPrecioNoticia();
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intenta de nuevo.");
                    break;
            }
        } while (opcion != 8);
    }

    private void calcularPrecioNoticia() {
        noticiaService.listarNoticias();
        System.out.print("Elige el número de la noticia para ver el precio: ");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        double precio;
        String[] noticiaSeleccionada = noticiaService.getNoticia(eleccion - 1);
         

        switch (noticiaSeleccionada[0]) {
            case "Futbol":
                NoticiaFutbol noticiaFutbol = new NoticiaFutbol(
                    noticiaSeleccionada[0], 
                    noticiaSeleccionada[1], 
                    noticiaSeleccionada[2], 
                    noticiaSeleccionada[3],
                    noticiaSeleccionada[4],
                    noticiaSeleccionada[5],
                    noticiaSeleccionada[6]
                    
                );
                precio =  noticiaFutbol.calcularPrecioNoticia();
                break;
            case "Tenis":
                NoticiaTenis noticiaTenis = new NoticiaTenis(
                    noticiaSeleccionada[0], 
                    noticiaSeleccionada[1], 
                    noticiaSeleccionada[2], 
                    noticiaSeleccionada[3],
                    noticiaSeleccionada[4], 
                    noticiaSeleccionada[5]    
                );
                precio = noticiaTenis.calcularPrecioNoticia();
                break;
            case "F1":
                NoticiaF1 noticiaF1 = new NoticiaF1(
                    noticiaSeleccionada[0], 
                    noticiaSeleccionada[1], 
                    noticiaSeleccionada[2], 
                    noticiaSeleccionada[3],
                    noticiaSeleccionada[4]
                );
                precio = noticiaF1.calcularPrecioNoticia();
                break;
            case "Motociclismo":
                NoticiaMotociclismo noticiaMotociclismo = new NoticiaMotociclismo(
                    noticiaSeleccionada[0], 
                    noticiaSeleccionada[1], 
                    noticiaSeleccionada[2], 
                    noticiaSeleccionada[3],
                    noticiaSeleccionada[4]
                );
                precio = noticiaMotociclismo.calcularPrecioNoticia();
                break;
            case "Basquet":
                NoticiaBasquet noticiaBasquet = new NoticiaBasquet(
                    noticiaSeleccionada[0], 
                    noticiaSeleccionada[1], 
                    noticiaSeleccionada[2], 
                    noticiaSeleccionada[3],
                    noticiaSeleccionada[4],
                    noticiaSeleccionada[5]
                );
                precio = noticiaBasquet.calcularPrecioNoticia();
                break;
            default:
                System.out.println("Tipo de noticia no reconocido");
                return;
        }
        
        System.out.println("La precio de la noticia es: " + precio);
        
    }
        
    

    private void calcularPuntuacionNoticia() {
        noticiaService.listarNoticias();
        System.out.print("Elige el número de la noticia para ver la puntuación y el precio: ");
        int eleccion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        int puntuacion;
        String[] noticiaSeleccionada = noticiaService.getNoticia(eleccion - 1);
         

        switch (noticiaSeleccionada[0]) {
            case "Futbol":
                NoticiaFutbol noticiaFutbol = new NoticiaFutbol(
                    noticiaSeleccionada[0], 
                    noticiaSeleccionada[1], 
                    noticiaSeleccionada[2], 
                    noticiaSeleccionada[3],
                    noticiaSeleccionada[4],
                    noticiaSeleccionada[5],
                    noticiaSeleccionada[6]
                    
                );
                puntuacion = noticiaFutbol.calcularPuntuacion();
                break;
            case "Tenis":
                NoticiaTenis noticiaTenis = new NoticiaTenis(
                    noticiaSeleccionada[0], 
                    noticiaSeleccionada[1], 
                    noticiaSeleccionada[2], 
                    noticiaSeleccionada[3],
                    noticiaSeleccionada[4], 
                    noticiaSeleccionada[5]
                );
                puntuacion = noticiaTenis.calcularPuntuacion();
                break;
            case "F1":
                NoticiaF1 noticiaF1 = new NoticiaF1(
                    noticiaSeleccionada[0], 
                    noticiaSeleccionada[1], 
                    noticiaSeleccionada[2], 
                    noticiaSeleccionada[3],
                    noticiaSeleccionada[4]
                );
                puntuacion = noticiaF1.calcularPuntuacion();
                break;
            case "Motociclismo":
                NoticiaMotociclismo noticiaMotociclismo = new NoticiaMotociclismo(
                    noticiaSeleccionada[0], 
                    noticiaSeleccionada[1], 
                    noticiaSeleccionada[2], 
                    noticiaSeleccionada[3],
                    noticiaSeleccionada[4]
                );
                puntuacion = noticiaMotociclismo.calcularPuntuacion();
                break;
            case "Basquet":
                NoticiaBasquet noticiaBasquet = new NoticiaBasquet(
                    noticiaSeleccionada[0], 
                    noticiaSeleccionada[1], 
                    noticiaSeleccionada[2], 
                    noticiaSeleccionada[3],
                    noticiaSeleccionada[4],
                    noticiaSeleccionada[5]
                );
                puntuacion = noticiaBasquet.calcularPuntuacion();
                break;
            default:
                System.out.println("Tipo de noticia no reconocido");
                return;
        }
        
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
        
        noticiaService.listarYEliminarNoticia();
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
        NoticiaF1 noticia1 = new NoticiaF1("F1","Gana Hamilton en Mónaco", "Juan", "Texto de la noticia...", "Mercedes");
        noticiaService.agregarNoticia(noticia1.crearNoticia());
        
        NoticiaF1 noticia2 = new NoticiaF1("F1","Ferrari lidera entrenamientos", "Ana", "Texto de la noticia...","Ferrari");
        noticiaService.agregarNoticia(noticia2.crearNoticia());        
        
        NoticiaF1 noticia3 = new NoticiaF1("F1","Nuevo récord de vuelta", "Carlos", "Texto de la noticia...","Red Bull");
        noticiaService.agregarNoticia(noticia3. crearNoticia());
        
        NoticiaF1 noticia4 = new NoticiaF1("F1","Sorpresas en la clasificación", "Laura", "Texto de la noticia...","McLaren");
        noticiaService.agregarNoticia(noticia4. crearNoticia());
        
        NoticiaBasquet noticiaBasquet1 = new NoticiaBasquet("Basquet", "Gana Lakers en el último segundo", "Roberto", "Texto de la noticia...", "Lakers", "NBA");
        noticiaService.agregarNoticia(noticiaBasquet1.crearNoticia());

        NoticiaBasquet noticiaBasquet2 = new NoticiaBasquet("Basquet", "Triple doble de LeBron James", "Maria", "Texto de la noticia...", "Lakers", "liga");
        noticiaService.agregarNoticia(noticiaBasquet2.crearNoticia());

        NoticiaFutbol noticiaFutbol1 = new NoticiaFutbol("Fútbol", "Juan", "Barça gana el clásico", "Texto de la noticia...", "La Liga", "Barça", "Ferran Torres");
        noticiaService.agregarNoticia(noticiaFutbol1.crearNoticia());

        NoticiaFutbol noticiaFutbol2 = new NoticiaFutbol("Fútbol", "Ana", "Remontada épica del Madrid", "Texto de la noticia...", "Champions League", "Madrid", "Benzema");
        noticiaService.agregarNoticia(noticiaFutbol2.crearNoticia());

        NoticiaMotociclismo noticiaMoto1 = new NoticiaMotociclismo("Motociclismo", "Pedro", "Honda domina las prácticas", "Texto de la noticia...", "Honda");
        noticiaService.agregarNoticia(noticiaMoto1.crearNoticia());

        NoticiaMotociclismo noticiaMoto2 = new NoticiaMotociclismo("Motociclismo", "Lucía", "Yamaha sorprende en la clasificación", "Texto de la noticia...", "Yamaha");
        noticiaService.agregarNoticia(noticiaMoto2.crearNoticia());

        NoticiaTenis noticiaTenis1 = new NoticiaTenis("Tenis", "Alejandro", "Duelo épico en Wimbledon", "Texto de la noticia...", "Wimbledon", "Nadal");
        noticiaService.agregarNoticia(noticiaTenis1.crearNoticia());

        NoticiaTenis noticiaTenis2 = new NoticiaTenis("Tenis", "Carmen", "Sorpresas en el Abierto de Australia", "Texto de la noticia...", "Abierto de Australia", "Murray");
        noticiaService.agregarNoticia(noticiaTenis2.crearNoticia());

    }
}