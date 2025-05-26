Order Class is a data model class that represents a customer's order.

Fields:
- String name: Customer's name
- double amount: Order amount
- String date: Date of the order in yyyy/mm/dd format

Constructor:
Order(String name, double amount, String date)

Creates an order with the customer's name, amount and date.

MainC Class is the main class that handles the user interaction.
It stores orders in an Array List, provides a menu for user interaction 
and processes user input to manage and view order date.

Scanner sc = new Scanner(System.in);
ArrayList<Order> orders = new ArrayList<>();

- Scanner is used for user input and ArrayList<Order> orders holds all orders created

1. Add Order
2. View orders of a date
3. View total amount of a customer
0. Exit
The user sees this menu in each loop.
Then the program reads the user's input:
int choice = sc.nextInt();
sc.nextLine();

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
}

The user enters the customer's name, order amount and date.
A new Order object is created and added to the list.

else if (choice == 2) {
    System.out.print("Enter date (yyyy/mm/dd): ");
    String date = sc.nextLine();

    for (Order o : orders) {
        if (o.date.equals(date)) {
            System.out.println("Customer: " + o.name + ", Amount: " + o.amount);
        }
    }
    System.out.println();
}

Prompts for a date then loops through all orders.
If the order ddate matches the input, it prnits that order's customer and amount.

else if (choice == 3) {
    System.out.print("Enter customer name: ");
    String name = sc.nextLine();
    double total = 0;

    for (Order o : orders) {
        if (o.name.equalsIgnoreCase(name)) {
            total += o.amount;
        }
    }

    System.out.println("Total amount: " + total + "\n");
}
Prompts for a customer's name
Loops through all orders and adds up the amounts for that customer.

else if (choice == 0) {
    break;
}
 breaks the loop and ends the program

 else {
    System.out.println("Invalid choice.\n");
}
If the input is not 0-3, shows an error message



