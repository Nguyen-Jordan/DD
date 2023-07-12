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

    public void selectType(){

        Scanner console1 = new Scanner(System.in);

        while (!type.equals("warrior") && !type.equals("wizard")) {
            System.out.println("warrior or wizard? Enter your type:");
            this.type = console1.nextLine();
        }

        selectLevelGame();

        if (type.equals("warrior")){
            this.offensiveEquipment = new OffensiveEquipment("weapon",1,"sword");
            this.deffensiveEquipment = new DeffensiveEquipment("shield", 1, "wooden shield");
        }
        if (type.equals("wizard")) {
            this.offensiveEquipment = new OffensiveEquipment("fate", 5,"magic root");
            this.deffensiveEquipment = new DeffensiveEquipment("potion", 2, "standard potion");
        }
    }

    public void selectLevelGame(){
        Scanner console2 = new Scanner(System.in);
        String levelGame = "";
        while (!levelGame.equals("easy") && !levelGame.equals("medium") && !levelGame.equals("hard")) {
            System.out.println("choose the level of game (easy, medium or hard):");
            levelGame = console2.nextLine();
        }
        if (levelGame.equals("easy")) {
            if(type.equals("warrior")){
                this.forceAttack = 10;
                this.pointLife = 10;
            }
            if(type.equals("wizard")){
                this.forceAttack =15;
                this.pointLife = 6;
            }
        } else if (levelGame.equals("medium")) {
            if(type.equals("warrior")){
                this.forceAttack = 7;
                this.pointLife = 7;
            }
            if(type.equals("wizard")){
                this.forceAttack = 11;
                this.pointLife = 5;
            }
        } else {
            if(type.equals("warrior")){
                this.forceAttack = 5;
                this.pointLife = 5;
            }
            if(type.equals("wizard")){
                this.forceAttack = 8;
                this.pointLife = 3;
            }
        }
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
