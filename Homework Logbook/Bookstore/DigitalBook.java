package Bookstore;

public class DigitalBook extends Book{
    int sizeKB;

    public DigitalBook(String ISBN, String title, double price, String author, int sizeKB) {
        super(ISBN, title, price, author);
        this.sizeKB = sizeKB;
    }

    public void display() {
        super.display();
        System.out.println("Type: Digital Book:");
        System.out.println("File Size: " + sizeKB + " KB");
        System.out.println();
    }
}
