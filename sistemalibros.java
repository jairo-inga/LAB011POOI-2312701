package semana15pooi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class sistemalibros {

    public static void main(String[] args) {
        
        List<Book> books = new ArrayList<>();
        
        
    }

}

class Author {

    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return name + " (" + gender + ") at " + email;
    }

}

class Book {

    private String name;
    private Author author;
    private double price;  
    private int qty;

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "'" + name + "' by " + author + " at " + price + "€";
    }




public static void printBooks(List<Book> books) {
    for (Book book : books) {
        System.out.println(book);
    }
}

public static void addBook(List<Book> books, String name, Author author, double price, int qty) {
    books.add(new Book(name, author, price, qty));  
}

public static void removeBook(List<Book> books, String name) {
    books.removeIf(book -> book.getName().equals(name));
}

private Object getName() {
	return null;
}

public static void editBook(List<Book> books, String oldName, String newName, Author newAuthor, double newPrice, int newQty) {
   
} 

public static Book findBookByTitle(List<Book> books, String title) {
   
}

public static Author findAuthorByBook(List<Book> books, String title) {
  
}

public static void sortBooksByAuthor(List<Book> books) {
	books.sort(Comparator.comparing(book -> book.getAuthor()));
}
}



