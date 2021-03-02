package Player;
import Enemies.Type;

public class Warrior extends Player {
    public Warrior() {
        this.damage = 5;
        this.HP = this.maxHP = 100;
        this.level = 1;
        this.defenceType = Type.PHYSICAL;
        this.attackType = Type.PHYSICAL;
    }

    public void levelUp() {
        if (this.level >= 10) 
            return;
        this.level += 1;
        if (this.level == 5) 
            this.attackPerTurn += 1;
        this.damage += 30;
        this.maxHP += 50;
        this.heal();
    }

    public void isAttacked(int dmg, Type type) {
        this.reduceHealth(dmg, type);
    }
}
