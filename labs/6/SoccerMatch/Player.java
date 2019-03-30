package lab6Completed;
// Package Statement
class Player {
    // Player Class
    private String name;
    private int goals;
    private String team;
    // Class Attributes

    Player() {
        // Default Constructor
        name = team = "";
        goals = 0;
    }

    Player(String name, int goal, String team) {
        // Overloaded Constructor
        this.name = name;
        this.goals = goal;
        this.team = team;
    }

    // Setters and Getter
    void setName(String name) {
        this.name = name;
    }

    void setTeam(String team) {
        this.team = team;
    }

    void setGoals(int goals) {
        this.goals = goals;
    }

    String getName() {
        return name;
    }

    String getTeam() {
        return team;
    }

    int getGoals() {
        return goals;
    }

    public String toString() {
        // To String Method that returns string of information
        return "\n Player Name: " + name + "\t Team: " + team + "\t Goals: " + goals;
    }// End of method

}