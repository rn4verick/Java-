package FootballGame;
import java.util.Scanner;
import java.util.ArrayList;

public class ElboniaLeague {
    public static void main(String[] args) {
        ArrayList<Game> games = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Game");
            System.out.println("2. Team Performance");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Home Team: ");
                    String homeTeam = sc.nextLine();
                    System.out.println("Enter Away Team: ");
                    String awayTeam = sc.nextLine();
                    System.out.println("Enter Goals for " + homeTeam + ": ");
                    int homeGoals = sc.nextInt();
                    System.out.println("Enter Goals for " + awayTeam + ": ");
                    int awayGoals = sc.nextInt();
                    sc.nextLine();
                    games.add(new Game(homeTeam, awayTeam, homeGoals, awayGoals));
                    System.out.println("Game Added SUcessfully");
                    break;

                    case 2:
                        System.out.println("Enter Team Name: ");
                        String teamName = sc.nextLine();
                        int wins = 0, loses = 0, draws = 0;

                        for (Game game : games) {
                            if(game.getHomeTeam().equalsIgnoreCase(teamName)) {
                                if(game.getHomegoals() > game.getAwaygoals()) wins++;
                                else if(game.getHomegoals() < game.getAwaygoals()) loses++;
                                else draws++;
                            } else if(game.getAwayTeam().equalsIgnoreCase(teamName)) {
                                if(game.getAwaygoals() > game.getHomegoals()) wins++;
                                else if(game.getAwaygoals() > game.getHomegoals()) loses++;
                                else draws++;
                            }
                        }

                        System.out.println("Team: " + teamName);
                        System.out.println("Wins: " + wins);
                        System.out.println("Loses: " + loses);
                        System.out.println("Draws: " + draws);
                        break;

                case 0:
                    System.out.println("Exiting system.");
                    break;

                    default:
                        System.out.println("Invalid choice");
            }



        } while (choice != 0);
    }
}
