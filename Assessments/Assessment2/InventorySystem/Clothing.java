package InventorySystem;

public class Clothing {
    String name;
    double price;
    String sizes;
    String material;
    String color;

    public Clothing(String name, double price, String sizes, String material, String color) {
        this.name = name;
        this.price = price;
        this.sizes = sizes;
        this.material = material;
        this.color = color;

    }

    public String getDetails() {
        return "Clothing - Name: " + name + " Size: " + sizes + " Material: " + material + " Color: " + color + " Price: " + price;

    }
}
