package fr.campus.DD.Game;

import fr.campus.DD.Character.Enemies.Artorias;
import fr.campus.DD.Character.Enemies.Enemy;
import fr.campus.DD.Character.Enemies.IronDragonslayer;
import fr.campus.DD.DB.Database;
import fr.campus.DD.Equipment.DeffensiveEquipment.DeffensiveEquipment;
import fr.campus.DD.Equipment.Item;
import fr.campus.DD.Equipment.OffensiveEquipment.OffensiveEquipment;
import fr.campus.DD.Interface.Case;
import fr.campus.DD.Case.EmptyCase;
import fr.campus.DD.Case.EnemyCase;
import fr.campus.DD.Case.ItemCase;
import fr.campus.DD.Character.Character;
import fr.campus.DD.Character.Warrior;
import fr.campus.DD.Character.Wizard;
import fr.campus.DD.Exceptions.PersonnageHorsPlateauException;
import fr.campus.DD.Menu.Menu;
import fr.campus.DD.Utils.Image;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Game {

    Database database;
    Menu menu ;
    private Character player1;
    private Character player2;
    private ArrayList<Case> board = new ArrayList<>();
    private int positionP1 = 0;

    private int positionP2 = 0;
    int dice;

    public Game (){
    }

    public void mainMenu() {
        this.database = new Database();
        this.menu = new Menu(this, database);
        try {
            menu.showStartMenu();
        } catch (Exception e){
            System.out.println(e);
        } finally {
            try {
                this.database.getConn().close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    // add position &&
    public void startTheGame(){
        Menu.slowPrint(player1.getName() + " on box 1 " + "/ " + board.size());
        if(player2 != null){
            Menu.slowPrint(player2.getName() + " on box 1 " + "/ " + board.size());
        }
        while (positionP1 < board.size() && positionP2 < board.size()){
            if (player2 == null){
                this.positionP1 = tryToMove(player1, positionP1);
            } else {
                new Scanner(System.in);  // Create a Scanner object
                Menu.slowPrint(player1.getName() + " is your turn to play ! \n");
                this.positionP1 = tryToMove(player1, positionP1);
                System.out.println(player2.getName() + " is your turn to play ! \n");
                this.positionP2 = tryToMove(player2, positionP2);
            }
        }
        isWin();
    }

    public int tryToMove (Character player, int position){
        position = movePosition(player, position);
        Case casePosition = board.get(position);

        if (casePosition instanceof EnemyCase){
            fight((EnemyCase) casePosition, player);
        } else if (casePosition instanceof ItemCase){
            if (player instanceof Warrior){
                loot(((ItemCase) casePosition).getWarriorItem(), player);
            } else {
                loot(((ItemCase) casePosition).getWizardItem(), player);
            }
        } else {
            rest(player);
        }
        return position;
    }

    public void fight (EnemyCase enemyCase, Character player){
        Enemy enemy = enemyCase.getEnemy();
        System.out.println(enemy);
        menu.delayedPrint(player);
        while (enemy.getLifePoints() > 0 && player.getPointLife() > 0){
            enemyAttack(player, enemy);
            if (player.getPointLife() <= 0){
                menu.dieMenu(player);
            }
            playerAttack(player, enemy);
        }
        int playerMaxLife = player.getMaxLife();
        playerMaxLife += 10;
        player.setMaxLife(playerMaxLife);
        int playerForce = player.getForceAttack();
        playerForce += 10;
        player.setForceAttack(playerForce);
        if (player instanceof Warrior){
            loot(enemy.getWarriorItem(),player);
        } else {
            loot(enemy.getWizardItem(),player);
        }
    }

    public void enemyAttack (Character player, Enemy enemy) {
        Scanner myObj = new Scanner(System.in);
        menu.delayedPrint(enemy);
        int action = 0;
        while (action != 1 && action != 2) {
            System.out.println("Enemy will attack. What would you do:\n\t1. Defend\n\t2. Galipette");
            action = myObj.nextInt();
        }
        if (action == 1){
            defendAction(player, enemy);
        } else {
            galipetteAction(player,enemy);
        }

    }

    public void defendAction (Character player, Enemy enemy){
        int enemyAttack = enemy.getForceAttack();
        if (player instanceof Warrior){
            int playerLife = player.getPointLife() + player.getDeffensiveEquipment().getDefenceLevel();
            int damage = enemyAttack - player.getDeffensiveEquipment().getDefenceLevel();
            playerLife -= enemyAttack;
            player.setPointLife(playerLife);
            int shieldDurability = player.getDeffensiveEquipment().getDurability();
            shieldDurability --;
            player.getDeffensiveEquipment().setDurability(shieldDurability);
            menu.slowPrint("The enemy hit you. You got " + damage + " points of damage.");
            if (shieldDurability == 0){
                player.setDeffensiveEquipment(null);
                menu.slowPrint("Your shield it's broken. Choose a new shield from your backpack");
                menu.showBackpack(player);
            }
        } else {
            int playerLife = player.getPointLife();
            playerLife -= enemyAttack;
            player.setPointLife(playerLife);
            menu.slowPrint("The enemy hit you. You got " + enemyAttack + " points of damage.");
        }
    }

    public void galipetteAction(Character player, Enemy enemy){
        Scanner myObj = new Scanner(System.in);
        menu.slowPrint("You dodge the attack if you get between 4 and 6");
        String throwDice = myObj.nextLine();
        dice = rollDice();
        printDice(dice);
        if (dice < 4){
            int enemyAttack = enemy.getForceAttack();
            int playerLife = player.getPointLife();
            playerLife -= enemyAttack;
            player.setPointLife(playerLife);
            menu.slowPrint("You fail! You got " + enemyAttack + " points of damage.");
        } else {
            menu.slowPrint("You dodge the attack.");
        }
    }

    public void playerAttack(Character player, Enemy enemy){
        Scanner myObj = new Scanner(System.in);
        int action = 0;
        if (player instanceof Warrior){
            menu.delayedPrint(player);
            while (action != 1 && action != 2) {
                System.out.println("Player round:\n\t1. Attack\n\t2. Berserk attack (double damage)");
                action = myObj.nextInt();
            }
            if (action == 1){
                attackAction(player, enemy);
            } else {
                berserkAction(player,enemy);
            }
        } else {
            System.out.println(Image.get("Wizard")+ "\n");
            while (action != 1 && action != 2) {
                System.out.println("Player round:\n\t1. Attack\n\t2. Recover life");
                action = myObj.nextInt();
            }
            if (action == 1){
                attackAction(player, enemy);
            } else {
                recoverAction(player);
            }
        }

    }

    /**
     * Action on the function: this function manage the attack during the combat.
     * @param player : Player is the character who is playing at the moment
     * @param enemy : Enemy is the current enemy on the case
     *
     */
    public void attackAction(Character player, Enemy enemy) {
        int playerHit = player.getForceAttack() + player.getOffensiveEquipment().getAttackLevel();
        int enemyLife = enemy.getLifePoints();
        enemyLife -= playerHit;
        enemy.setLifePoints(enemyLife);
        int weaponDurability = player.getOffensiveEquipment().getDurability();
        weaponDurability --;
        player.getOffensiveEquipment().setDurability(weaponDurability);
        menu.slowPrint("You hit the enemy. The enemy got "+ playerHit + " points of attack");
        if (weaponDurability == 0){
            player.setOffensiveEquipment(null);
            menu.slowPrint("Your weapon it's broken. Choose a new weapon from your backpack");
            menu.showBackpack(player);
        }
    }

    public void berserkAction (Character player, Enemy enemy) {
        Scanner myObj = new Scanner(System.in);
        menu.slowPrint("You dodge the attack if you get between 5 and 6");
        String throwDice = myObj.nextLine();
        dice = rollDice();
        printDice(dice);
        if (dice >= 5){
            int berserAttack = player.getForceAttack() * 2;
            int enemyLife = enemy.getLifePoints();
            enemyLife -= berserAttack;
            enemy.setLifePoints(enemyLife);
            menu.slowPrint("You are on berserk mode and you hit the enemy. The enemy got " + berserAttack + " points of attack");
        } else {
            menu.slowPrint("You fail the attack.");
        }
    }

    public void recoverAction (Character player) {
        int maxLife = player.getMaxLife();
        int playerLife = player.getPointLife();
        int recoverPoint = player.getDeffensiveEquipment().getDefenceLevel();
        playerLife += recoverPoint;
        System.out.println(Image.get("Recover")+ "\n");
        if (playerLife > maxLife){
            player.setPointLife(maxLife);
            menu.slowPrint("You recover your full points of life");
        }
        player.setPointLife(playerLife);
        menu.slowPrint("You recover " + recoverPoint + " points of life");
    }

    public void loot (Item item, Character player){
        System.out.println(item);
        if (item instanceof DeffensiveEquipment ){
            player.getBackpack().addDefensiveEquipment((DeffensiveEquipment) item.clone());
        } else {
            player.getBackpack().addOffensiveEquipment((OffensiveEquipment) item.clone());
        }
        menu.slowPrint("Would you like to change your Equipment?");
        menu.showBackpack(player);
    }

    public void rest (Character player){
        player.setPointLife(player.getMaxLife());
        System.out.println(Image.get("Rest")+ " \n");
        menu.mainMenu();
    }

    public int movePosition (Character player, int position) {

        Menu.delayedPrint(Image.get("Dice"));
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        menu.slowPrint("Roll the dice ! \n");
        String userName = myObj.nextLine();
        dice = rollDice();
        printDice(dice);
        position += dice;
        if (position >= board.size()){
            position = board.size();
        }

        if (position < board.size()) {
            Menu.slowPrint(player.getName() + " on box " + position + "/ " + board.size() );
        }else {
            Menu.slowPrint(player.getName() + " on box " + board.size() + " \n");
            position = board.size();
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
        Menu.slowPrint("Congratulation. You win!!!");
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

    // add cases
    public void fillArray (){
        boolean notAgain = false;
        int nbEnemies = 6;
        int nbChest = 3;
        for (int position = 0; position < 30; position++ ){
            Random rand = new Random();
            int randInt = rand.nextInt(3);
            if (position % 12 == 0){
                nbEnemies = 6;
                nbChest = 3;
            }
            if (randInt == 0 && nbEnemies > 0 && !notAgain){
                Case enemy = new EnemyCase(position);
                nbEnemies --;
                board.add(enemy);
                notAgain = true;
            } else if (randInt == 1 && nbChest > 0){
                Case chest = new ItemCase(position);
                nbChest --;
                board.add(chest);
                notAgain = false;
            } else {
                Case empty = new EmptyCase();
                board.add(empty);
                notAgain = false;
            }
        }
        board.add(new EmptyCase());
        board.add(new EnemyCase(new Artorias()));
        board.add(new EmptyCase());
        board.add(new EnemyCase(new IronDragonslayer()));
    }

}
