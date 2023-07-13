package fr.campus.DD.Character;

import java.util.Scanner;

import fr.campus.DD.Equipment.DeffensiveEquipment;
import fr.campus.DD.Equipment.OffensiveEquipment;

import java.util.Scanner;

public class Character {
    private String name;
    private String type = "";
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return  "Player name: " + name + '\n' +
                "Type: " + type + '\n' +
                "Life: " + pointLife + " points \n" +
                "Force: " + forceAttack + " points \n" +
                "Offensive equipment: \n"
                + offensiveEquipment + '\n' +
                "Deffensive equipment: \n"
                + deffensiveEquipment
                ;
    }
}
