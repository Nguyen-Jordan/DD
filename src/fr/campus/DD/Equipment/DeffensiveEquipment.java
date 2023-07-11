package fr.campus.DD.Equipment;

import fr.campus.DD.Character.Character;

public class DeffensiveEquipment {
    String type;
    int defenceLevel;
    String name;

    public DeffensiveEquipment(){

    }
    public DeffensiveEquipment(String newType, int newDefenceLevel, String newName){
        this.type = newType;
        this.defenceLevel = newDefenceLevel;
        this.name = newName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return "DeffensiveEquipment{" +
                "type='" + type + '\'' +
                ", defenceLevel=" + defenceLevel +
                ", name='" + name + '\'' +
                '}';
    }
}
