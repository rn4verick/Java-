package Assessment2;

public class User {
    private int id;
    private String username;
    private int score;

    // Constructor
    public User(int id, String username, int score) {
        this.id = id;
        this.username = username;
        this.score = score;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public int getScore() {
        return score;
    }

    // Set new score
    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return username + " - " + score;
    }
}