package fr.campus.DD.Menu;

import com.sun.tools.javac.Main;
import fr.campus.DD.Character.Character;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import fr.campus.DD.DB.Database;
import fr.campus.DD.Equipment.DeffensiveEquipment.DeffensiveEquipment;
import fr.campus.DD.Equipment.Item;
import fr.campus.DD.Equipment.OffensiveEquipment.OffensiveEquipment;
import fr.campus.DD.Game.Game;
import fr.campus.DD.Utils.Image;

public class Menu {
    Database database;
    Game newGame;
    private String difficulty = "";
    private String firstSelection = "";


    public Menu(Game game, Database database){
        this.newGame = game;
        this.database = database;
    }

    public void createCharacter(){
        Scanner myObj = new Scanner(System.in);
        slowPrint("How many player? 1 or 2");
        int numberOfPlayer = myObj.nextInt();

        if (numberOfPlayer == 1){
            newGame.addPlayer1(addName(), addType());
            database.insertCharacter(newGame.getPlayer1());
            afterCreatingCharacter();
        } else if (numberOfPlayer == 2){
            newGame.addPlayer1(addName(), addType());
            database.insertCharacter(newGame.getPlayer1());
            newGame.addPlayer2(addName(), addType());
            database.insertCharacter(newGame.getPlayer2());
            afterCreatingCharacter();
        } else {
            exitGame();
        }
    }
    public String addType (){
        Scanner console2 = new Scanner(System.in);
        String characterType = "";
        while (!characterType.equals("warrior") && !characterType.equals("wizard")) {
            slowPrint("warrior or wizard? Enter your type:");
            characterType = console2.nextLine();
        }
        return characterType;
    }
    public String addName (){
        Scanner console1 = new Scanner(System.in);
        slowPrint("Enter a name for your character:");
        return console1.nextLine();
    }
    public void afterCreatingCharacter () {
        Scanner myObj = new Scanner(System.in);
        while (!firstSelection.equals("continue") && !firstSelection.equals("modify") && !firstSelection.equals("exit")){
            slowPrint("Would you like to continue, modify or exit?");
            this.firstSelection = myObj.nextLine();
        }
        if (firstSelection.equals("modify")){
            createCharacter();
        } else if (firstSelection.equals("continue")){
            printCharacter(newGame.getPlayer1());
            if (newGame.getPlayer2() != null){
                printCharacter(newGame.getPlayer2());
            }
            newGame.startTheGame();
        } else {
            exitGame();
        }
    }

    public void printCharacter (Character character) {
        delayedPrint(character);
        delayedPrint(character.getOffensiveEquipment());
        delayedPrint(character.getDeffensiveEquipment());
    }


    public void playAgain(){

        Scanner myObj = new Scanner(System.in);
        slowPrint("\n Would you like to play again? yes or no");
        String userName = myObj.nextLine();
        if (userName.equals("yes")){
            new Game().mainMenu();
        } else {
            System.exit(0);

        }
    }

    public void exitGame () {
        slowPrint("Game over !");
        playAgain();
    }

    public void mainMenu(){

        Scanner console1 = new Scanner(System.in);
        int input = 0;
        while (input != 1 && input != 2 && input !=3){
            slowPrint("MENU \n\t1.continue.\n\t2.Show players status\n\t3.Show backpack\n\t4.Exit");
            input = console1.nextInt();
        }
        if(input == 4){
            exitGame();
        }else if (input == 3){
            if (newGame.getPlayer2() != null){
                slowPrint("1. Player 1\n2. Player 2");
                int character = console1.nextInt();
                if (character == 1){
                    showBackpack(newGame.getPlayer1());
                } else {
                    showBackpack(newGame.getPlayer2());
                }
            } else {
                showBackpack(newGame.getPlayer1());
            }

        }else if (input == 2){
            if (newGame.getPlayer2() == null){
                printCharacter(newGame.getPlayer1());
            } else {
                printCharacter(newGame.getPlayer1());
                printCharacter(newGame.getPlayer2());
            }
            mainMenu();
        }
    }

    public void showBackpack (Character player){
       ArrayList <DeffensiveEquipment> defensivelist = player.getBackpack().getDefensiveList();
       slowPrint("Defensive Equipment");
       int i;
       for (i=0 ; i < defensivelist.size(); i++){
           delayedPrint("D."+ (i+1)+ ". \n"+ defensivelist.get(i) + "\n");
       }
        ArrayList <OffensiveEquipment> offensivelist = player.getBackpack().getOffensiveList();
        slowPrint("Offensive Equipment");
        int j;
        for (j=0; j < offensivelist.size(); j++){
            delayedPrint("A."+(j+1)+ ". \n"+ offensivelist.get(j) + "\n");
        }
        Scanner console1 = new Scanner(System.in);
        int choose = 0;
        while (choose != 1 && choose!=2){
            slowPrint("1. Back to main menu\n2. Replace equipment");
            choose = console1.nextInt();
        }
        if (choose == 1){
            mainMenu();
        } else {
            replaceEquipment(player);
        }
    }


    public void replaceEquipment (Character player){
        ArrayList <DeffensiveEquipment> defensivelist = player.getBackpack().getDefensiveList();
        ArrayList <OffensiveEquipment> offensivelist = player.getBackpack().getOffensiveList();

        Scanner console1 = new Scanner(System.in);
        boolean valid = false;
        while (!valid){
            slowPrint("Choose by Letter and number (ex:D.1)");
            String input = console1.nextLine();
            String index = input.substring(2,input.length());
            int indexValue = Integer.parseInt(index) -1;
            if (input.startsWith("A")){
                if (indexValue >= 0 && indexValue < offensivelist.size()){
                    OffensiveEquipment newEquipment = offensivelist.get(indexValue);
                    offensivelist.remove(indexValue);
                    if (player.getOffensiveEquipment() != null) {
                        offensivelist.add(player.getOffensiveEquipment());
                    }
                    player.setOffensiveEquipment(newEquipment);
                    valid = true;
                }
            }else if (input.startsWith("D")) {
                if (indexValue >= 0 && indexValue < defensivelist.size()) {
                    DeffensiveEquipment newEquipment = defensivelist.get(indexValue);
                    defensivelist.remove(indexValue);
                    defensivelist.add(player.getDeffensiveEquipment());
                    if (player.getDeffensiveEquipment() != null) {
                        defensivelist.add(player.getDeffensiveEquipment());
                    }
                    player.setDeffensiveEquipment(newEquipment);
                    valid = true;
                }
            }
        }
    }

    public void showStartMenu() {
        System.out.println(Image.get("welcome")+ " \n");
        Scanner console1 = new Scanner(System.in);
        slowPrint("Start a new game (start)");
        String start = console1.nextLine();

        if (start.equals("start")){
            Scanner console2 = new Scanner(System.in);
            newGame.fillArray();
            while (!difficulty.equals("easy") && !difficulty.equals("medium") && !difficulty.equals("hard")){
                slowPrint("Select you difficulty of the game: easy, medium or hard");
                this.difficulty = console2.nextLine();
            }
            createCharacter();

        } else {
            exitGame();
        }
    }

    public void dieMenu(Character player){
        System.out.println(Image.get("Die")+ " \n"+player.getName()+ " died");
        exitGame();
    }

    public String getDifficulty() {
        return difficulty;
    }

    public static void slowPrint(String output) {
        for (int i = 0; i<output.length(); i++) {
            char c = output.charAt(i);
            System.out.print(c);
            try {
                TimeUnit.MILLISECONDS.sleep(0);
            }
            catch (Exception e) {

            }
        }
        System.out.println("\n");
    }

    public static void delayedPrint(Object message){
        try {
            System.out.println(message + " \n");

            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

