package fr.campus.DD.Character;

import java.util.Scanner;

import fr.campus.DD.Equipment.DeffensiveEquipment;
import fr.campus.DD.Equipment.OffensiveEquipment;

import java.util.Scanner;

public class Character {
    String name;
    String type = "";
    int pointLife;
    int forceAttack;
    OffensiveEquipment offensiveEquipment;
    DeffensiveEquipment deffensiveEquipment;

    public void selectType(){

        Scanner console1 = new Scanner(System.in);

        while (!type.equals("warrior") && !type.equals("wizard")) {
            System.out.println("warrior or wizard? Enter your type:");
            this.type = console1.nextLine();
        }

        selectForceAttack();
        selectPointLife();

        if (type.equals("warrior")){
            this.offensiveEquipment = new OffensiveEquipment("weapon",1,"sword");
            this.deffensiveEquipment = new DeffensiveEquipment("shield", 1, "wooden shield");
        }
        if (type.equals("wizard")) {
            this.offensiveEquipment = new OffensiveEquipment("fate", 5,"magic root");
            this.deffensiveEquipment = new DeffensiveEquipment("potion", 2, "standard potion");
        }
    }

    public void selectForceAttack(){
        Scanner console2 = new Scanner(System.in);
        int attackValue = 0;
        if (this.type.equals("warrior")) {
            while (attackValue < 5 || attackValue > 10) {
                System.out.println("Enter attack value (between 5 and 10):");
                attackValue = console2.nextInt();
            }
        }
        if (this.type.equals("wizard")) {
            while (attackValue < 7 || attackValue > 15) {
                System.out.println("Enter attack value (between 8 and 15):");
                attackValue = console2.nextInt();
            }
        }

        this.forceAttack = attackValue;
    }

    public void selectPointLife(){
        Scanner console3 = new Scanner(System.in);
        int lifeValue = 0;
        if (type.equals("warrior")) {
            while (lifeValue < 5 || lifeValue > 10) {
                System.out.println("Enter life value (between 5 and 10):");
                lifeValue = console3.nextInt();
            }
        }
        if (type.equals("wizard")){
            while (lifeValue < 3 || lifeValue > 6) {
                System.out.println("Enter life value (between 3 and 6):");
                lifeValue = console3.nextInt();
            }
        }
        this.pointLife = lifeValue;
    }
    public Character() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter a name for your character:");
        this.name = myObj.nextLine();
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
        return "Character{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", pointLife=" + pointLife +
                ", forceAttack=" + forceAttack +
                ", offensiveEquipment=" + offensiveEquipment +
                ", deffensiveEquipment=" + deffensiveEquipment +
                '}';
    }
}
