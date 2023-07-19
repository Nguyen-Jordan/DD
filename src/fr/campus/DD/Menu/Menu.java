package fr.campus.DD.Menu;

import fr.campus.DD.Character.Character;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import fr.campus.DD.Game.Game;
import fr.campus.DD.Utils.Image;

public class Menu {

    Game newGame;
    private String difficulty = "";
    private String firstSelection = "";


    public Menu(Game game){
        this.newGame = game;
    }

    public void createCharacter(){
        Scanner myObj = new Scanner(System.in);
        slowPrint("How many player? 1 or 2");
        int numberOfPlayer = myObj.nextInt();

        if (numberOfPlayer == 1){
            newGame.addPlayer1(addName(), addType());
            afterCreatingCharacter();
        } else if (numberOfPlayer == 2){
            newGame.addPlayer1(addName(), addType());
            newGame.addPlayer2(addName(), addType());
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

    public static void delayedPrint(Object message){
        try {
            System.out.println(message + " \n");

            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void playAgain(){

        Scanner myObj = new Scanner(System.in);
        slowPrint("\n Would you like to play again? yes or no");
        String userName = myObj.nextLine();
        if (userName.equals("yes")){
            newGame.mainMenu();
        } else {
            exitGame();
        }
    }

    public void exitGame () {
        slowPrint("Game over !");
        return;
    }

    public void mainMenu(){

        Scanner console1 = new Scanner(System.in);
        int input = 0;
        while (input != 1 && input != 2 && input !=3){
            slowPrint("MENU \n\t1.continue.\n\t2.Show players status\n\t3.Exit");
            input = console1.nextInt();
        }
        if(input == 3){
            exitGame();
        } else if (input == 2){
            if (newGame.getPlayer2() == null){
                printCharacter(newGame.getPlayer1());
            } else {
                printCharacter(newGame.getPlayer1());
                printCharacter(newGame.getPlayer2());
            }
            mainMenu();
        } else {
            slowPrint("We are working on it");
        }
    }

    public void showStartMenu() {

        System.out.println(Image.get("welcome")+ " \n");
        Scanner console1 = new Scanner(System.in);
        slowPrint("Start a new game (start)");
        String start = console1.nextLine();

        if (start.equals("start")){
            Scanner console2 = new Scanner(System.in);

            while (!difficulty.equals("easy") && !difficulty.equals("medium") && !difficulty.equals("hard")){
                slowPrint("Select you difficulty of the game: easy, medium or hard");
                this.difficulty = console2.nextLine();
            }
            createCharacter();

        } else {
            exitGame();
        }
    }

    public String getDifficulty() {
        return difficulty;
    }

    public static void slowPrint(String output) {
        for (int i = 0; i<output.length(); i++) {
            char c = output.charAt(i);
            System.out.println(c);
            try {
                TimeUnit.MILLISECONDS.sleep(45);
            }
            catch (Exception e) {

            }
        }
    }
}
