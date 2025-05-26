package Assessment2;

import java.util.HashSet;
import java.util.Set;

public class Hangman {
    private String word;
    private StringBuilder display;
    private Set<Character> guessedLetters;
    private int wrongCount;
    private final int MAX_WRONG = 6;

    public Hangman(String word) {
        this.word = word.toLowerCase();
        guessedLetters = new HashSet<>();
        wrongCount = 0;

        display = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (i == 0 || i == word.length() - 1) {
                display.append(word.charAt(i));
            } else {
                display.append('-');
            }
        }
    }


    public boolean guess(char letter) {
        letter = Character.toLowerCase(letter);

        if (guessedLetters.contains(letter)) {
            return false;
        }

        guessedLetters.add(letter);
        boolean found = false;

        for (int i = 1; i < word.length() - 1; i++) {
            if (word.charAt(i) == letter) {
                display.setCharAt(i, letter);
                found = true;
            }
        }

        if (!found) {
            wrongCount++;
        }

        return found;
    }


    public String getDisplay() {
        return display.toString();
    }


    public boolean isWin() {
        return display.toString().equals(word);
    }


    public boolean isLose() {
        return wrongCount >= MAX_WRONG;
    }


    public int wrongCount() {
        return wrongCount;
    }


    public String getWord() {
        return word;
    }
}