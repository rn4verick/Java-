package Pet_clinic;
import java.util.Scanner;

public class Petclinic {
    public static void main(String[] args) {
        pet[] pets = new pet[10];
        pets[0] = new pet("dog", "Pluto");
        pets[1] = new pet("cat", "Nala");
        pets[2] = new pet("dog", "Zion");
        pets[3] = new pet("rabbit", "Bugs");
        pets[4] = new pet("parrot", "Rock");
        pets[5] = new pet("duck", "Donald");
        pets[6] = new pet("dog", "Kiko");
        pets[7] = new pet("cat", "Yokie");
        pets[8] = new pet("turtle", "Speedy");
        pets[9] = new pet("dog", "Eunie");

        Scanner in = new Scanner(System.in);
        System.out.println("Give Type:");
        String type = in.nextLine().trim();

        int count = 0;
        for (pet pet : pets) {
            if (pet.getSpecies().equals(type)) {
                System.out.println(pet.getName() + "-");
                count++;
            }
        }
        if (count > 0) {
            System.out.println();
        }
        System.out.println("Total animals of " + type + " type: " + count);
    }
}
