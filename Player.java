import Enemies.Type;

public abstract class Player {
    protected int damage;
    protected int HP;
    protected int maxHP;
    protected int level;
    protected int attackPerTurn = 1;
    protected Type defenceType;
    protected Type attackType;
    //equipment

    public int attack() {
        return this.damage;
    }

    public int level() {
        return this.level();
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

    public Type attackType() {
        return this.attackType;
    }

    public Type defenceType() {
        return this.defenceType;
    }

    public void heal() {
        this.HP = this.maxHP;
    }

    public void heal(int HP) {
        int sum = this.HP + HP;
        if (sum > this.maxHP) {
            this.HP = this.maxHP;
        }
        else {
            this.HP = sum;
        }
    }
    
    public abstract void levelUp();

    //public abstract void equip(Slot, Equipment);
    //public abstract void special();
    //public abstract void die();
}
