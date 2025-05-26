Game Class represents a football match with:
- homeTeam: Name of the home team
- awayTeam: Name of the away team
- homeGoals: Goals scored by the home team
- awayGoals: Goals scored by the away team

Constructor: public Game(String homeTeam, String awayTeam, int homegoals, int awaygoals)

Getters:
public String getHomeTeam()
public String getAwayTeam()
public int getHomegoals()
public int getAwaygoals()

ElboniaLeague Class is the main class where user interaction happens.

It adds game with team names and goals
You can check the team's performances (wins, losses, draws)

ArrayList<Game> games = new ArrayList<>();
- Stores the list of all games played

switch (choice) {
    case 1: // Add Game
    case 2: // Team Performance
    case 0: // Exit
}

Handles menu actions from the user




