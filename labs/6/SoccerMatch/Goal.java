package lab6Completed;
// Package Statement
class Goal {
    // Goal Class
    private int minute;
    private Player player;
    // Class Attributes

    Goal(){
        // Default Constructor
        minute = 0;
        player = null;
    }

    Goal(int min, Player p){
        // Overloaded Constructor
        minute = min;
        player = p;
    }
    // Setters and Getters

    void setMinute(int minute) {
        this.minute = minute;
    }

    void setPlayer(Player player) {
        this.player = player;
    }

    int getMinute() {
        return minute;
    }

    Player getPlayer() {
        return player;
    }

    public String toString() {
        // To String Method that returns string of information
        return "\n Minute: " + minute +
                "\n Player That Scored:  " + player.getName();
    }
}

