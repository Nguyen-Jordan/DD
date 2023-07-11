package fr.campus.DD.Menu;

import java.util.Scanner;
import fr.campus.DD.Character.Character;

public class Menu {

    String firstSelection = "";
    public void startTheGame () {
        Character player1 = new Character();
        player1.selectType();
        creatingCharacter(player1);
    }

    public void creatingCharacter (Character player) {
        Scanner myObj = new Scanner(System.in);
        while (!firstSelection.equals("continue") && !firstSelection.equals("modify")){
            System.out.println("Would you like to continue or modify?");
            this.firstSelection = myObj.nextLine();
        }
        if (firstSelection.equals("modify")){
            startTheGame();
        } else {
            showPlayer(player);
            System.out.println(" ");
            System.out.println("Welcome to Donjons & Dragons !");
        }
    }

    public void showPlayer(Character player){
        System.out.println("Player name: "+player.getName());
        System.out.println("Type: "+player.getType());
        System.out.println("Life: "+player.getPointLife()+" points");
        System.out.println("Force: "+player.getForceAttack());
        System.out.println("Offensive equipment:");
        System.out.println("    Type: "+player.getOffensiveEquipment().getType());
        System.out.println("    Name: "+player.getOffensiveEquipment().getName());
        System.out.println("    Offensive points: "+player.getOffensiveEquipment().getAttackLevel());
        System.out.println("Deffensive equipment:");
        System.out.println("    Type: "+player.getDeffensiveEquipment().getType());
        System.out.println("    Name: "+player.getDeffensiveEquipment().getName());
        System.out.println("    Deffensive points: "+player.getDeffensiveEquipment().getDefenceLevel());
    }
    public Menu(){

    }
}
