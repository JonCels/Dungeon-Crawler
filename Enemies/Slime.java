package Enemies;
import java.awt.Graphics;
import GameInfo.GameID;

public class Slime extends Enemy {
    public Slime(int x, int y, GameID id, int level) {
        super(x, y, id);
        this.level = level;
        this.damage = 5 * this.level;
        this.HP = this.maxHP = 50 * this.level;
        this.defenceType = DamageType.PHYSICAL;
        this.attackType = DamageType.PHYSICAL;
    }

    public void tick() {

    }

    public void render(Graphics g) {

    }
}
