Pet Class defines the pet object with two private attributes: 
species: the type of pet
name: the name of the pet

Methods:
'getSpecies(): returns the species of the pet
'getName(): returns the name of the pet

PetClinic Class is the main application:
Creates an array of 10 pets
Takes user input for a pet type
Loops through the array and prints all the names that match the species
Prints the total number of matching pets.

Key Logic:
Scanner in = new Scanner(System.in);
Strying type = in.nextLine().trim();
- Prompts the user to enter a pet type

for (pet pet : pets) {
    if (pet.getSpecies().equals(type)) {
        System.out.println(pet.getName() + "-");
        count++;
    }
}

Loops through the list and prints the names of matching pets while also counting them.

