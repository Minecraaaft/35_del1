package spil;

public class Player {
    private int points = 0;
    private String name;

    public Player(String playerName){
        name = playerName;
    }


    public void setPoints(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }
}
