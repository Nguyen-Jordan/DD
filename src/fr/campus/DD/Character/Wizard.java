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
        this.setOffensiveEquipment(new Fate("Tin Darkmoon Catalyst", 5));
        this.setDeffensiveEquipment(new Potion("Small potion", 2));

        String levelGame = menu.getDifficulty();

        if (levelGame.equals("easy")) {
            this.setForceAttack(15);
            this.setPointLife(6);
        } else if (levelGame.equals("medium")) {
            this.setForceAttack(11);
            this.setPointLife(5);
        } else {
            this.setForceAttack(8);
            this.setPointLife(3);
        }
    }
}
