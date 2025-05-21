package InventorySystem;

public class Electronics {
    String name;
    double price;
    String brand;
    int warranty;

    public Electronics(String name, double price, String brand, int warranty) {
        this.name = name;
        this.price = price;
        this.brand = brand;
        this.warranty = warranty;
    }

    public String getDetails() {
        return "Electronics - Name: " + name + ", Price: " + price + ", Brand: " + brand + ", Warranty: " + warranty +" months";
    }
}
