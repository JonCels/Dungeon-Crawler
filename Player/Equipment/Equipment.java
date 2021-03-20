package Player.Equipment;
import java.lang.Math;
import java.awt.Graphics;

import GameInfo.GameObject;
import GameInfo.GameID;

public class Equipment extends GameObject {
    private EquipmentType type;
    private Rarity rarity;
    private int level;
    private StatType[] statTypes;
    private int statValues[];

    public Equipment(int x, int y, GameID id, int level, Rarity rarity, EquipmentType type) {
        super(x, y, id);
        this.level = level;
        this.type = type;
        this.rarity = rarity;
        this.generateStats();
    }

    public void tick() {

    }

    public void render(Graphics g) {

    }
    
    public EquipmentType getType() {
        return this.type;
    }

    public Rarity getRarity() {
        return this.rarity;
    }

    public int getLevel() {
        return this.level;
    }

    public StatType getStatType(int index) {
        if (index >= statTypes.length)
            throw new IndexOutOfBoundsException("Request for Nonexistant Equipment Stat Type");
        return statTypes[index];
    }

    public int getStatValue(int index) {
        if (index >= statValues.length)
            throw new IndexOutOfBoundsException("Request for Nonexistant Equipment Stat Value");
        return statValues[index];
    }

    public int numStats() {
        return this.statTypes.length;
    }

    private void generateStats() {
        int numStats = this.rarity.getValue();
        int stat, value;
        StatType[] statChoices = StatType.values();
        this.statTypes = new StatType[3];
        this.statValues = new int[3];

        stat = (int)(Math.random() * 3);
        value = this.level * ((int)(Math.random() * 4) + 4);
    }
}
