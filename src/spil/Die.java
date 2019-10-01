package spil;

import java.util.Random;

public class Die {
    //instans variabler/attributer
    private int faceValue;

    //konstruktor
    public Die() {
    }

    //generates a number from 1-6 to faceValue and also returns it.
    public int roll() {
        Random random = new Random();
        faceValue = random.nextInt(6) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
