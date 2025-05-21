package Bookstore;

public class Book {
    protected String ISBN;
    protected String title;
    protected double price;
    protected String author;

    public Book(String ISBN, String title, double price, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;

    }

    public void display() {
        System.out.println("ISBN: " + ISBN + " Title: " + title + " Price: " + price + " Author: " + author);
    }
}
