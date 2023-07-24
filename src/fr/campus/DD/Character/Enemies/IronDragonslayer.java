package fr.campus.DD.Character.Enemies;

import fr.campus.DD.Equipment.DeffensiveEquipment.Potion;
import fr.campus.DD.Equipment.DeffensiveEquipment.Shield;
import fr.campus.DD.Equipment.OffensiveEquipment.Fate;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;

import java.util.Random;

public class IronDragonslayer extends Enemy{

    public IronDragonslayer () {
        super();
        setName("Iron Dragonslayer");
        setLifePoints(450);
        setForceAttack(40);
        randomItem();
    }

    public void randomItem () {
        Random rand = new Random();
        int randInt = rand.nextInt(2);

        if (randInt == 0){
            setWarriorItem(new Weapon("Obsidian Greatsword", 20, 5));
            setWizardItem(new Fate("Great Chaos Fireball", 20, 5));
        } else {
            setWarriorItem(new Shield("Cleansing Greatshield", 15, 8));
            setWizardItem(new Potion("Cure", 13, 8));
        }
    }
}
