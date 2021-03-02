package Enemies;

public enum Type {
    PHYSICAL(1),
    UNDEAD(2),
    MAGICAL(3);

    private int value;
    private Type(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}