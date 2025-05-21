package Bookstore;

public class PrintedBook extends Book {
    boolean isHardcover;
    int pages;
    String publisher;
    int availableCopies;

    public PrintedBook(String ISBN, String title, double price, String author, boolean isHardcover, int pages, String publisher, int availableCopies) {
        super(ISBN, title, price, author);
        this.isHardcover = isHardcover;
        this.pages = pages;
        this.publisher = publisher;
        this.availableCopies = availableCopies;
    }
    public void display() {
        super.display();
        System.out.println("Printed - " + (isHardcover ? "Hardcover" : "Paperback")
                + ", Pages: " + pages + ", Publisher: "
                + publisher + ", Available Copies: " + availableCopies);
        System.out.println();

    }
}

