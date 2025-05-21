package CoffeeShop;
import java.util.ArrayList;
import java.util.Scanner;

public class Order {
    String name;
    double amount;
    String date;

    Order(String name, double amount, String date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }
}
