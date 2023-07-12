package fr.campus.DD.Menu;

import java.util.Scanner;
import fr.campus.DD.Character.Character;

public class Menu {

    private String firstSelection = "";
    public void startTheGame () {
        Character player1 = new Character();
        player1.selectType();
        creatingCharacter(player1);
    }

    public void creatingCharacter (Character player) {
        Scanner myObj = new Scanner(System.in);
        while (!firstSelection.equals("continue") && !firstSelection.equals("modify") && !firstSelection.equals("exit")){
            System.out.println("Would you like to continue, modify or exit?");
            this.firstSelection = myObj.nextLine();
        }
        if (firstSelection.equals("modify")){
            startTheGame();
        } else if (firstSelection.equals("continue")){
            System.out.println(player);
            System.out.println(" ");
            System.out.println("Welcome to Donjons & Dragons !");
        } else {
            exitGame();
        }
    }

    public void exitGame () {
        return;
    }

    public Menu(){

    }
}
