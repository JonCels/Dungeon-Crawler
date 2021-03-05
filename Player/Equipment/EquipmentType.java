package Player.Equipment;

public enum EquipmentType {
    HEAD(1),
    BODY(2),
    FEET(3),
    MAINHAND(4),
    OFFHAND(5),
    ACCESSORY(6);

    private int value;
    private EquipmentType(int value) {
        this.value = value;
    }
    public int getValue() {
        return this.value;
    }
}