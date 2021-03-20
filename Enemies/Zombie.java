package Enemies;
import java.awt.Graphics;
import GameInfo.GameID;

public class Zombie extends Enemy {
    public Zombie(int x, int y, GameID id, int level) {
        super(x, y, id);
        this.level = level;
        this.damage = 7 * this.level;
        this.HP = this.maxHP = 45 * this.level;
        this.defenceType = DamageType.UNDEAD;
        this.attackType = DamageType.UNDEAD;
    }
    
    public void tick() {

    }

    public void render(Graphics g) {
        
    }
}
