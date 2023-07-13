package fr.campus.DD.Equipment.OffensiveEquipment;

public class Weapon extends OffensiveEquipment{
    public Weapon (String name, int level){
        super();
        this.setAttackLevel(level);
        this.setName(name);
    }
}
