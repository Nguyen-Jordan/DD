package fr.campus.DD.Equipment.DeffensiveEquipment;

import fr.campus.DD.Character.Character;
import fr.campus.DD.Equipment.Item;
import fr.campus.DD.Utils.Image;

public abstract class DeffensiveEquipment extends Item {
    private int defenceLevel;

    public DeffensiveEquipment(String name, int level, int durability){
        super(name, durability);
        setDefenceLevel(level);
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    public void setDefenceLevel(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }

    @Override
    public String simpleString() {
        return "\tName: " + this.getName() + "\n\tDefense: " + this.getDefenceLevel() + "\n\tDurability: " + this.getDurability()+ " rounds\n";
    }
    @Override
    public String toString() {
        String template = Image.get(this.getClass().getSimpleName());
        return  String.format(template, this.getName(), this.getDefenceLevel(), this.getDurability());
    }
}
