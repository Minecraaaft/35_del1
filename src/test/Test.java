package test;

import desktop_resources.GUI;
import spil.Die;
import spil.Player;

public class Test {

    public static void main(String[] args) {
        Player p1 = new Player("John");
        System.out.println(p1.getName());

        Die d1 = new Die();
        d1.roll();
        System.out.println(d1.getFaceValue());
        GUI.setDice(2,2);
    }
}
