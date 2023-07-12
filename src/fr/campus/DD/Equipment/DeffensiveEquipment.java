package fr.campus.DD.Equipment;

import fr.campus.DD.Character.Character;

public class DeffensiveEquipment {
    private String type;
    int defenceLevel;
    private String name;

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
        return  "    Type: " + type + '\n' +
                "    Name: " + name + '\n' +
                "    Deffensive points: " + defenceLevel
                ;
    }
}
