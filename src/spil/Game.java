package spil;

public class Game {
    //instans variabel

    //konstruktør
    public Game(){

    }

    //metoder
    //public int checkPairs(){}


    public static void turn(Player player){
        int faceValueSum;

        Die d1 = new Die();
        Die d2 = new Die();
        faceValueSum = d1.roll() + d2.roll();

        System.out.println(faceValueSum);
    }


    public static void main(String[] args) {

        Player player1 = new Player("John");
        Player player2 = new Player("Bob");

        do {
            turn(player1);
            if (player1.getPoints() >= 40)
                break;

            turn(player2);
        } while (player1.getPoints() < 40 && player2.getPoints() < 40);

    }
}
