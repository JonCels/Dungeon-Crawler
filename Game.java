import Enemies.*;

public class Game {
    public static void main(String args[]) {
        Enemy slime = new Slime(1);
        Enemy zombie = new Zombie(2);
        Enemy elemental = new Elemental(5);
        System.out.println(slime.currentHealth());
        System.out.println(zombie.attackType().getValue());
        System.out.println(elemental.defenceType());
    }
}
