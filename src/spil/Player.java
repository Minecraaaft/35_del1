package spil;
//ny Player class
public class Player {
//attributter
    private int points = 0;
    private String name;
//constructor
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
