package Bookstore;

public class Bookstore {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new PrintedBook("111-A", "To Kill A Mockingbird", 25.99,"Harper Lee", true, 300, "HarperCollins Publishers", 20);
        books[1] = new DigitalBook("112-S","The Tenant", 4.99, "Freida McFadden",5000 );
        books[2] = new AudioBook ("113-O","Great Big Beautiful Life", 17.72, "Emily Henry", 722,"Julia Whelan");
        books[3] = new PrintedBook ("134-W","Head First Java", 28.00, "Bert Bales, Kathy Sierra", true, 688, "O'Reilly Media, Inc,", 10);
        books[4] = new DigitalBook ("777-M", "Jujutsu Kaisen Vol 01", 10.00, "Gege Akutami",5000);

        for (Book book : books) {
        if (book instanceof PrintedBook) {
            ((PrintedBook) book).display();
        }else if (book instanceof DigitalBook) {
            ((DigitalBook) book).display();
        }else if (book instanceof AudioBook) {
            ((AudioBook) book).display();
        }else {
            book.display();
        }
        }
    }
}
