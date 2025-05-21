package AnimalGame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class AnimalSchoolGame extends JFrame {


    private JLabel imageLabel;
    private JTextField inputField;
    private JLabel feedbackLabel;
    private JButton nextButton;


    private String[] imageFiles = {
            "cat.jpg",
            "dog.jpg",
            "monkey.jpg"
    };


    private int currentIndex = -1;

    public AnimalSchoolGame() {

        setTitle("Animal Letter Game");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());


        imageLabel = new JLabel();
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);


        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(3, 1));


        inputField = new JTextField();
        inputField.setHorizontalAlignment(JTextField.CENTER);
        inputField.setFont(new Font("Arial", Font.PLAIN, 20));
        inputField.addActionListener(new CheckAnswerListener());
        bottomPanel.add(new JLabel("Enter the first letter of the animal:"));
        bottomPanel.add(inputField);


        feedbackLabel = new JLabel("", SwingConstants.CENTER);
        bottomPanel.add(feedbackLabel);

        add(bottomPanel, BorderLayout.SOUTH);


        nextButton = new JButton("Next Animal");
        nextButton.addActionListener(e -> showRandomImage());
        add(nextButton, BorderLayout.NORTH);


        showRandomImage();

        setVisible(true);
    }


    private void showRandomImage() {
        inputField.setText("");
        feedbackLabel.setText("");

        Random rand = new Random();
        currentIndex = rand.nextInt(imageFiles.length);


        ImageIcon icon = new ImageIcon(getClass().getResource("/images/" + imageFiles[currentIndex]));


        Image img = icon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        icon = new ImageIcon(img);


        imageLabel.setIcon(icon);
    }


    private class CheckAnswerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = inputField.getText().trim().toLowerCase();
            if (input.length() != 1) {
                feedbackLabel.setText("Enter only one letter.");
                return;
            }


            String correctLetter = imageFiles[currentIndex].substring(0, 1).toLowerCase();


            if (input.equals(correctLetter)) {
                feedbackLabel.setText("Correct Answer");
            } else {
                feedbackLabel.setText("Wrong, Try Again.");
            }
        }
    }


    public static void main(String[] args) {
        new AnimalSchoolGame();
    }
}



