package semana15pooi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class book {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        // Agregar libros desde la lista proporcionada
        String[] bookNames = {"Cien años de soledad", "El señor de los anillos (Trilogía)", "1984", "Un mundo feliz",
                              "Orgullo y prejuicio", "Crimen y castigo", "Lolita", "Ulises", "Madame Bovary",
                              "En busca del tiempo perdido", "Don Quijote de la Mancha", "El retrato de Dorian Gray",
                              "El Principito", "El ruido y la furia", "Los viajes de Gulliver", "Memorias de una geisha",
                              "Los juegos del hambre", "Harry Potter y la piedra filosofal", "Los miserables",
                              "Las crónicas de Narnia"};

        String[] authorNames = {"Gabriel García Márquez", "J. R. R. Tolkien", "George Orwell", "Aldous Huxley",
                                "Jane Austen", "Fiódor Dostoyevski", "Vladimir Nabokov", "James Joyce", "Gustave Flaubert",
                                "Marcel Proust", "Miguel de Cervantes", "Oscar Wilde", "Antoine de Saint-Exupéry",
                                "William Faulkner", "Jonathan Swift", "Arthur Golden", "Suzanne Collins", "J. K. Rowling",
                                "Victor Hugo", "C. S. Lewis"};

        double[] prices = {200, 1500, 500, 320, 130, 230, 140, 158, 120, 345, 340, 125, 259, 134, 186, 195, 181, 650, 23, 456};

        int[] quantities = {400, 1200, 300, 500, 700, 540, 456, 400, 430, 450, 123, 67, 345, 246, 234, 234, 234, 4000, 245, 444};

        for (int i = 0; i < bookNames.length; i++) {
            Author author = new Author(authorNames[i], "email@example.com", 'M'); // Use a placeholder email and gender
            Book book = new Book(i + 1, bookNames[i], author, prices[i], quantities[i]);
            books.add(book);
        }

        // Mostrar información de los libros
        System.out.println("Lista de libros:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Crear un libro utilizando Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter details for a new book:");
        System.out.print("Enter title: ");
        String newTitle = scanner.nextLine();
        System.out.print("Enter author's name: ");
        String newAuthorName = scanner.nextLine();
        System.out.print("Enter author's email: ");
        String newAuthorEmail = scanner.nextLine();
        System.out.print("Enter author's gender (M/F): ");
        char newAuthorGender = scanner.next().charAt(0);
        System.out.print("Enter price: ");
        double newPrice = scanner.nextDouble();
        System.out.print("Enter quantity: ");
        int newQty = scanner.nextInt();

        Author newAuthor = new Author(newAuthorName, newAuthorEmail, newAuthorGender);
        Book newBook = new Book(books.size() + 1, newTitle, newAuthor, newPrice, newQty);

        // Agregar el nuevo libro a la lista
        books.add(newBook);

        // Mostrar información del nuevo libro
        System.out.println("\nNew Book Information:");
        System.out.println(newBook);

        // Mostrar información actualizada de la lista de libros
        System.out.println("\nUpdated Book List:");
        for (Book book : books) {
            System.out.println(book);
        }

        // Cerrar el escáner
        scanner.close();
    }
}