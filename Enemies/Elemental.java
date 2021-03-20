package Enemies;
import java.awt.Graphics;
import GameInfo.GameID;

public class Elemental extends Enemy {
    public Elemental(int x, int y, GameID id, int level) {
        super(x, y, id);
        this.level = level;
        this.damage = 9 * this.level;
        this.HP = this.maxHP = 25 * this.level;
        this.defenceType = DamageType.MAGICAL;
        this.attackType = DamageType.MAGICAL;
        this.attackPerTurn = 2;
    }
    
    public void tick() {

    }

    public void render(Graphics g) {
        
    }
}
