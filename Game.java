import Enemies.*;
import Player.*;

public class Game {
    public static void main(String args[]) {
        Enemy s1 = new Slime(1);
        Enemy z2 = new Zombie(2);
        Enemy e5 = new Elemental(5);
        Player w1 = new Warrior();

        System.out.println("Warrior HP: " + w1.currentHealth());
        System.out.println("Enemy HP: " + e5.currentHealth());
        while (w1.currentHealth() > 0 && e5.currentHealth() > 0) {
            w1.isAttacked(e5.attack(), e5.attackType());
            e5.reduceHealth(w1.attack(), w1.attackType());
        }
        System.out.println("Warrior HP: " + w1.currentHealth());
        System.out.println("Enemy HP: " + e5.currentHealth());
    }
}
