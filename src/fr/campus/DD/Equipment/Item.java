package fr.campus.DD.Equipment;

public abstract class Item {
    private int durability;

    private String name;

    public Item (String name, int durability) {
        setName(name);
        setDurability(durability);
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
