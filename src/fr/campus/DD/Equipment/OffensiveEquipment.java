package fr.campus.DD.Equipment;

import fr.campus.DD.Character.Character;

public class OffensiveEquipment {
    private String type;
    private int attackLevel;
    private String name;

    public OffensiveEquipment() {

    }

    public OffensiveEquipment(String newType, int newAttackLevel, String newName) {
        this.type = newType;
        this.attackLevel = newAttackLevel;
        this.name = newName;
    }

    public String getType() {
        return type;
    }

    public void setType(String newType) {
        this.type = newType;
    }

    public int getAttackLevel(){
        return attackLevel;
    }

    public void setAttackLevel(int attackLevel) {
        this.attackLevel = attackLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public String toString() {
        return  "    Type: " + type + '\n' +
                "    Name: " + name + '\n' +
                "    Offensive points: " + attackLevel
                ;
    }
}
