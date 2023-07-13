package fr.campus.DD.Game;

import fr.campus.DD.Character.Character;
import fr.campus.DD.Equipment.DeffensiveEquipment;
import fr.campus.DD.Equipment.OffensiveEquipment;
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
        Character player = new Character();
        player.setName(name);
        player.setType(type);

        selectLevelGame(player);

        if (type.equals("warrior")){
            player.setOffensiveEquipment(new OffensiveEquipment("weapon", 1, "sword"));
            player.setDeffensiveEquipment(new DeffensiveEquipment("shield", 1, "wooden shield"));
        }
        if (type.equals("wizard")) {
            player.setOffensiveEquipment(new OffensiveEquipment("fate", 5, "magic root"));
            player.setDeffensiveEquipment(new DeffensiveEquipment("potion", 2, "standard potion"));
        }
        return player;
    }

    public void selectLevelGame(Character player){
        String levelGame = menu.getDifficulty();
        if (levelGame.equals("easy")) {
            if(player.getType().equals("warrior")){
                player.setForceAttack(10);
                player.setPointLife(10);
            }
            if(player.getType().equals("wizard")){
                player.setForceAttack(15);
                player.setPointLife(6);
            }
        } else if (levelGame.equals("medium")) {
            if(player.getType().equals("warrior")){
                player.setForceAttack(7);
                player.setPointLife(7);
            }
            if(player.getType().equals("wizard")){
                player.setForceAttack(11);
                player.setPointLife(5);
            }
        } else {
            if(player.getType().equals("warrior")){
                player.setForceAttack(5);
                player.setPointLife(5);
            }
            if(player.getType().equals("wizard")){
                player.setForceAttack(8);
                player.setPointLife(3);
            }
        }
    }

    public Character getPlayer1() {
        return player1;
    }

    public Character getPlayer2() {
        return player2;
    }
}
