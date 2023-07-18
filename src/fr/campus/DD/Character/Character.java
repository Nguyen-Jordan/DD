package fr.campus.DD.Character;

import fr.campus.DD.Equipment.DeffensiveEquipment.DeffensiveEquipment;
import fr.campus.DD.Equipment.OffensiveEquipment.OffensiveEquipment;
import fr.campus.DD.Utils.Image;

public abstract class Character {
    private String name;
    private int pointLife;
    private int forceAttack;
    OffensiveEquipment offensiveEquipment;
    DeffensiveEquipment deffensiveEquipment;

    public Character() {

    }


    public Character(String name) {

    }
    public Character(String newName, String newType) {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointLife() {
        return pointLife;
    }

    public void setPointLife(int pointLife) {
        this.pointLife = pointLife;
    }

    public int getForceAttack() {
        return forceAttack;
    }

    public void setForceAttack(int forceAttack) {
        this.forceAttack = forceAttack;
    }

    public OffensiveEquipment getOffensiveEquipment() {
        return offensiveEquipment;
    }

    public void setOffensiveEquipment(OffensiveEquipment offensiveEquipment) {
        this.offensiveEquipment = offensiveEquipment;
    }

    public DeffensiveEquipment getDeffensiveEquipment() {
        return deffensiveEquipment;
    }

    public void setDeffensiveEquipment(DeffensiveEquipment deffensiveEquipment) {
        this.deffensiveEquipment = deffensiveEquipment;
    }

    @Override
    public String toString() {
        String template = Image.get(this.getClass().getSimpleName());
        return String.format(template, this.getName(),this.getClass().getSimpleName(),this.getPointLife(),this.getForceAttack());
    }
}
