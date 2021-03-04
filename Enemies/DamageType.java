package Enemies;

public enum DamageType {
    PHYSICAL(1),
    UNDEAD(2),
    MAGICAL(3);

    private int value;
    private DamageType(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}