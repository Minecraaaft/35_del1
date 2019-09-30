package spil;

import java.util.Random;

public class Die {
    //instans variabler/attributer
    private int faceValue;

    //konstruktor
    public Die() {
    }

    //metoder
    public int roll() {
        Random random = new Random();
        faceValue = random.nextInt(6) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
