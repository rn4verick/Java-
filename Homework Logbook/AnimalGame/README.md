- The game randomly displays an image of an animal (e.g., a **cat**, **dog**, or **monkey**).
- The player is prompted to enter the first letter of the animal’s name.
- If the guess is correct, a "Correct Answer" message appears.
- If incorrect, it displays "Wrong, Try Again."
- A **"Next Animal"** button allows users to get a new random animal image and try again.

GUI Components: 
Next Animal BUtton: Fetches a random animal image from the list.
Image Display: Shows the animal picture.
TextField: User inputs first letter of animal
FeedBack Label: Display if answer is correct or wong

- Java Swing: GUI components like `JFrame`, `JLabel`, `JTextField`, `JButton`, `JPanel`
- Image Handling: Loading and scaling images using `ImageIcon`
- Event Handling: `ActionListener` for button and text field actions
- Random Selection: Randomly selects an animal image from the list
- Input Validation: Checks for valid one-letter input
