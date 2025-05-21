package InventorySystem;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class InventorySystem {

    static Scanner sc = new Scanner(System.in);
    static List<Electronics> electronicsList = new ArrayList<>();
    static List<Clothing> clothingList = new ArrayList<>();
    static List<Grocery> groceryList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Add Product");
            System.out.println("2. Search Product");
            System.out.println("3. Modify Product");
            System.out.println("4. Display All Products");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            String choice = sc.nextLine();

            switch (choice) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    searchProduct();
                    break;
                case "3":
                    modifyProduct();
                    break;
                case "4":
                    displayAll();
                    break;
                case "5":
                    System.out.println("Exiting System");
                    return;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }

    static void addProduct() {
        System.out.println("Choose category: 1. Electronics 2. Clothing 3. Grocery");
        String category = sc.nextLine();
        System.out.println("Enter product name: ");
        String name = sc.nextLine();
        System.out.println("Enter product price: ");
        double price = Double.parseDouble(sc.nextLine());

        if (category.equals("1")) {
            System.out.println("Enter brand name: ");
            String brand = sc.nextLine();
            System.out.println("Enter warranty period: ");
            int warrantyPeriod = Integer.parseInt(sc.nextLine());
            electronicsList.add(new Electronics(name, price, brand, warrantyPeriod));
        }
        else if (category.equals("2")) {
            System.out.println("Enter sizes: ");
            String size = sc.nextLine();
            System.out.println("Enter material: ");
            String material = sc.nextLine();
            System.out.println("Enter color: ");
            String color = sc.nextLine();
            clothingList.add(new Clothing(name, price, size, material, color));
        }
        else if (category.equals("3")) {
            System.out.println("Enter weight: ");
            double weight = Double.parseDouble(sc.nextLine());
            System.out.println("Enter expiration date: ");
            String expirationDate = sc.nextLine();
            groceryList.add(new Grocery(name, price, weight, expirationDate));
        }
        else {
            System.out.println("Invalid choice");
        }
    }

    static void searchProduct() {
        System.out.println("Enter product name: ");
        String searchName = sc.nextLine().toLowerCase();

        boolean found = false;

        for (Electronics electronics : electronicsList) {
            if (electronics.name.toLowerCase().contains(searchName)) {
                System.out.println(electronics.getDetails());
                found = true;
            }
        }

        for (Clothing clothing : clothingList) {
            if (clothing.name.toLowerCase().equals(searchName)) {
                System.out.println(clothing.getDetails());
                found = true;
            }
        }

        for (Grocery grocery : groceryList) {
            if (grocery.name.toLowerCase().equals(searchName)) {
                System.out.println(grocery.getDetails());
                found = true;
            }
        }

        if (!found) {
            System.out.println("Product not found");
        }
    }

    static void modifyProduct() {
        System.out.println("Enter product name: ");
        String modifyName = sc.nextLine().toLowerCase();

        for (Electronics electronics : electronicsList) {
            if (electronics.name.toLowerCase().equals(modifyName)) {
                System.out.println("Enter new price: ");
                electronics.price = Double.parseDouble(sc.nextLine());
                System.out.println("Updated: " + electronics.getDetails());
                return;
            }
        }

        for (Clothing clothing : clothingList) {
            if (clothing.name.toLowerCase().equals(modifyName)) {
                System.out.println("Enter new price: ");
                clothing.price = Double.parseDouble(sc.nextLine());
                return;
            }
        }
        for (Grocery grocery : groceryList) {
            if (grocery.name.toLowerCase().equals(modifyName)) {
                System.out.println("Enter new price: ");
                grocery.price = Double.parseDouble(sc.nextLine());
                System.out.println("Updated: " + grocery.getDetails());
                return;
            }
        }
        System.out.println("Product not found");
    }

    static void displayAll() {

        for (Electronics electronics : electronicsList) {
            System.out.println(electronics.getDetails());
        }

        for (Clothing clothing : clothingList) {
            System.out.println(clothing.getDetails());
        }

        for (Grocery grocery : groceryList) {
            System.out.println(grocery.getDetails());
        }
    }
}
