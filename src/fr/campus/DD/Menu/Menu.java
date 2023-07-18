package fr.campus.DD.Menu;

import java.util.Scanner;

import fr.campus.DD.Character.Warrior;
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
        System.out.println("How many player? 1 or 2");
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
            System.out.println("warrior or wizard? Enter your type:");
            characterType = console2.nextLine();
        }
        return characterType;
    }
    public String addName (){
        Scanner console1 = new Scanner(System.in);
        System.out.println("Enter a name for your character:");
        return console1.nextLine();
    }
    public void afterCreatingCharacter () {
        Scanner myObj = new Scanner(System.in);
        while (!firstSelection.equals("continue") && !firstSelection.equals("modify") && !firstSelection.equals("exit")){
            System.out.println("Would you like to continue, modify or exit?");
            this.firstSelection = myObj.nextLine();
        }
        if (firstSelection.equals("modify")){
            createCharacter();
        } else if (firstSelection.equals("continue")){
            System.out.println(newGame.getPlayer1() + " \n");
            System.out.println(newGame.getPlayer1().getOffensiveEquipment() + " \n");
            System.out.println(newGame.getPlayer1().getDeffensiveEquipment() + " \n");
            if (newGame.getPlayer2() != null){
                System.out.println(newGame.getPlayer2() + " \n");
                System.out.println(newGame.getPlayer2().getOffensiveEquipment() + " \n");
                System.out.println(newGame.getPlayer2().getDeffensiveEquipment() + " \n");
            }
            newGame.startTheGame();
        } else {
            exitGame();
        }
    }

    public void playAgain(){

        Scanner myObj = new Scanner(System.in);
        System.out.println("\n Would you like to play again? yes or no");
        String userName = myObj.nextLine();
        if (userName.equals("yes")){
            newGame.mainMenu();
        } else {
            exitGame();
        }
    }

    public void exitGame () {
        System.out.println("Game over !");
        return;
    }

    public void showMainMenu () {

        System.out.println(Image.get("welcome")+ " \n");
        Scanner console1 = new Scanner(System.in);
        System.out.println("Start a new game (start)");
        String start = console1.nextLine();

        if (start.equals("start")){
            Scanner console2 = new Scanner(System.in);

            while (!difficulty.equals("easy") && !difficulty.equals("medium") && !difficulty.equals("hard")){
                System.out.println("Select you difficulty of the game: easy, medium or hard");
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
}
