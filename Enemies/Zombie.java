package Enemies;

public class Zombie extends Enemy {
    public Zombie(int level) {
        this.level = level;
        this.damage = 7 * this.level;
        this.HP = this.maxHP = 45 * this.level;
        this.defenceType = Type.UNDEAD;
        this.attackType = Type.UNDEAD;
    }
}
