package fr.campus.DD.Equipment.OffensiveEquipment;

import fr.campus.DD.Character.Character;
import fr.campus.DD.Equipment.Item;
import fr.campus.DD.Utils.Image;

public abstract class OffensiveEquipment extends Item {
    private int attackLevel;

    public OffensiveEquipment(String name, int durability, int level){
        super(name, durability);
        setAttackLevel(level);
    }

    public int getAttackLevel(){
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    @Override
    public String toString() {
        String template = Image.get(this.getClass().getSimpleName());
        return  String.format(template, this.getName(), this.getAttackLevel());
    }
}
