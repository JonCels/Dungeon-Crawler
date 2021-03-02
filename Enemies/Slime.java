package Enemies;

public class Slime extends Enemy {
    public Slime(int level) {
        this.level = level;
        this.damage = 5 * this.level;
        this.HP = this.maxHP = 50 * this.level;
        this.defenceType = Type.PHYSICAL;
        this.attackType = Type.PHYSICAL;
    }
}
