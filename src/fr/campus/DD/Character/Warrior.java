package fr.campus.DD.Character;

import fr.campus.DD.Equipment.DeffensiveEquipment.Shield;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;
import fr.campus.DD.Menu.Menu;
import fr.campus.DD.Utils.Image;

public class Warrior extends Character{
    Menu menu;
    public Warrior (Menu menu, String name){
        super();
        this.menu = menu;
        this.setName(name);
        this.setOffensiveEquipment(new Weapon("Abyss Greatsword", 5, 25));
        this.setDeffensiveEquipment(new Shield("Small Leather Shield", 2,25));
        String levelGame = menu.getDifficulty();

        if (levelGame.equals("easy")) {
            this.setForceAttack(10);
            this.setPointLife(100);
            this.setMaxLife(100);
        } else if (levelGame.equals("medium")) {
            this.setForceAttack(7);
            this.setPointLife(70);
            this.setMaxLife(70);
        } else {
            this.setForceAttack(5);
            this.setPointLife(50);
            this.setMaxLife(50);
        }
    }

}
