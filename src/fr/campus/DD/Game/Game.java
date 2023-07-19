package fr.campus.DD.Game;

import fr.campus.DD.Case.Case;
import fr.campus.DD.Case.EmptyCase;
import fr.campus.DD.Case.EnemyCase;
import fr.campus.DD.Case.ItemCase;
import fr.campus.DD.Character.Character;
import fr.campus.DD.Character.Enemies.Enemy;
import fr.campus.DD.Character.Warrior;
import fr.campus.DD.Character.Wizard;
import fr.campus.DD.Equipment.Item;
import fr.campus.DD.Exceptions.PersonnageHorsPlateauException;
import fr.campus.DD.Menu.Menu;
import fr.campus.DD.Utils.Image;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    Menu menu ;
    private Character player1;
    private Character player2;

    final static Case EMPTY = new EmptyCase();
    final static Case ENEMY = new EnemyCase();
    final static Case CHEST = new ItemCase();
    private ArrayList<Case> board = new ArrayList<>();
    private int positionP1 = 1;

    private int positionP2 = 1;

    public Game (){

    }

    public void mainMenu() {
        this.menu = new Menu(this);
        menu.showStartMenu();
    }

    // add position &&
    public void startTheGame(){
        Menu.slowPrint(player1.getName() + " on box 1 " + "/ " + board.size());
        if(player2 != null){
            Menu.slowPrint(player2.getName() + " on box 1 " + "/ " + board.size());
        }
        while (positionP1 < board.size() && positionP2 < board.size()){
            if (player2 == null){
                tryToMove(player1, positionP1);
            } else {
                new Scanner(System.in);  // Create a Scanner object
                Menu.slowPrint(player1.getName() + " is your turn to play ! \n");
                tryToMove(player1, positionP1);
                System.out.println(player2.getName() + " is your turn to play ! \n");
                tryToMove(player2, positionP2);
            }
        }
        isWin();
    }

    public void tryToMove (Character player, int position){
        try {
            position = movePosition(player, position);
        } catch (PersonnageHorsPlateauException e) {
            System.out.println(e.getMessage());
        }
    }

    public int movePosition (Character player, int position) throws PersonnageHorsPlateauException{
        int dice;
        Menu.delayedPrint(Image.get("Dice"));
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        Menu.slowPrint("Roll the dice ! \n");
        String userName = myObj.nextLine();
        dice = rollDice();
        printDice(dice);
        position += dice;

        if (position < 64) {
            Menu.slowPrint(player.getName() + " on box " + position + "/ " + board.size() );
        }else if (position == 64) {
            Menu.slowPrint(player.getName() + " on box " + 64 + " \n");
        }else {
            throw new PersonnageHorsPlateauException();
        }
        return position;
    }

    public int rollDice() {
        // generate number between 1 and 6
        Random r = new Random();
        return r.nextInt(6)+1;
    }

    public void printDice (int number) {
        switch (number) {
            case 1 -> Menu.delayedPrint(Image.get("Dice 1"));
            case 2 -> Menu.delayedPrint(Image.get("Dice 2"));
            case 3 -> Menu.delayedPrint(Image.get("Dice 3"));
            case 4 -> Menu.delayedPrint(Image.get("Dice 4"));
            case 5 -> Menu.delayedPrint(Image.get("Dice 5"));
            case 6 -> Menu.delayedPrint(Image.get("Dice 6"));
        }
    }
    public void isWin(){
        if(player2 == null){
            Menu.slowPrint("You win!");
        } else {
            if (positionP1 >= 64) {
                Menu.slowPrint(player1.getName() + " win!");
            } else {
                Menu.slowPrint(player2.getName() + " win!");
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
