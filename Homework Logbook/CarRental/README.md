Car Class represents a car with the following properties:
- plateNumber - Unique id for the car
- model - Car's model
- kilometers - kilometers
- rented - Boolean indicating if the car is rented

Methods:
- getPlateNumber() – Returns the plate number.
- getKilometers() – Returns current kilometers.
- isRented() – Checks rental status.
- rent() – Marks the car as rented.
- returnCar(newKm) – Updates the kilometers and marks it as available.
- display() – Prints the car's full details.

CarRental is the main class which is the entry point of the program, it uses a menu loop to allow user interaction

Menu Options:
1. **Rent a Car**
   - Prompts user for a plate number.
   - Checks if the car exists and is available.
   - Marks it as rented if valid.

2. **Return a Car**
   - Prompts user for a plate number and new kilometer reading.
   - Updates car status and odometer if the return is valid.

3. **Display Cars**
   - Lists all cars with their current status and details.

4. **Exit**
   - Safely exits the program.
  
   
