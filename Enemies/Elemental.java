package Enemies;

public class Elemental extends Enemy {
    public Elemental(int level) {
        this.level = level;
        this.damage = 9 * this.level;
        this.HP = this.maxHP = 25 * this.level;
        this.defenceType = Type.MAGICAL;
        this.attackType = Type.MAGICAL;
        this.attackPerTurn = 2;
    }
}
