package InventorySystem;

public class Grocery {
    String name;
    double price;
    double weight;
    String expirationDate;

    public Grocery(String name, double price, double weight, String expirationDate) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.expirationDate = expirationDate;
    }
    public String getDetails() {
        return "Grocery - Name: " + name + ", Price: " + price + ", Weight: " + weight + ", Expiration: " + expirationDate;
    }

}
