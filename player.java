
public class Player {

    private String name;
    //
    private int points;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.points = 0;
    }

    // Get player's name
    public String getName() {
        return name;
    }

    // Get player's points
    public int getPoints() {
        return points;
    }

    // Add points to the player
    public void addPoints(int points) {
        if (points > 0) {
            this.points += points;
        }
    }
}
