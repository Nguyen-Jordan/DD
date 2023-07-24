package fr.campus.DD.Character;

import fr.campus.DD.Equipment.DeffensiveEquipment.Potion;
import fr.campus.DD.Equipment.DeffensiveEquipment.Shield;
import fr.campus.DD.Equipment.OffensiveEquipment.Fate;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;
import fr.campus.DD.Menu.Menu;

public class Wizard extends Character{
    Menu menu;
    public Wizard (Menu menu, String name){
        super();
        this.menu = menu;
        this.setName(name);
        this.setOffensiveEquipment(new Fate("Tin Darkmoon Catalyst", 5, 25));
        this.setDeffensiveEquipment(new Potion("Small potion", 3, 5));

        String levelGame = menu.getDifficulty();

        if (levelGame.equals("easy")) {
            this.setForceAttack(15);
            this.setPointLife(60);
            this.setMaxLife(60);
        } else if (levelGame.equals("medium")) {
            this.setForceAttack(11);
            this.setPointLife(50);
            this.setMaxLife(50);
        } else {
            this.setForceAttack(8);
            this.setPointLife(40);
            this.setMaxLife(40);
        }
    }
}
