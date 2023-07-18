package fr.campus.DD.Equipment.DeffensiveEquipment;

import fr.campus.DD.Character.Character;
import fr.campus.DD.Utils.Image;

public abstract class DeffensiveEquipment {
    private int defenceLevel;
    private String name;

    public DeffensiveEquipment(){

    }
    public DeffensiveEquipment(int newDefenceLevel, String newName){
        this.defenceLevel = newDefenceLevel;
        this.name = newName;
    }

    public int getDefenceLevel() {
        return defenceLevel;
    }

    public void setDefenceLevel(int defenceLevel) {
        this.defenceLevel = defenceLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String template = Image.get(this.getClass().getSimpleName());
        return  String.format(template, this.getName(), this.getDefenceLevel());
    }
}
