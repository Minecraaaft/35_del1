package spil;
//ny Player class
public class Player {
//attributter
    private int points = 0;
    private String name;
    private boolean hasWon = false;
    private boolean double6 = false;
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

    public boolean getHasWon() {
        return hasWon;
    }

    public void rollDice(){
        int faceValueSum;
        int pointsBeforeRoll = points;
        //two Die objects are made
        Die d1 = new Die();
        Die d2 = new Die();

        faceValueSum = d1.roll() + d2.roll();
        points = points + faceValueSum;

        System.out.println(name + " rolled a " + d1.getFaceValue() + " and " + d2.getFaceValue() + " for a sum total of " + faceValueSum);

        if (pointsBeforeRoll >= 40 && d1.getFaceValue() == d2.getFaceValue()) {
            hasWon = true;
            System.out.println(name + " has won!");
            return;
        }


        if (d1.getFaceValue() == 1 && d2.getFaceValue() == 1){
            System.out.println(name + " rolled two 1's");
            System.out.println(name + " loses all points");
            setPoints(0);
        }

        if (pointsBeforeRoll >= 40) {
            System.out.println("You've got +40 points (" + points +  ") and need a pair to win");
        } else
            System.out.println(name + " has this many points: " + points);


        if (faceValueSum == 12) {
            if(double6){
                hasWon = true;
                System.out.println(name + " has won by rolling two 6's two times in a row!");
                return;
            }
            double6 = true;
        } else
            double6 = false;

        if (d1.getFaceValue() == d2.getFaceValue()) {
            System.out.println(name + " gets an extra Turn");
            rollDice();
        }


    }


}
