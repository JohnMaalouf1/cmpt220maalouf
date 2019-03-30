package lab6Completed;
// Package Statement
import java.util.Date;
import java.util.Random;

public class SoccerMatchDriver {

    static Random rand = new Random();
    // Random Class called assigned to rand
    public static void main(String[] args) {

        Date d1 = new Date();
        Date d2 = new Date();
        // Dates created

        SoccerMatch exampleGame1 = new SoccerMatch(d1, d2, "SoccerFieldNY", "Team1", "Team2");
        // Object Match1 declared
        String homePlayerName [] = {"Player1", "Player2", "Player3", "Player4", "Player5", "Player6", "Player7", "Player8", "Player9", "Player10", "Player11"};
        String visitPlayerName [] = {"Player12", "Player13", "Player14", "Player15", "Player16", "Player17", "Player18", "Player19", "Player20", "Player21", "Player22"};
        // String Arrays of Players for each team
        {
            int i = 0;
            while (i < 11) {
                exampleGame1.addHomePlayer(new Player(homePlayerName[i], rand.nextInt(10), "Team1"));
                exampleGame1.addVisitorPlayer(new Player(visitPlayerName[i], rand.nextInt(10), "Team2"));
                i++;
                // Adding Players to array with a random goal less than 10
            }
        }

        for(int i = 0; i < 10; i++) {
            exampleGame1.addHomeGoal(new Goal(rand.nextInt(90), exampleGame1.getHomePlayers()[i]));
            exampleGame1.addVisitorGoal(new Goal(rand.nextInt(90), exampleGame1.getVisitorPlayers()[i]));
            // Adding when the player scored a goal less than 90 minutes in a game
        }// End of for loop

        System.out.print("\n\n Team: Home\n");
        for(int i = 0; i < 11; i++) {
            System.out.println(exampleGame1.getHomePlayers()[i]);
            // Prints Players team and goals for home team
        }
        System.out.print("\n\n Team: Visitor\n");

        for(int i = 0; i < 11; i++) {
            System.out.println(exampleGame1.getVisitorPlayers()[i]);
            // Prints Visitors team and goals for home team
        }

        System.out.print("\n\n Team: Home: Goals\n");

        for(int i = 0; i < 10; i++) {
            System.out.println(exampleGame1.getHomeGoals()[i]);
            // Prints goals for home team
        }

        System.out.print("\n\n Team: Visitor: Goals\n" );

        for(int i = 0; i < 10; i++) {
            System.out.println(exampleGame1.getVisitorGoals()[i]);
            // Prints goals for visitor team
        }

        System.out.print("\n\nResults");
        System.out.println(exampleGame1.getWinner());
        // Prints the winning team

    }
}
