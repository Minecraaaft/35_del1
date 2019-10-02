package test;

import desktop_resources.GUI;
import spil.Die;
import spil.Player;

public class Test {

    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();
        int roll2 = 0;
        int roll3 = 0;
        int roll4 = 0;
        int roll5 = 0;
        int roll6 = 0;
        int roll7 = 0;
        int roll8 = 0;
        int roll9 = 0;
        int roll10 = 0;
        int roll11 = 0;
        int roll12 = 0;




        for(int i = 1; i <= 1000; i++){
            d1.roll();
            d2.roll();
            int sum = d1.getFaceValue() + d2.getFaceValue();
            switch (sum){
                case 2:
                    roll2++;
                    break;
                case 3:
                    roll3++;
                    break;
                case 4:
                    roll4++;
                    break;
                case 5:
                    roll5++;
                    break;
                case 6:
                    roll6++;
                    break;
                case 7:
                    roll7++;
                    break;
                case 8:
                    roll8++;
                    break;
                case 9:
                    roll9++;
                    break;
                case 10:
                    roll10++;
                    break;
                case 11:
                    roll11++;
                    break;
                case 12:
                    roll12++;
                    break;
            }


        }
        System.out.println("Efter 1000 kast, så har vi følgende distribution på 1000 kast:");
        System.out.println("2'ere: " + roll2);
        System.out.println("3'ere: " + roll3);
        System.out.println("4'ere: " + roll4);
        System.out.println("5'ere: " + roll5);
        System.out.println("6'ere: " + roll6);
        System.out.println("7'ere: " + roll7);
        System.out.println("8'ere: " + roll8);
        System.out.println("9'ere: " + roll9);
        System.out.println("10'ere: " + roll10);
        System.out.println("11'ere: " + roll11);
        System.out.println("12'ere: " + roll12);
        System.out.println("Samlet antal kast: " + (roll2 + roll3 + roll4 + roll5 + roll6 + roll7 + roll8 + roll9 + roll10 + roll11 +
                roll12)) ;

    }
}
