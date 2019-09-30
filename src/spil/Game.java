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
        Player p1 = new Player("John");
        turn(p1);
    }
}
