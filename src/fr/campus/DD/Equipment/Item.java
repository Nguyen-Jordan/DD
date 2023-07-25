package fr.campus.DD.Equipment;

public abstract class Item implements Cloneable{
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

    public abstract String simpleString ();

    @Override
    public Item clone() {
        try {
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return (Item) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
