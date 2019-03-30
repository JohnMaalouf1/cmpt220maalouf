package lab6Completed;
// Package Statement
import java.util.*;
// Import Statements

public class SoccerMatch {
    // Soccer Match Class
     private Date startTime;
     private Date endTime;
     private String location;
     private String home;
     private String visitor;
     private Player hPlayers[];
     private Player vPlayers[];
     private Goal hGoals[];
     private Goal vGoals[];
     private int hPlayerCounter, vPlayerCounter;
     private int hGoalCounter, vGoalCounter;


    public SoccerMatch(){
        // Default Constructor
    }
    public SoccerMatch(Date startTime, Date endTime, String location, String home, String visitor) {
        // Overloaded Constructor
        startTime = null;
        endTime = null;
        location = " ";
        home = " ";
        visitor = " ";
        hPlayers = new Player[11];
        vPlayers = new Player[11];
        hGoals = new Goal[10];
        vGoals = new Goal[10];
        hPlayerCounter = 0;
        vPlayerCounter = 0;
        hGoalCounter = 0;
        vGoalCounter = 0;
        // Variables Set
        {
            int i = 0;
            // Looping variable
            while (i < 11) {
                hPlayers[i] = new Player();
                vPlayers[i] = new Player();
                i++;
                // Creating Player Objects
            }
        }

        {
            int i = 0;
            // Looping variable
            while (i < 10) {
                hGoals[i] = new Goal();
                vGoals[i] = new Goal();
                i++;
                // Creating Goal Objects
            }
        }
    }

    // Add Objects Method
    void addHomePlayer(Player p) {
        hPlayers[hPlayerCounter++] = p;
    }

    void addVisitorPlayer(Player p) {
        vPlayers[vPlayerCounter++] = p;
    }

    void addHomeGoal(Goal g) {
        hGoals[hGoalCounter++] = g;
    }

    void addVisitorGoal(Goal g) {
        vGoals[vGoalCounter++] = g;
    }

    public int [] fillHomeGoals() {
        //fill Home Goals Method

        int goals[] = new int[10];
        int i = 0;
        // Looping Variable
        while (i < 10) {
            goals[i] = hGoals[i].getPlayer().getGoals();
            i++;
            // Gets home goals by players and adds them to list
        }
        return goals;
        // Returns Goals
    }

    public int [] fillVisitorGoals() {
        // fill Visitor Goals Method

        int goals[] = new int[10];
        int i = 0;
        // Looping Variable
        while (i < 10) {
            goals[i] = vGoals[i].getPlayer().getGoals();
            i++;
            // Gets visitor goals by players and adds them to list
        }
        return goals;
        // Returns Goals
    }

    String getWinner() {
        // getWinner Method

        String winValue = " ";

        int homeGoals[] = fillHomeGoals();

        int visitGoals[] = fillVisitorGoals();

        int homeGoalNum = 0, visitGoalNum = 0;

        for(int i = 0; i < 10; i++) {

            homeGoalNum += homeGoals[i];
            visitGoalNum += visitGoals[i];

        }

        winValue = "\n Home Team Total Goals: " + homeGoalNum + "\n Visitor Team Total Goals: " + visitGoalNum;


        if(homeGoalNum > visitGoalNum) {
            winValue += "\n Winner: Home Team";
        }

        else if(visitGoalNum > homeGoalNum) {
            winValue += "\n Winner: Visitor Team";
        }

        else {
            winValue += "\n Tie";
        }

        return winValue;
    }


    // Setters and Getters
    void setHomePlayers(Player[] homePlayers){
        this.hPlayers = homePlayers;
    }

    Player[] getHomePlayers(){
        return hPlayers;
    }

    void setVisitorPlayers(Player[] visitorPlayers){
        this.vPlayers = visitorPlayers;
    }

    Player[] getVisitorPlayers(){
        return vPlayers;
    }

    void setHomeGoals(Goal[] homeGoals){
        this.hGoals = homeGoals;
    }

    Goal[] getHomeGoals(){
        return hGoals;
    }

    void setVisitorGoals(Goal[] visitorGoals){
        this.vGoals = visitorGoals;
    }

    Goal[] getVisitorGoals(){
        return vGoals;
    }

}