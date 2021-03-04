package Player.Equipment;

public enum Rarity {
    COMMON(1),
    UNCOMMON(2),
    RARE(3),
    EPIC(4),
    LEGENDARY(5);

    private int value;
    private Rarity(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}
