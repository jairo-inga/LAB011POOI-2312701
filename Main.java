package semana15pooi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Agregar libros
        agregarLibrosIniciales(libreria);

        do {
            mostrarMenu();
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    // Mostrar lista de libros
                    System.out.println("Lista de libros:");
                    libreria.mostrarLibros();
                    break;

                case 2:
                    // Agregar un libro
                	agregarLibroDesdeConsola (libreria, scanner);
                    break;

                case 3:
                    // Eliminar un libro
                    eliminarLibroDesdeConsola(libreria, scanner);
                    break;

                case 4:
                    // Editar un libro
                    editarLibroDesdeConsola(libreria, scanner);
                    break;

                case 5:
                    // Buscar libro por título
                    buscarLibroPorTituloDesdeConsola(libreria, scanner);
                    break;

                case 6:
                    // Buscar autor por libro
                    buscarAutorPorLibroDesdeConsola(libreria, scanner);
                    break;

                case 7:
                    // Ordenar libros por autor
                    libreria.ordenarLibrosPorAutor();
                    System.out.println("Libros ordenados por autor.");
                    break;

                case 0:
                    // Salir
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija una opción válida.");
            }
        } while (opcion != 0);

        // Cerrar el scanner
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n*** Menú ***");
        System.out.println("1. Mostrar la lista de libros.");
        System.out.println("2. Agregar un libro y asignar el autor del libro.");
        System.out.println("3. Eliminar un libro.");
        System.out.println("4. Editar un libro.");
        System.out.println("5. Buscar un libro por título.");
        System.out.println("6. Buscar el autor dado un libro.");
        System.out.println("7. Ordenar los libros por autor.");
        System.out.println("0. Salir.");
    }

    private static void agregarLibrosIniciales(Libreria libreria) {
        // Lista de libros iniciales
        String[] nombres = {
                "Cien años de soledad", "El señor de los anillos (Trilogía)", "1984",
                "Un mundo feliz", "Orgullo y prejuicio", "Crimen y castigo",
                "Lolita", "Ulises", "Madame Bovary", "En busca del tiempo perdido",
                "Don Quijote de la Mancha", "El retrato de Dorian Gray", "El Principito",
                "El ruido y la furia", "Los viajes de Gulliver", "Memorias de una geisha",
                "Los juegos del hambre", "Harry Potter y la piedra filosofal", "Los miserables",
                "Las crónicas de Narnia"
        };

        String[] autores = {
                "Gabriel García Márquez", "J. R. R. Tolkien", "George Orwell",
                "Aldous Huxley", "Jane Austen", "Fiódor Dostoyevski",
                "Vladimir Nabokov", "James Joyce", "Gustave Flaubert", "Marcel Proust",
                "Miguel de Cervantes", "Oscar Wilde", "Antoine de Saint-Exupéry",
                "William Faulkner", "Jonathan Swift", "Arthur Golden",
                "Suzanne Collins", "J. K. Rowling", "Victor Hugo", "C. S. Lewis"
        };

        double[] precios = {
                200, 1500, 500, 320, 130, 230, 140, 158, 120, 345,
                340, 125, 259, 134, 186, 195, 181, 650, 23, 456
        };

        int[] cantidades = {
                400, 1200, 300, 500, 700, 540, 456, 400, 430, 450,
                123, 67, 345, 246, 234, 234, 234, 4000, 245, 444
        };

        for (int i = 0; i < nombres.length; i++) {
            libreria.agregarLibro(i + 1, nombres[i], autores[i], precios[i], cantidades[i]);
        }
    }


    // Resto del código de las funciones como antes


    private static void agregarLibroDesdeConsola(Libreria libreria, Scanner scanner) {
        System.out.print("Ingrese el número del libro: ");
        int nro = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt()

        System.out.print("Ingrese el nombre del libro: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el autor del libro: ");
        String autor = scanner.nextLine();

        System.out.print("Ingrese el precio del libro: ");
        double precio = scanner.nextDouble();

        System.out.print("Ingrese la cantidad del libro: ");
        int cantidad = scanner.nextInt();

        libreria.agregarLibro(nro, nombre, autor, precio, cantidad);
        System.out.println("Libro agregado correctamente.");
    }


    private static void eliminarLibroDesdeConsola(Libreria libreria, Scanner scanner) {
        // Código para eliminar un libro desde la consola
        // Puedes usar scanner para obtener la información necesaria del usuario
    }

    private static void editarLibroDesdeConsola(Libreria libreria, Scanner scanner) {
        // Código para editar un libro desde la consola
        // Puedes usar scanner para obtener la información necesaria del usuario
    }

    private static void buscarLibroPorTituloDesdeConsola(Libreria libreria, Scanner scanner) {
        // Código para buscar un libro por título desde la consola
        // Puedes usar scanner para obtener la información necesaria del usuario
    }

    private static void buscarAutorPorLibroDesdeConsola(Libreria libreria, Scanner scanner) {
        // Código para buscar el autor dado un libro desde la consola
        // Puedes usar scanner para obtener la información necesaria del usuario
    }
}
