package CarRental;

public class Car {
    private String plateNumber;
    private String model;
    private int kilometers;
    private boolean rented;

    public Car(String plateNumber, String model, int kilometers) {
        this.plateNumber = plateNumber;
        this.model = model;
        this.kilometers = kilometers;
        this.rented = false;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getKilometers() {
        return kilometers;
    }

    public boolean isRented() {
        return rented;
    }

    public void rent() {
        rented = true;
    }

    public void returnCar(int newKm) {
        if (newKm > kilometers) {
            kilometers = newKm;
        }
        rented = false;
    }

    public void display() {
        System.out.println("Plate: " + plateNumber +" Model: " + model + " Kilometers: " + kilometers + " Rented: " + (rented ? "Yes" : "No" ));

    }
}
