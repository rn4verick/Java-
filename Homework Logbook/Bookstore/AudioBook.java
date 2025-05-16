package Bookstore;

public class AudioBook  extends Book{
    int durationMinutes;
    String narrator;

    public AudioBook(String ISBN, String title, double price, String author, int durationMinutes, String narrtor) {
        super(ISBN, title, price, author);
        this.durationMinutes = durationMinutes;
        this.narrator = narrtor;
    }

    public void display() {
        super.display();
        System.out.println("Type: Audiobook");
        System.out.println("Duration: " + durationMinutes + " minutes");
        System.out.println("Narrator: " + narrator);
        System.out.println();
    }
}
