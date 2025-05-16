package CarRental;
import java.util.Scanner;

public class CarRental {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("SE2340", "Honda NSX", 15000);
        cars[1] = new Car("CD3048", "Mazda RX7", 20000);
        cars[2] = new Car("VF2038","Honda S2K", 35000);
        cars[3] = new Car("FD3049", "Mitsubishi Evo", 50000);
        cars[4] = new Car("BZ2034", "Nissan 180SX", 10000);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Rent a Car");
            System.out.println("2. Return a Car");
            System.out.println("3. Display Cars");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter plate number to rent: ");
                    String plate = scanner.nextLine();
                    boolean found = false;
                    for (Car car : cars) {
                        if (car.getPlateNumber().equalsIgnoreCase(plate)) {
                            found = true;
                            if (!car.isRented()) {
                                car.rent();
                                System.out.println("Car rented successfully");
                            } else {
                                System.out.println("Car rented failed");
                            }
                            break;
                        }
                    }
                    if (!found) System.out.println("Car not found");
                    break;

                case 2:
                    System.out.print("Enter plate number to return: ");
                    String returnPlate = scanner.nextLine();
                    found = false;
                    for (Car car : cars) {
                        if (car.getPlateNumber().equalsIgnoreCase(returnPlate)) {
                            found = true;
                            if (car.isRented()) {
                                System.out.println("Enter new kilometers: ");
                                int newKilometers = scanner.nextInt();
                                scanner.nextLine();
                                car.returnCar(newKilometers);
                                System.out.println("Car returned and updated");
                            } else {
                                System.out.println("Car was not rented");
                            }
                            break;
                        }
                    }
                    if (!found) System.out.println("Car not found");
                    break;

                case 3:
                    System.out.print("All Cars: ");
                    for (Car car : cars) {
                        car.display();
                    }
                    break;

                    case 4:
                        System.out.println("Exiting system.");
                        break;

                        default:
                            System.out.println("Invalid choice");


            }
        }while (choice != 4);
    }
}
