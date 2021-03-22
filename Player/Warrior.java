package Player;
import java.awt.Graphics;
import java.awt.Color;

import GameInfo.GameID;
import Enemies.DamageType;
import Player.Equipment.Equipment;

public class Warrior extends Player {

    public Warrior(int x, int y, GameID id) {
        super(x, y, id);
        this.damage = 10;
        this.HP = this.maxHP = 100;
        this.level = 1;
        this.defenceType = DamageType.PHYSICAL;
        this.attackType = DamageType.PHYSICAL;
        this.equipment = new Equipment[6];
    }

    public Warrior(int x, int y, GameID id, int level) {
        super(x, y, id);
        this.level = level;
        this.damage = 5 + (30 * this.level);
        this.HP = this.maxHP = 100 + (50 * this.level);
        this.defenceType = DamageType.PHYSICAL;
        this.attackType = DamageType.PHYSICAL;
    }

    public void tick() {

    }

    public void render(Graphics g) {
        g.setColor(Color.blue);
        g.fillRect(x, y, 10, 10);
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

    public void isAttacked(int dmg, DamageType type) {
        this.reduceHealth(dmg, type);
    }

    public void die() {
        System.out.println("The warrior died!");
    }
}
