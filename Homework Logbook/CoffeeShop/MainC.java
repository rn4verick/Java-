package CoffeeShop;
import java.util.Scanner;
import java.util.ArrayList;

public class MainC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Order");
            System.out.println("2. View orders of a date");
            System.out.println("3. View total amount of a customer");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter customer's name: ");
                String name = sc.nextLine();
                System.out.print("Enter amount: ");
                double amount = sc.nextDouble();
                sc.nextLine(); // consume newline
                System.out.print("Enter date (yyyy/mm/dd): ");
                String date = sc.nextLine();
                orders.add(new Order(name, amount, date));
                System.out.println("Order added.\n");
            } else if (choice == 2) {
                System.out.print("Enter date (yyyy/mm/dd): ");
                String date = sc.nextLine();
                for (Order o : orders) {
                    if (o.date.equals(date)) {
                        System.out.println("Customer: " + o.name + ", Amount: " + o.amount);
                    }
                }
                System.out.println();
            } else if (choice == 3) {
                System.out.print("Enter customer name: ");
                String name = sc.nextLine();
                double total = 0;
                for (Order o : orders) {
                    if (o.name.equalsIgnoreCase(name)) {
                        total += o.amount;
                    }
                }
                System.out.println("Total amount: " + total + "\n");
            } else if (choice == 0) {
                break;
            } else {
                System.out.println("Invalid choice.\n");
            }
        }

        sc.close();
    }
}

