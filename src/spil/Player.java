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

    public void rollDice(){
        int faceValueSum;
        //two Die objects are made
        Die d1 = new Die();
        Die d2 = new Die();

        faceValueSum = d1.roll() + d2.roll();
        points = points + faceValueSum;

        System.out.println(name + " rolled a sum total of " + faceValueSum);
        System.out.println(name + " has this many points: " + points);

        if (d1.getFaceValue() == 1 && d2.getFaceValue() == 1){
            System.out.println(name + " loses all points");
            setPoints(0);
            System.out.println(name + " now has " + points + " points");
        }

        if (d1.getFaceValue() == d2.getFaceValue()) {
            System.out.println(name + " gets an extra Turn");
            rollDice();
        }
    }


}
