package Player.Equipment;

public abstract class Equipment {
    protected EquipmentType type;
    protected Rarity rarity;
    protected int level;
    protected StatType[] statTypes;
    protected int statValues[];
    
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
}
