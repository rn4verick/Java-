package Assessment2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Game extends JFrame {

    private Hangman currentGame;
    private User player;

    private JLabel labelWord;
    private JTextField inputLetter;
    private JLabel wrongGuessLabel;
    private JLabel resultLabel;

    public Game(User user) {
        this.player = user;

        setTitle("Hangman Game");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        startNewGame();

        setVisible(true);
    }


    private void startNewGame() {
        String secretWord = WordFetcher.getRandomWord();
        currentGame = new Hangman(secretWord);

        getContentPane().removeAll();
        revalidate();
        repaint();

        JPanel panel = new JPanel(new GridLayout(7, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        labelWord = new JLabel(currentGame.getDisplay(), SwingConstants.CENTER);
        labelWord.setFont(new Font("Arial", Font.BOLD, 24));
        panel.add(labelWord);

        inputLetter = new JTextField();
        panel.add(inputLetter);

        JButton btnGuess = new JButton("Guess Letter");
        btnGuess.addActionListener(e -> makeGuess());
        panel.add(btnGuess);

        wrongGuessLabel = new JLabel("Wrong guesses: 0");
        panel.add(wrongGuessLabel);

        resultLabel = new JLabel("", SwingConstants.CENTER);
        panel.add(resultLabel);

        add(panel);
    }


    private void makeGuess() {
        String input = inputLetter.getText().trim().toLowerCase();

        if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
            resultLabel.setText("Please enter one letter only.");
            return;
        }

        char letter = input.charAt(0);
        boolean correct = currentGame.guess(letter);
        inputLetter.setText("");

        labelWord.setText(currentGame.getDisplay());

        if (!correct) {
            wrongGuessLabel.setText("Wrong guesses: " + currentGame.wrongCount());
        }

        if (currentGame.isWin()) {
            resultLabel.setText("🎉 You win! The word was: " + currentGame.getWord());
            player.setScore(player.getScore() + 1);
            DBManager.updateScore(player);
            showEndOptions();

        } else if (currentGame.isLose()) {
            resultLabel.setText("💀 You lose! The word was: " + currentGame.getWord());
            showEndOptions();
        }
    }


    private void showEndOptions() {
        inputLetter.setEnabled(false);

        JButton tryAgain = new JButton("Try Again");
        JButton logout = new JButton("Logout");
        JButton viewLeaderboard = new JButton("Leaderboard");

        tryAgain.addActionListener(e -> startNewGame());
        logout.addActionListener(e -> {
            dispose();
            new Login();
        });
        viewLeaderboard.addActionListener(e -> new Leaderboard());

        JPanel optionPanel = new JPanel();
        optionPanel.add(tryAgain);
        optionPanel.add(logout);
        optionPanel.add(viewLeaderboard);

        add(optionPanel);
        revalidate();
        repaint();
    }
}