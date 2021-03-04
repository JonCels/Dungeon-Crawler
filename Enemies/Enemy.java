package Enemies;

public abstract class Enemy {
    protected int damage;
    protected int HP;
    protected int maxHP;
    protected int level;
    protected int attackPerTurn = 1;
    protected DamageType defenceType;
    protected DamageType attackType;

    public int attack() {
        return this.damage;
    }

    public int level() {
        return this.level;
    }

    public int currentHealth() {
        return this.HP;
    }

    public int maxHealth() {
        return this.maxHP;
    }

    public int numAttacks() {
        return this.attackPerTurn;
    }

    public DamageType attackType() {
        return this.attackType;
    }

    public DamageType defenceType() {
        return this.defenceType;
    }
    
    public void reduceHealth(int dmg, DamageType type) {
        if (this.defenceType.getValue() == (type.getValue() - 1)) { //Half as effective
            dmg /= 2;
        }
        else if (this.defenceType.getValue() == (type.getValue() + 1)) { //Doubly effective
            dmg *= 2;
        }
        if (this.HP - dmg <= 0) {
            this.HP = 0;
            //this.die();
        }
        else {
            this.HP -= dmg;
        }
    }
    
    //public abstract void die();

    //public abstract void special();
}