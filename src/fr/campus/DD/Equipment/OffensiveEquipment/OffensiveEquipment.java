package fr.campus.DD.Equipment.OffensiveEquipment;

import fr.campus.DD.Character.Character;

public abstract class OffensiveEquipment {
    private int attackLevel;
    private String name;

    public OffensiveEquipment() {

    }

    public OffensiveEquipment(int newAttackLevel, String newName) {
        this.attackLevel = newAttackLevel;
        this.name = newName;
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
        return  "    Type: " + this.getClass().getSimpleName() + '\n' +
                "    Name: " + name + '\n' +
                "    Offensive points: " + attackLevel
                ;
    }
}
