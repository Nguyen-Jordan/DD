package fr.campus.DD.Game;

import fr.campus.DD.Character.Character;
import fr.campus.DD.Character.Warrior;
import fr.campus.DD.Character.Wizard;
import fr.campus.DD.Equipment.DeffensiveEquipment.DeffensiveEquipment;
import fr.campus.DD.Equipment.OffensiveEquipment.OffensiveEquipment;
import fr.campus.DD.Menu.Menu;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Menu menu ;
    private Character player1;
    private Character player2;
    private final int[] board = new int[64];
    private int positionP1 = 1;

    private int positionP2 = 1;

    public Game (){

    }

    public void mainMenu() {
        this.menu = new Menu(this);
        menu.showMainMenu();
    }

    // add position &&
    public void startTheGame(){
        System.out.println(player1.getName() + " on box 1 " + "/ " + board.length);
        if(player2 != null){
            System.out.println(player2.getName() + " on box 1 " + "/ " + board.length);
        }
        while (positionP1 < board.length && positionP2 < board.length){
            if (player2 == null){
                positionP1 = movePosition(player1, positionP1);

            } else {
                new Scanner(System.in);  // Create a Scanner object
                System.out.println(player1.getName()+ " is your turn to play ! \n");
                positionP1 = movePosition(player1, positionP1);
                System.out.println(player2.getName()+ " is your turn to play ! \n");
                positionP2 = movePosition(player2, positionP2);
            }
        }
        isWin();
    }

    public int movePosition (Character player, int position){
        int dice;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Roll the dice ! \n");
        String userName = myObj.nextLine();
        dice = rollDice();
        position += dice;
        if (position < 64) {
            System.out.println(player.getName() + " on box " + position + "/ " + board.length );
        } else {
            System.out.println(player.getName() + " on box " + 64 + " \n");
        }
        return position;
    }

    public int rollDice() {
        // generate number between 1 and 6
        Random r = new Random();
        return r.nextInt(6)+1;
    }

    public void isWin(){
        if(player2 == null){
            System.out.println("You win!");
        } else {
            if (positionP1 >= 64) {
                System.out.println(player1.getName() + " win!");
            } else {
                System.out.println(player2.getName() + " win!");
            }
        }
        menu.playAgain();
    }
    //  add player

    public void addPlayer1 (String name, String type){
        this.player1 = addCharacter(name, type);
    }

    public void addPlayer2 (String name, String type){
        this.player2 = addCharacter(name, type);
    }

    public Character addCharacter (String name, String type) {
        if (type.equals("warrior")){
            return new Warrior(this.menu,name);
        } else {
            return new Wizard(this.menu,name);
        }
    }

    public Character getPlayer1() {
        return player1;
    }

    public Character getPlayer2() {
        return player2;
    }
}
