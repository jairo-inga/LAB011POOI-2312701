package semana15pooi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
    private int nro;
    private String name;
    private Author author;
    private double price;
    private int qty;

    public Book(int nro, String name, Author author, double price, int qty) {
        this.nro = nro;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public int getNro() {
        return nro;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Nro: " + nro + ", '" + name + "' by " + author.toString() + ", Price: $" + price + ", Quantity: " + qty;
    }
}


