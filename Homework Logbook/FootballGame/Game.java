package FootballGame;

public class Game {
    private String homeTeam;
    private String awayTeam;
    private int homegoals;
    private int awaygoals;

    public Game(String homeTeam, String awayTeam, int homegoals, int awaygoals) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homegoals = homegoals;
        this.awaygoals = awaygoals;
    }
    public String getHomeTeam() {
        return homeTeam;
    }
    public String getAwayTeam() {
        return awayTeam;
    }
    public int getHomegoals() {
        return homegoals;
    }
    public int getAwaygoals() {
        return awaygoals;
    }
}
